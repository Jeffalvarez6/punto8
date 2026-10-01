┌────────────────────────────────────────────────────────────────────────┐
│                          AsignacionConsolas                            │
├────────────────────────────────────────────────────────────────────────┤
├────────────────────────────────────────────────────────────────────────┤
│ + procesarAsignaciones(almacénConsolas: Cola,                           │
│                        solicitudes: Cola): Cola {static}               │
└───────────────┬───────────────────┬───────────────────┬────────────────┘
                │                   │                   │
  contiene (nested)   contiene (nested)   contiene (nested)
                │                   │                   │
                ▼                   ▼                   ▼
┌───────────────────────────┐ ┌───────────────────────────┐ ┌───────────────────────────┐
│  AsignacionConsolas.      │ │  AsignacionConsolas.      │ │  AsignacionConsolas.      │
│  Consola                  │ │  Solicitud                │ │  Asignacion               │
├───────────────────────────┤ ├───────────────────────────┤ ├───────────────────────────┤
│ - codigo: String          │ │ - nombreTienda: String    │ │ - tienda: String          │
│ - descripcion: String     │ │ - cantidadSolicitada: int │ │ - codigoConsola: String   │
├───────────────────────────┤ ├───────────────────────────┤ ├───────────────────────────┤
│ + Consola(codigo, desc)   │ │ + Solicitud(nombre, cant) │ │ + Asignacion(tienda, cod) │
│ + getCodigo(): String     │ │ + getNombreTienda(): String││ + toString(): String      │
└───────────────────────────┘ │ + getCantidadSolicitada() │ └───────────────────────────┘
                              └───────────────────────────┘
                                            │
                                            │ depende de (usa)
                                            ▼
                                ┌───────────────────────────┐
                                │           Cola            │
                                ├───────────────────────────┤
                                │ # inicio: Nodo            │
                                │ # fin: Nodo               │
                                │ # nDatos: int             │
                                ├───────────────────────────┤
                                │ + estaVacia(): boolean    │
                                │ + agregar(elem: Object)   │
                                │ + eliminar(): void        │
                                │ + tomar(): Object         │
                                └───────────────────────────┘
