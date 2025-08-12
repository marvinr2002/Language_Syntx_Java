public class Operators {
    public static void main(String[] args) {
        // Operators
        // arithmetic
        var a = 1;
        var b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    // asignation
        a = b;
        System.out.println("Hello, " + a);
        a = b * 2;
        System.out.println(a);

        a -= 1;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 2;
        System.out.println(a);

        // Comparison Operators.
        System.out.println(a == b);
        System.out.println(a == 1);
        System.out.println(a != b);

        System.out.println(a);
        System.out.println(b);

        System.out.println("Separation section\n");
        System.out.println( a != b );
        System.out.println( a < b );
        System.out.println( a >= b );
        System.out.println( a > b );
        System.out.println( a <= b);

        //Logical Connectors

        System.out.println("....");
        // Y (and)
        System.out.println("Y And");
        System.out.println(true && true );
        System.out.println(true && false );
        System.out.println(false && true );
        System.out.println(false && false );

        System.out.println("True table");

        System.out.println( 3 > 2 && 5 == 2);

        System.out.println("O or");
        // O ( or )
        System.out.println(true || true );
        System.out.println(true || false );
        System.out.println(false || true );
        System.out.println(false || false );

        // no ( not ) .\☺☼♫☻87
        System.out.println("No not");

        System.out.println(!true);
        System.out.println(!false);

        // unary operators
        System.out.println(+b);
        System.out.println(-b);

        int c = 1;
        int x = 2;
        System.out.println(c);
        System.out.println(c++);
        System.out.println(++c);
        System.out.println(c);




    }


}
