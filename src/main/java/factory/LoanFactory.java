package factory;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class LoanFactory {

    public Loan create(LoanType type) throws Exception {

        switch (type){
            case CAR : return new CarLoan();
            case HOUSE: return new HouseLoan();
            case PERSONAL: return new PersonalLoan();
            default: throw new Exception ("Impossible create loan of type " + type.name());

        }

    }

}
