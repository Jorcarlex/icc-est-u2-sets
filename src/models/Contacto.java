package models;

public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;

    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String toString() {
        return nombre + " " + apellido + " - " + telefono;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Contacto contacto = (Contacto) obj;

        return this.nombre.equals(contacto.getNombre()) && this.apellido.equals(contacto.getApellido())
                && this.telefono.equals(contacto.getTelefono());
    }

    public int hashCode() {
        return nombre.hashCode() + apellido.hashCode() + telefono.hashCode();
    }
}
