import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);
        displayAccount(account1);
        displayAccount(account2);

        Scanner input = new Scanner(System.in); // create a Scanner
        // Deposit
        // acc 1
        System.out.print("\nEnter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nAdding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); //add to account1’s balance
        displayAccount(account1);
        displayAccount(account2);

        // acc 2
        System.out.print("\nEnter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nAdding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // add to account2 balance
        displayAccount(account1);
        displayAccount(account2);

        /* withdraw method */
        // acc 1
        System.out.print("\nEnter withdraw amount for account1: "); // prompt
        double withdrawAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nWithdrawing %.2f from account1 balance%n%n", depositAmount);
        account1.withdraw(withdrawAmount); // remove from account1 balance
        displayAccount(account1);
        displayAccount(account2);

        // acc 2
        System.out.print("\nEnter withdraw amount for account2: "); // prompt
        withdrawAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nWithdrawing %.2f from account2 balance%n%n", withdrawAmount);
        account2.withdraw(withdrawAmount); // remove from account2 balance
        displayAccount(account1);
        displayAccount(account2);
    }
    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s balance: $%.2f%n",
                accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
