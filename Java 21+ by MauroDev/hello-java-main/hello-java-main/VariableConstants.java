public class VariableConstants {
    public static void main(String[] args) {
        // variable
        String name = "Marvin";
        System.out.println(name);
        int Age = 23;

        // name = 37; error, we can not change the variable type.
        name = "Antonio";

        System.out.println(name);
        System.out.println(Age);
        // constantes

        var email = "Marvin@gmail.com";
        System.out.println(email);
        var year = 2025;
        System.out.println(year);
        final String EMAIL = "marvin@gmail.com"; // value can not change after -final keyword
        // email = "marvin2002@gmail.com"; es constante
        System.out.println(EMAIL);

    }
}
