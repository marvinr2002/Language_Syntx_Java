import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class foerach {
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

        
    }
    
}
