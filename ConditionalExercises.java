public class ConditionalExercises {
    public static void main(String[] args) {
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        double age = 14;
        if (age < 18) {
            System.out.println("Under 18 years old");
        } else if (age == 18) {
            System.out.println("Just turned 18");
        } else {
            System.out.println("Over 18 years old");
        }
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        double nom1 = 25;
        double nom2 = 35;
        if (nom1 > nom2) {
            System.out.format("%.2f is greater than %.2f", nom1, nom2);
        } else {
            System.out.format("%.2f is greater than %.2f \n \n", nom2, nom1);
        }
        // 3. Dado un número, verifica si es positivo, negativo o cero.
        var nom3 = -2;
        if (nom3 > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        // 4. Crea un programa que diga si un número es par o impar.

        var numpar = 10;

        if (numpar % 2 == 0) {
            System.out.println(numpar + " is even (par).");
        } else {
            System.out.println(numpar + " is odd (impar).");
        }
                // 5. Verifica si un número está en el rango de 1 a 100.
        var numrange = 101;
        if (numrange <= 100){
            System.out.println(numrange + " Is between the range");
        } else {
            System.out.println("It's outside the range");
        }
                // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

                // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).

                // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

                // 9. Crea un programa que diga si una letra es vocal o consonante.

                // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        }
    }