import java.util.ArrayList;

public class Fcexercises {
   public static void main(String[] args) {
      System.out.println("Marvin");
      welcomeToJava();
      welcomeToJava("Pescueso");
      twoNumbers(34, 45);
      System.out.println(squareOfaNum(4));
      System.out.println(oddNumberAttempt(11));
      System.out.println(ageVerificator(19));
      System.out.println(sizeOfAString("null"));
      Integer[] Marvin = new Integer[5];
      Marvin[0] = 25;
      Marvin[1] = 35;
      Marvin[2] = 45;
      Marvin[3] = 55;
      Marvin[4] = 65;
      sizeCalculator(Marvin);
      System.out.println(returnsFactorial(21));
      System.out.println("========");

      ArrayList<String> names = new ArrayList<>();
      names.add("Carlos");
      names.add("Hernandez");
      names.add("Bozo");
      checkElementsList(names);
   }
   // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde
   // cero!".

   public static void welcomeToJava() {
      System.out.println("Welcome to Java from zero to hero");
   }

   // 2. Escribe una función que reciba un nombre como parámetro y salude a esa
   // persona.
   public static void welcomeToJava(String name) {
      System.out.println("Welcome to Java " + name);
   }

   // 3. Haz un método que reciba dos números enteros y devuelva su resta.
   public static Integer twoNumbers(Integer numberOne, Integer numberTwo) {
      Integer numberLess = numberOne - numberTwo;
      System.out.println(numberLess);
      return numberLess;
   }

   // 4. Crea un método que calcule el cuadrado de un número (n * n).
   public static Integer squareOfaNum(Integer oneNumber) {
      Integer squareOfNums = oneNumber * oneNumber;
      return squareOfNums;
   }

   // 5. Escribe una función que reciba un número y diga si es par o impar.
   public static String oddNumberAttempt(Integer oneNumber) {
      if (oneNumber % 2 == 0) {
         return "Even";
      } else {
         return "Odd";
      }
   }

   // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y
   // false en caso contrario).
   public static boolean ageVerificator(Integer Age) {
      if (Age >= 19) {
         return true;
      } else
         return false;
   }

   // 7. Implementa una función que reciba una cadena y retorne su longitud.
   public static Integer sizeOfAString(String cadena) {
      return cadena.length();
   }

   // 8. Crea un método que reciba un array de enteros, calcula su media y lo
   // retorna.
   public static Integer sizeCalculator(Integer[] example) {
      return example.length;
   }

   // 9. Escribe un método que reciba un número y retorna su factorial.
   public static int returnsFactorial(int number) {
      int Result = 1;
      for (int i = 1; i <= number; i++) {
         Result *= i;
      }
      return Result;
   }

   // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando
   // cada elemento.
   public static void checkElementsList(ArrayList<String> Lista) {
      for (int i = 0; i < Lista.size(); i++) {
         System.out.println(Lista.get(i));
      }
   }

}
