public class Conditions {
    public static void main(String[] args) {
        //conditions
        // if
        var age = 17;
        if (age > 18) {
            System.out.println("El usuario es mayor de edad");
        } else if (age == 18) {
            System.out.println("El usuario acaba de cumplir 18");
        } else
        System.out.println("El usuario es menor de edad");

    //switch
        var day = 1;
        switch(day) {
            case 1:
            System.out.println("Lunes de guineo");
            break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
        }
    }

}

