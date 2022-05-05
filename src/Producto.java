public class Producto {
    private String nombre;
    private float precio;

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Precio: " + precio;
    }
}
