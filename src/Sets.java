import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public Set<String> construirHashSet() {
        // Construir un HashSet
        // HashSet no garantiza el orden de los elementos y es en formato de lista

        Set<String> miHashSet = new HashSet<>();

        miHashSet.add("Banana");
        miHashSet.add("Pera");
        miHashSet.add("Uva");
        miHashSet.add("Mango");
        miHashSet.add("Pera"); // Los elementos duplicados no se agregan a un HashSet

        return miHashSet;

    }

    public Set<String> construirLinkedHashSet() {
        // Construir un LinkedHashSet
        // LinkedHashSet garantiza el orden de inserción de los elementos
        // osea que va por orden de llegada

        Set<String> miLinkedHashSet = new LinkedHashSet<>();

        miLinkedHashSet.add("Banana");
        miLinkedHashSet.add("Pera");
        miLinkedHashSet.add("Uva");
        miLinkedHashSet.add("Mango");
        miLinkedHashSet.add("Pera"); // Los elementos duplicados no se agregan a un LinkedHashSet

        return miLinkedHashSet;

    }

    public Set<String> construirTreeSet() {
        // Construir un TreeSet
        // Es en formato de árbol y los elementos se ordenan alfabéticamente,
        // son de arbol AVL se caracteriza por ser un arbol binario balanceado
        // se equilibra automaticamente

        Set<String> miTreeSet = new TreeSet<>();

        miTreeSet.add("Banana");
        miTreeSet.add("Pera");
        miTreeSet.add("Uva");
        miTreeSet.add("Mango");
        miTreeSet.add("Pera"); // Los elementos duplicados no se agregan a un TreeSet

        return miTreeSet;
    }

    public Set<String> construirTreeSetConComparator() {
        // Construir un TreeSet con un Comparator

        // Implementar un Comparator para ordenar por longitud y luego por orden
        // alfabetico
        Comparator<String> comparadorPorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {

                // primero comparar por longitud
                int resultado = Integer.compare(s1.length(), s2.length());

                // si tiene la misma longitud, comparar por orden alfabetico
                if (resultado == 0) {
                    resultado = s1.compareTo(s2);
                }
                return resultado;
            }
        };

        Set<String> miTreeSetConComparator = new TreeSet<>(comparadorPorLongitud);

        miTreeSetConComparator.add("Melon");
        miTreeSetConComparator.add("Pera");
        miTreeSetConComparator.add("Manzana");
        miTreeSetConComparator.add("Fresa");
        miTreeSetConComparator.add("Kiwi");
        miTreeSetConComparator.add("Melocoton");
        miTreeSetConComparator.add("Pera"); // Los elementos duplicados no se agregan a un TreeSet

        return miTreeSetConComparator;
    }
}
