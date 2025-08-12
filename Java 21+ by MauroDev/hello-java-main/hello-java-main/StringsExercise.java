public class StringsExercise {
    public static void main(String[] args) {
        // 1. Concatena dos cadenas de texto.

        String name = "Marvin";
        String name2 = "marvin";
        String surname = "Ruiz";
        String surname2 = "ruiz";

        System.out.println(name + " Marvin");
        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(name.length());
        // 3. Muestra el primer y último carácter de un string.
        System.out.println(name.charAt(name.length()-1));
        System.out.println(name.charAt(0));
        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(name.toUpperCase().contains("Marvin"));
        // 6. Formatea un string con un entero.
        System.out.println(name);
        // 7. Elimina los espacios en blanco al principio y final de un string.
        String sentence = "  Hola Mi nombre es %s";
        System.out.println(String.format(sentence, name ));
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(String.format(sentence,name ).replace(" ","-"));
        // 9. Comprueba si dos strings son iguales.
        System.out.println(name.equals(surname2));
        System.out.println(name.equals(name));
        // 10. Comprueba si dos strings tienen la misma longitud
        System.out.println(name.length() == surname2.length());
    }
}
