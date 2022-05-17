public class OneDimensionalArray {
    public static void main(String[] args) {
        // setting each element in counts to 0
        int [] counts = new int [10];
        for(int i = 0; i<10; i++){
            counts[i] = 0;
        }

        // adding 1 to each element in bonus
        int [] bonus = new int [15];
        for(int i = 0; i<15; i++){
            bonus[i] += 1;
        }

        // printing each element in bestScores in a column
        int [] bestScores = new int [5];
        for(int i = 0; i<5; i++){
            System.out.println(bestScores[i]);
        }
    }
}