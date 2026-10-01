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