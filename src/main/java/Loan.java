public class Loan {
    private int amount;
    private String borrower;
    private boolean isPaid;
    private double interestRate;
    private String contactNumber;

    public Loan(int amount, String borrower, double interestRate, String contactNumber) {
        this.amount = amount;
        this.borrower = borrower;
        this.isPaid = false;
        this.interestRate = interestRate;
        this.contactNumber = contactNumber;
    }

    public int getAmount() {
        return amount;
    }

    public String getBorrower() {
        return borrower;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setAsPaid() {
        this.isPaid = true;
    }
}
