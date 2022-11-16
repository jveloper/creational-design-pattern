package factory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonalLoan extends Loan {

    public PersonalLoan() {
        super(LoanType.PERSONAL);
    }

    @Override
    public double calcMonthAmount() {
        return Math.round((this.totalAmount/this.monthDuration) * 1.06);

    }

}
