

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount: ");
        double deposit = input.nextDouble();

        if (deposit < 10000) {
            System.out.println("Loan not allowed");
        } else {
            System.out.print("Enter loan amount: ");
            double loan = input.nextDouble();

            if (loan <= 0 || loan > 60000) {
                System.out.println("Invalid loan amount");
            } else {
                double interest = loan * 0.05;
                double total = loan + interest;
                double monthly = total / 6;

                System.out.println("Interest: " + interest + " RWF");
                System.out.println("Total repayment: " + total + " RWF");
                System.out.println("Monthly payment: " + monthly + " RWF");
            }
        }

        input.close();
    }
}
