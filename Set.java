import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Set {
    public static void main(String[] args){
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();
        // Size
        System.out.println(names.size());
        // Add elements
        names.add("Marvin");
        names.add("Ruiz");
        names.add("Rojas");
        System.out.println(names.size());
        System.out.println(names);
        // Search for elements
        System.out.println(names.contains("Marvin"));
        // Delete elements?
        names.remove(4);
        System.out.println(names);
        names.remove("Marvin");
        System.out.println(names);

        // No multi-elements
        names.add("Marvin");
        names.add("Marvin");
        names.add("Marvin");
        System.out.println(names);
        var countries = new HashSet<String>();
        countries.add("Nicaragua");
        countries.add("Mexico");
        System.out.println(countries);
        names.addAll(countries);
        System.out.println(names);
        for (String i :  names ){
            System.out.println(i);
        }
        names.removeAll(countries);
        System.out.println(names);
    }
}
