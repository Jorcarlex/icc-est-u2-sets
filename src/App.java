
import java.util.Set;

public class App {

    public static void main(String[] args) {
        runHashSet();
        runLinkedHashSet();
        runTreeSet();
        runTreeSetConComparator();
    }

    public static void runHashSet() {

        // Ejemplo de HashSet
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirHashSet();

        System.out.println("------ HashSet -----\n");
        System.out.println("Elementos del HashSet (no se garantiza orden): ");

        for (String elemento : ejemploHashSet) {
            System.out.println(elemento);
        }
    }

    public static void runLinkedHashSet() {

        // Ejemplo de LinkedHashSet
        Sets sets = new Sets();
        Set<String> ejemploLinkedHashSet = sets.construirLinkedHashSet();

        System.out.println("\n------ LinkedHashSet -----\n");
        System.out.println("Elementos del LinkedHashSet (orden de inserción): ");

        for (String elemento : ejemploLinkedHashSet) {
            System.out.println(elemento);
        }
    }

    public static void runTreeSet() {

        // Ejemplo de TreeSet
        Sets sets = new Sets();
        Set<String> ejemploTreeSet = sets.construirTreeSet();

        System.out.println("\n------ TreeSet -----\n");
        System.out.println("Elementos del TreeSet (orden alfabetico): ");

        for (String elemento : ejemploTreeSet) {
            System.out.println(elemento);
        }
    }

    public static void runTreeSetConComparator() {

        // Ejemplo de TreeSet con Comparator
        Sets sets = new Sets();
        Set<String> ejemploTreeSetConComparator = sets.construirTreeSetConComparator();

        System.out.println("\n------ TreeSet con Comparator -----\n");
        System.out.println("Elementos del TreeSet con Comparator (orden de longitud y alfabeticamente): ");

        for (String elemento : ejemploTreeSetConComparator) {
            System.out.println(elemento);
        }
    }
}
