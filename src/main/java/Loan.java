public class Loan {
<<<<<<< HEAD
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
=======
    private String borrower;
    private int amount;
    private boolean isPaid;
    private double interestRate;

    public Loan(String borrower, int amount, double interestRate) {
        this.borrower = borrower;
        this.amount = amount;
        this.interestRate = interestRate;
        this.isPaid = false;
    }

    public void setAsPaid() {
        isPaid = true;
>>>>>>> 316dc0f18b45f26f81a3e0115cdb8ee807ad2d04
    }

    public boolean isPaid() {
        return isPaid;
    }

<<<<<<< HEAD
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
=======
    public String getBorrower() {
        return borrower;
    }

    public String getDisplayString() {
        return borrower + ": " + amount;
    }

    public double getProfit() {
        return amount * interestRate;
    }
}
>>>>>>> 316dc0f18b45f26f81a3e0115cdb8ee807ad2d04
