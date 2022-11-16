package factory;

public class CarLoan extends Loan{

    public CarLoan() {
        this.loanType = LoanType.Car;
    }

    @Override
    double calculateLoanMonthAmount() {
        return Math.round((this.amount/this.duration) * 1.10);
    }

    @Override
    double calculateLoanAmount() {
        return this.calculateLoanMonthAmount() * duration;
    }


}
