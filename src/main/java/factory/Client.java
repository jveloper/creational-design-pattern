package factory;

public class Client {

    public static void main(String[] args) throws Exception {

        LoanFactory loanFactory = new LoanFactory();
        Loan carLoan = loanFactory.create(LoanType.CAR);
        Loan houseLoan = loanFactory.create(LoanType.HOUSE);
        Loan personalLoan = loanFactory.create(LoanType.PERSONAL);

        carLoan.setTotalAmount(30000.00);
        carLoan.setOwner("John");
        carLoan.setMonthDuration(60);

        houseLoan.setTotalAmount(150000.00);
        houseLoan.setOwner("John");
        houseLoan.setMonthDuration(360);

        personalLoan.setTotalAmount(2500.00);
        personalLoan.setOwner("John");
        personalLoan.setMonthDuration(12);

        System.out.println("Monthly payment " + carLoan.calcMonthAmount() + " for Car loan.");
        System.out.println("Monthly payment " + houseLoan.calcMonthAmount() + " for House loan.");
        System.out.println("Monthly payment " + personalLoan.calcMonthAmount() + " for Personal loan.");

    }
}
