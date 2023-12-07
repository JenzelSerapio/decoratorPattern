public class UpSave implements BankAccountDecorator{
    private BankAccount account;

    public UpSave(BankAccount account) {
        this.account = account;
        account.setBankAccount(this);
    }

    @Override
    public String showInfo() {
        return account.showInfo();
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04;
    }

    @Override
    public double getBalance() {
        return account.getBalance();
    }

    @Override
    public String showBenefits() {
        return account.showBenefits() + ", With Insurance";
    }

    @Override
    public double computeBalanceWithInterest() {
        return account.getBalance() * (1 + getInterestRate());
    }

    @Override
    public void setBankAccount(BankAccount account) {
        this.account = account;
    }
}

