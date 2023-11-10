package Model;

public abstract class WalletModel {
    protected String mobileNumber;
    protected float balance;
    protected String username;
    protected boolean activeStatus;

    public WalletModel(String mobileNumber, float balance, String username, boolean activeStatus) {
        this.mobileNumber = mobileNumber;
        this.balance = balance;
        this.username = username;
        this.activeStatus = activeStatus;
    }

    public abstract void deposit(float amount);

    public abstract void withdraw(int amount);

    public abstract boolean checkBalance();
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }
    static {
        WalletModel wallet1 = new BankWallet("01010101010", 1000, "user1", true, "Bank1", 5000);
        wallet1.deposit(500);
        wallet1.withdraw(200);
        wallet1.checkBalance();

        WalletModel wallet2 = new TeleWallet("01020202020", 2000, "user2", true, "Telecom1");
        wallet2.deposit(1000);
        wallet2.withdraw(500);
        wallet2.checkBalance();

        WalletModel wallet3 = new ElectronicWallet("01030303030", 3000, "user3", true, "QRCode1");
        wallet3.deposit(1500);
        wallet3.withdraw(700);
        wallet3.checkBalance();
    }

}