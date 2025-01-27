package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparator implements Comparator<Contacto> {
    @Override
    public int compare(Contacto c1, Contacto c2) {
        // primero commparamos apellidos
        int comparacionApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());
        int comparacionNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());

        if (comparacionApellido != 0) {
            return comparacionApellido;
        } else if (comparacionNombre != 0) {
            return comparacionNombre;
        } else {
            return c1.getTelefono().compareTo(c2.getTelefono());
        }        
    }
}
