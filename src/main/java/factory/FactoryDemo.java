package factory;

public class FactoryDemo {

    public static void main(String[] args) {

        AbstractFactory factory = FactoryCreator.createFactory(FactoryType.LoanFactory);
        Loan carLoan = factory.createLoan(LoanType.Car);

        carLoan.setAmount(20000.00);
        carLoan.setHolder("Peter Hash");
        carLoan.setDuration(36);

        System.out.println(carLoan);
        System.out.println("monthly loan payment: " + carLoan.calculateLoanMonthAmount());
        System.out.println("loan duration: " + carLoan.getDuration());
        System.out.println("loan requested value: " + carLoan.getAmount());
        System.out.println("loan final value: " + carLoan.calculateLoanAmount());

    }
}
