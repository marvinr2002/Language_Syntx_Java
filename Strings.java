public class Strings{
    public static void main(String[] args) {

        // Text Strings
        String name = "Carlos";
        String surname = "Ruiz";
        System.out.println(name + " " +surname);
        // longitud
        System.out.println(name.length());
        // Obtener caracter
        System.out.println(name.charAt(name.length() - 1));
        //Substring
        System.out.println(name.substring(2));
        System.out.println(name.substring(0,3));

        System.out.println(name);

        //Check if contains
        System.out.println("Hello Java".contains("Brais"));
        System.out.println("Hello Java".toUpperCase().contains("AVA"));

        //Comparison
        System.out.println(name.equals("carlos"));
        System.out.println(name.equalsIgnoreCase("Carlos"));
        // == vs. equals

        System.out.println("== vs .equals");
        var a = "Brais";
        var b = "Brais";
        var c = new String ("Brais");
        System.out.println(a == b);
        System.out.println(a == c);
        // en principio es lo mismo.
        System.out.println(a.equals(c));
        // You are looking for something specific.

        // Trim
        System.out.println("Hola, me llamo Carlos");


    }
}
