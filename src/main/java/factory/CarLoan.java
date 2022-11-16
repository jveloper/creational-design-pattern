package factory;

import lombok.Getter;
import lombok.Setter;

public class CarLoan extends Loan {

    public CarLoan() {
        super(LoanType.CAR);
    }

    @Override
    public double calcMonthAmount() {
        return Math.round((this.totalAmount/this.monthDuration) * 1.03);

    }

}
