package factory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HouseLoan extends Loan {

    public HouseLoan() {
        super(LoanType.HOUSE);
    }

    @Override
    public double calcMonthAmount() {
        return Math.round((this.totalAmount/this.monthDuration) * 1.02);

    }


}
