package factory;

public class PersonalLoan extends Loan{

    @Override
    double calculateLoanMonthAmount() {

        double interest = 1.7; //1.7%
        return Math.round((this.amount/this.duration) * interest);
    }

    @Override
    double calculateLoanAmount() {
        return this.calculateLoanMonthAmount() * duration;
    }
}
