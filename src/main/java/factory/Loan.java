package factory;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Loan {

    Double totalAmount;
    Integer monthDuration;
    String owner;
    @Setter(AccessLevel.NONE)
    LoanType loanType;
    Double monthAmount;

    public Loan(LoanType loanType) {
        this.loanType = loanType;
    }

    public abstract double calcMonthAmount();
    public String printLoan(){
        return this.toString();
    }
}
