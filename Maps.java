import java.util.HashMap;
import java.util.HashSet;

public class Maps {
    public static void main(String[] args){
        HashMap<String, Integer> users = new HashMap<>();
        // add elements

        users.put("Edad", 25);
        users.put("Marco", 32);
        System.out.println(users.get("Edad"));
    
        var numbers = new HashSet<Integer>();
        // Size
        System.out.println(users.size());
        
        users.remove("Edad");
        System.out.println(users);
        users.clear();
        System.out.println(users);
        
        // more operations

    }
}
