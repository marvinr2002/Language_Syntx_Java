public class ArraysList {
    public static void main(String[] args){
        // statement
        // and creation
 int[] prices = {5,2,5} ;
 System.out.println(prices);
    `

        class NobelForPhysicsLaureatesRevisited {
            public static void main(String[] args) {

                String[] nobelLaureates = {"Curie", "Einstein", "Fermi"};
                int[] years = {1903, 1921, 1938};

                // Replace Fermi with Heisenberg
                nobelLaureates[2] = "Heisenberg";
                // Correct the year
                years[2] = 1932;

                System.out.println(nobelLaureates[0] + " won in " + years[0]);
                System.out.println(nobelLaureates[1] + " won in " + years[1]);
                // Print the last record
                System.out.println(nobelLaureates[2] + " won in " + years[2]);
            }
        }
    }
}
