public class OddIntegers {
    public static void main( String[] args ){
        int product = 1; // set variable
        for(int i = 1; i <= 15; i += 2) // get every odd number from 1 to 15
            product *= i; // get product
        System.out.printf( "Product is: %n-%d", product ); // display product
    }
}
