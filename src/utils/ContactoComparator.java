package utils;

import models.Contacto;

public class ContactoComparator {
    public int compare(Contacto contacto1, Contacto contacto2) {

        if (contacto1.getNombre().compareTo(contacto2.getNombre()) == 0) {

            if (contacto1.getApellido().compareTo(contacto2.getApellido()) == 0) {
                return contacto1.getTelefono().compareTo(contacto2.getTelefono());
            }

            return contacto1.getApellido().compareTo(contacto2.getApellido());
        }
        
        return contacto1.getNombre().compareTo(contacto2.getNombre());
    }
}
