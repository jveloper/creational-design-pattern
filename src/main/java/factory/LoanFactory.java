package factory;

public class LoanFactory extends AbstractFactory{

    @Override
    public Loan createLoan(LoanType loanType) {

        return switch (loanType) {
            case Car -> new CarLoan();
            case House -> new HouseLoan();
            case Personal -> new PersonalLoan();
        };
    }
}
