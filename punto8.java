public class AsignacionConsolas {

    public static class Consola {
        private String codigo;
        private String descripcion;

        public Consola(String codigo, String descripcion) {
            this.codigo = codigo;
            this.descripcion = descripcion;
        }

        public String getCodigo() { return codigo; }
    }

    public static class Solicitud {
        private String nombreTienda;
        private int cantidadSolicitada;

        public Solicitud(String nombreTienda, int cantidadSolicitada) {
            this.nombreTienda = nombreTienda;
            this.cantidadSolicitada = cantidadSolicitada;
        }

        public String getNombreTienda() { return nombreTienda; }
        public int getCantidadSolicitada() { return cantidadSolicitada; }
    }
    public static class Asignacion {
        private String tienda;
        private String codigoConsola;

        public Asignacion(String tienda, String codigoConsola) {
            this.tienda = tienda;
            this.codigoConsola = codigoConsola;
        }

        @Override
        public String toString() {
            return "Tienda: " + tienda + " | Consola Asignada: " + codigoConsola;
        }
    }

    public static Cola procesarAsignaciones(Cola almacénConsolas, Cola solicitudes) {
        Cola listaAsignaciones = new Cola();

        while (!solicitudes.estaVacia() && !almacénConsolas.estaVacia()) {
            Solicitud sol = (Solicitud) solicitudes.tomar();
            solicitudes.eliminar();

            for (int i = 0; i < sol.getCantidadSolicitada(); i++) {
                if (!almacénConsolas.estaVacia()) {
                    Consola cons = (Consola) almacénConsolas.tomar();
                    almacénConsolas.eliminar();
                    listaAsignaciones.agregar(new Asignacion(sol.getNombreTienda(), cons.getCodigo()));
                } else {
                    System.out.println("Consolas agotadas para completar la solicitud de: " + sol.getNombreTienda());
                    break;
                }
            }
        }
        return listaAsignaciones;
    }
}