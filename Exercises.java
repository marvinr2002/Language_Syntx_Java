import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Exercises {
    /**
     * @param args
     */
    public static void main(String[] args){

         // 1. Crea un Array con 5 valores e imprime su longitud.

            int Array [] = new int[5];
            System.out.println(Array.length);
            Array[0] = 25;
            Array[1] = 24;
            Array[2] = 34;
        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.

        System.out.println(Array[0]);
        Array[0] = 100;
        System.out.println(Array[0]);

        // 3. Crea un ArrayList vacío

        ArrayList<String> namesForExperience = new ArrayList<>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.


        namesForExperience.add("Marvin");
        namesForExperience.add("Luis");
        namesForExperience.add("Marco");
        namesForExperience.add("Norman");

        System.out.println(namesForExperience.get(0));
        for (String names: namesForExperience){
            System.out.println(names);
        }
        // 5. Crea un HashSet con 2 valores diferentes.

        HashSet<String> namesForProcesses = new HashSet<>();

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.

        namesForProcesses.add("Marco Aurelio");
        namesForProcesses.add("Aurel Casillas");
        System.out.println(namesForProcesses.size());
        // 7. Elimina uno de los elementos del HashSet.

        namesForProcesses.remove("Marco Aurelio");
        System.out.println(namesForProcesses);
        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.

        HashMap<String, Integer> Ages = new HashMap<>();
        Ages.put("Marvin", 25);
        Ages.put("Luis", 28);
        Ages.put("Marcelo", 30);
        System.out.println(Ages.size());
        System.out.println(Ages);
        for (int Nums = 0; Nums < Ages.size(); Nums++){
         }
        // 9. Modifica uno de los contactos y elimina otro.

        Ages.replace("Marvin", 23);
        System.out.println(Ages);
        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un
        // HashSet y finalmente en un HashMap con clave y valor iguales.

        Integer  Library[] = new int[5];
        ArrayList<Integer> LibraryList = new ArrayList<>(Arrays.asList(int [5] ,Library));
    }

}
