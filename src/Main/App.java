package Main;

import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;

public class App {
    public static void main(String[] args) {
        runEjercicio();
    }

    public static void runEjercicio() {
        /*
         * Contacto c1 = new Contacto("Pedro", "Lopez", "123456789");
         * Contacto c2 = new Contacto("Pedro", "Lopez", "123456789");
         * 
         * System.out.println(c1);
         * System.out.println(c2);
         * 
         * System.out.println("Referencia en memoria: ");
         * boolean comparacionReferencia = c1 == c2;
         * System.out.println(comparacionReferencia);
         * System.out.println("c1: " + c1 + " == c2: " + c2 + " = " +
         * comparacionReferencia);
         * 
         * System.out.println("Comparacion con equals: ");
         * System.out.println(c1.equals(c2));
         * boolean comparacionEquals = c1.equals(c2);
         * System.out.println(comparacionEquals);
         * System.out.println("c1: " + c1 + " == c2: " + c2 + " = " +
         * comparacionEquals);
         * 
         * System.out.println("Comparacion con hashCode: ");
         * boolean comparacionHashCode = +c1.hashCode() == c2.hashCode();
         * System.out.println(comparacionHashCode);
         * System.out.println("c1: " + c1.hashCode() + " == c2: " + c2.hashCode() +
         * " = " + comparacionHashCode);
         */

        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());

        // Agregamos algunos contactos
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        // Este ultimo " Pedro Lopez" tiene un telefono diferente,
        // pero equals() lo considera duplicado, por lo que NO se agrega a la agenda

        // imprimir la agenda
        System.out.println("Contactos en la agenda: ");
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
    }
}
