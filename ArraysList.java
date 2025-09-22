import java.util.ArrayList;
public class ArraysList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
            // Denotation / creation
        var number = new ArrayList<Integer>();
        // Add elements
        // Size
        // Getters and setters ________ ???
        System.out.println(names.size());
        names.size();
        names.add("Marvin");
        names.add("Ruiz");
        names.add("Rojas");
        System.out.println(names.size());
        // check elements
        System.out.println(names.get(1));
// Dynamic List - ArraysList
        names.set(2, "Marvin@gmail.com");
        System.out.println(names.getLast());
        System.out.println(names.size());
        names.remove(2);
        System.out.println(names.getLast());
        System.out.println(names.size());

        System.out.println(names.contains("Marvin"));

        // Limpiar Array List
        System.out.println(names);
        names.add("Marvin");
        System.out.println(names);
        names.clear();
        System.out.println(names.size());

    }
}