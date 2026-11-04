Banking System – Loan Calculator

A simple Java console application that checks whether a customer is eligible for a loan and calculates the interest, total repayment, and monthly installment. All amounts are in Rwandan Francs (RWF).

Features
Checks loan eligibility based on the customer's deposit
Validates the requested loan amount
Calculates 5% interest on the loan
Calculates total repayment and the monthly payment over 6 months
Loan Rules
Rule	Value
Minimum deposit to qualify	10,000 RWF
Loan amount	Greater than 0 and at most 60,000 RWF
Interest rate	5% (flat)
Repayment period	6 months
How It Works
The program asks for the customer's deposit amount.
If the deposit is less than 10,000 RWF, it prints Loan not allowed and stops.
Otherwise, it asks for the loan amount.
If the loan is 0 or less, or above 60,000 RWF, it prints Invalid loan amount.
If valid, it calculates and displays:
Interest = loan × 0.05
Total repayment = loan + interest
Monthly payment = total repayment ÷ 6
Requirements
Java Development Kit (JDK) 8 or higher
Getting Started
Clone the repository
bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
Compile
bash
javac BankingSystem.java
Run
bash
java BankingSystem
Example Runs

Eligible customer

Enter deposit amount: 20000
Enter loan amount: 50000
Interest: 2500.0 RWF
Total repayment: 52500.0 RWF
Monthly payment: 8750.0 RWF

Deposit too low

Enter deposit amount: 5000
Loan not allowed

Loan amount too high

Enter deposit amount: 20000
Enter loan amount: 80000
Invalid loan amount
Project Structure
.
├── BankingSystem.java
└── README.md
Possible Improvements
Handle non-numeric input with try-catch or hasNextDouble()
Format output to two decimal places (e.g. String.format)
Make the interest rate, loan limit, and repayment period configurable
Allow multiple customers or repeated calculations in one run
