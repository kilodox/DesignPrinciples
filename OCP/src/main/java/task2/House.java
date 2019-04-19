package task2;

public class House implements ILoanCalculator{
    @Override
    public int getLoan(int age, int income) {
        int loan = 100_000;

        if (age > 30 && income > loan / 2) {
            loan *= 2;
        }

        return IncomeMultiplier.multiply(loan, income);
    }
}
