public class Fcexercises {
   public static void main(String[] args) {
    System.out.println("Marvin");
    welcomeToJava();
    welcomeToJava("Pescueso");
    twoNumbers(34, 45);
    System.out.println(squareOfaNum(4));
   }
   

     // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".

     public static void welcomeToJava(){
        System.out.println("Welcome to Java from zero to hero");
     }

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
     public static  void welcomeToJava(String name){
        System.out.println("Welcome to Java " + name);
     }

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
     public static Integer twoNumbers(Integer numberOne, Integer numberTwo){
        Integer numberLess = numberOne - numberTwo;
         System.out.println(numberLess);
        return numberLess;
    } 

        // 4. Crea un método que calcule el cuadrado de un número (n * n).
      public static Integer squareOfaNum(Integer oneNumber){
         Integer squareOfNums = oneNumber * oneNumber;
         return squareOfNums; 
      }





        // 5. Escribe una función que reciba un número y diga si es par o impar.

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).

        // 7. Implementa una función que reciba una cadena y retorne su longitud.

        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.

        // 9. Escribe un método que reciba un número y retorna su factorial.

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.

    
}
