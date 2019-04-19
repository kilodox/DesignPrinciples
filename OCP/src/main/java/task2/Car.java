package task2;

public class Car implements ILoanCalculator {
    @Override
    public int getLoan(int age, int income) {
        int loan = 2_000;

        if (age > 50) {
            loan += 1_500;
        } else if (age > 30) {
            loan += 1_000;
        }

        return IncomeMultiplier.multiply(loan, income);
    }
}
