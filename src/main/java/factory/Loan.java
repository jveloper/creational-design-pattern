package factory;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Loan {

    Double amount;
    String holder;
    Integer duration;
    @Setter(AccessLevel.NONE)
    LoanType loanType;

    abstract double calculateLoanMonthAmount();
    abstract double calculateLoanAmount();
}
