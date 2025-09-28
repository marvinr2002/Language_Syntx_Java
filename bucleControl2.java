import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.ArrayList;

public class bucleControl2{
    /**
     * @param args
     */
    public static void main(String[] args){
        HashMap<String, Integer> Ages = new HashMap<>();
        String[] names = {"Brais", "Moure", "mouredev"};
        Ages.put("Marvin", 25);
        Ages.put("Luis", 28);
        Ages.put("Marcelo", 30);
        System.out.println(Ages.size());
        System.out.println(Ages);
        for(Map.Entry<String, Integer> Age: Ages.entrySet()){
            System.out.println(Age); 
        }
 
        int index = 0;
        while ( index < 5){
            System.out.println(("Marvin gay"));
            index++;
        }

        // do while 

        // while
        index = 0;
        while(index < names.length){    
            System.out.println(names[index]);
            index++;
        }
        index = 0;
        while(index < names.length){    
            System.out.println(names[index]);
            if (names[index].equals("Moure"));
            index++;
        }

        index = 0;
        boolean find = false; 
        while(!find){    
            System.out.println(names[index]);
            if (names[index].equals("Moure"));    
            find = true;
    }


    // do while
        index = 0;
        do {
            System.out.println("Hello Java");
            index ++;
        } while (index < 0);


        System.out.println("==========");

        // bucle control
        //break 
        /* ArrayList<String> namesForExp = new ArrayList<>();
        namesForExp.add("Marvin");
        namesForExp.add("Ruiz");
        namesForExp.add("Rojas");
        String[] namesExtendedVersion = {"Brais", "Moure", "mouredev"};

        System.out.println(namesForExp);
        */
        

        // String[] names = {"Brais", "Moure", "mouredev"};
        for (String name: names){
            if (name.equals("Moure")){
                break;
            }
            System.out.println(name);
        }
        
        for (int i = 0; i < 10; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }




    }

}
