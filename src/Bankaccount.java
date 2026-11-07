
    /// example14
class Bankaccount {
    private double balance;
    // the only change: LinkedStack instead of Stack
    private LinkedStack<Double> history = new LinkedStack<>();

    public Bankaccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        history.push(amount);
        System.out.println("Deposit " + amount + " -> balance " + balance);
    }

    public void undoLastDeposit() {
        if (history.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }
        double last = history.pop();
        balance = balance - last;
        System.out.println("Undo " + last + " -> balance " + balance);
    }
}

