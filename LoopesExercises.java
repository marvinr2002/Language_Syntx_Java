import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopesExercises {
    public static void main(String[] args){

        // 1. Imprime los números del 1 al 10 usando while.
        int number = 0;
        while(number < 11){
            System.out.println(number);
            number++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<String> names = new ArrayList<>();
        names.add("Example1");
        names.add("Example2");
        names.add("Example3");
        int index = 0;
        do{ 
        System.out.println(names.get(index));
        index++;
        }   while (index < names.size()); {}

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (int i = 0 ; i < 51; i+= 5){
            System.out.println(i);
        }
        System.out.println("====Guineo====");

        // 4. Recorre un Array de 5 números e imprime la suma total.
        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        /* 
        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 5;
        numbers[2] = 6;
        numbers[3] = 7;
        numbers[4] = 8;
        */
        int [] numbers = {4,5,6,7,8};
        int  sum_total = 0;
            for (int i = 0; i < numbers.length ; i++ ){
                sum_total += numbers[i];
                System.out.println(numbers[i]);  
        }
        System.out.println(sum_total);
        


        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        System.out.println("==========================");

        HashSet<String> emails = new HashSet<>();

        emails.add("reyman");
        emails.add("roger");
        emails.add("carlos");
        emails.add("carlos");
        

        for (String strings : emails) {
            System.out.println(strings);
        }
        System.out.println("============ Map ==============");
        HashMap<String, Integer> phoneNumbers = new HashMap(); 

        phoneNumbers.put("reyman", 58925);
        phoneNumbers.put("roger", 58926);
        phoneNumbers.put("reyman", 58927);

        for (Map.Entry<String, Integer> phonenombs : phoneNumbers.entrySet()){
            System.out.print(phonenombs.getKey() + " ");
            System.out.println(phonenombs.getValue());
        }
            

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        System.out.println("============ Indicator ==============");

        int descendant = 0;
        for(int indicator = 10 ; indicator > descendant; indicator-- ){
            System.out.println(indicator);
        }



        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.

        System.out.println("============ MOD 3 ==============");
        int i = 0;
        for (int goal = 21; i < goal; i++){
            if(i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }


        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        
        System.out.println("Break ======================>");

        int[] numberNegative = {10 , 20 , 30 , -40 , 50 ,60 };
        for (int ix = 0; ix < numberNegative.length ; ix++){
            if(numberNegative[ix] < 0){
                break;
            } else{
                System.out.println(numberNegative[ix]);
            }
        }

        // 10. Crea un programa que calcule el factorial de un número dado.



        }

       
        
}
