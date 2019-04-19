package task2;

public class Student implements ILoanCalculator {
    @Override
    public int getLoan(int age, int income) {
        int loan = 100;

        if (age >= 21) {
            loan += 150;
        }

        return IncomeMultiplier.multiply(loan, income);
    }
}
