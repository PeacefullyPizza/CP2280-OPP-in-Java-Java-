public class Factorials {
    public static void main(String[] args) {
        {
            long i, factorial = 1;
            int number = 20;
            for( i = 1; i <= number; i++ ){
                factorial = factorial * i;
                System.out.println("Factorial of "+i+" is: "+factorial);
                // wouldn't be able to go above 20
                // long only allows whole numbers from
                // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            }
    }
}}
