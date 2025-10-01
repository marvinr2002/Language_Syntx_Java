import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsLoopM{
    // good practices.
    // no long names
    // no over-use
    // specific names


    public static void main(String[] args) {

    var users = new ArrayList<>(Arrays.asList("Marv","Carlos","Aliosha"));
        
    sendEmailToUsers(users);

    for (int index = 0; index < 5; index++)
        sendEmail();

    sendEmailToUser("Guineo@gmail.com");

    }
    public static  void sendEmail(){
        System.out.println("Se envia email");
    }

    public static void sendEmailToUser(String email){
        System.out.println("Se envia email"+  email);
    }
    
    
    public static void sendEmailToUsers(String email, String name){
        System.out.println("Se envia email"+  email + " " + name);
    }

    public static void sendEmailToUsers(ArrayList<String> emails){
        for(String email : emails) {
            System.out.println("Se envia email " + email);
        }

    }



}