public class VariableLengthArgumentList {
    public static int product(int... numbers) {
        if (numbers.length == 0)
            return 0;

        int Total = 1;

        for (int Number : numbers)
            Total *= Number;

        return Total;
    }

    public static void main(String[] args) {
        System.out.println(product());
        System.out.println(product(5));
        System.out.println(product(5, 10));
        System.out.println(product(10, 5, 10));
        System.out.println(product(10, 5, 5, 10));
    }
}

