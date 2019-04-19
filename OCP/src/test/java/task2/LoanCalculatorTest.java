package task2;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LoanCalculatorTest {

    private ILoanCalculator calculatorStudent = new Student();
    private ILoanCalculator calculatorCar = new Car();
    private ILoanCalculator calculatorHouse = new House();

    @Test
    public void studentLoanForYoungPoorPerson() {
        assertThat(calculatorStudent.getLoan(18, 100), is(100));
    }

    @Test
    public void studentLoanForOldPerson() {
        assertThat(calculatorStudent.getLoan(21, 100), is(250));
    }

    @Test
    public void studentLoanForRichPerson() {
        assertThat(calculatorStudent.getLoan(18, 2_000), is(200));
    }

    @Test
    public void carLoanForYoungPoorPerson() {
        assertThat(calculatorCar.getLoan(20, 500), is(2_000));
    }

    @Test
    public void carLoanForAdultPoorPerson() {
        assertThat(calculatorCar.getLoan(45, 500), is(3_000));
    }

    @Test
    public void carLoanForOldPoorPerson() {
        assertThat(calculatorCar.getLoan(60, 500), is(3_500));
    }

    @Test
    public void carLoanForYoungRichPerson() {
        assertThat(calculatorCar.getLoan(20, 2_000), is(4_000));
    }

    @Test
    public void carLoanForAdultRichPerson() {
        assertThat(calculatorCar.getLoan(45, 2_000), is(6_000));
    }

    @Test
    public void carLoanForOldRichPerson() {
        assertThat(calculatorCar.getLoan(60, 2_000), is(7_000));
    }

    @Test
    public void houseLoanForYoungPoorPerson() {
        assertThat(calculatorHouse.getLoan(20, 500), is(100_000));
    }

    @Test
    public void houseLoanForOldPoorPerson() {
        assertThat(calculatorHouse.getLoan(60, 500), is(100_000));
    }

    @Test
    public void houseLoanForYoungRichPerson() {
        assertThat(calculatorHouse.getLoan(20, 65_000), is(200_000));
    }

    @Test
    public void houseLoanForOldRichPerson() {
        assertThat(calculatorHouse.getLoan(60, 65_000), is(400_000));
    }
}
