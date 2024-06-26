package Model;

import java.util.Vector;

public abstract class WalletModel extends MoneyProvidable {

    protected String username;
    protected boolean activeStatus;
    public static Vector<WalletModel> wallets = new Vector<>();

    public WalletModel(String mobileNumber, double balance, String username, boolean activeStatus) {
        this.mobileNumber = mobileNumber;
        this.balance = balance;
        this.username = username;
        this.activeStatus = activeStatus;
    }

    public abstract void deposit(double amount);

    public abstract boolean checkBalance();
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setBalance(double balance) {
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
        WalletModel wallet1 = new BankWallet("01010101010", 1000, "salma", true, "QNB", 5000);
        wallet1.deposit(500);
        wallet1.withdraw(200);
        wallet1.checkBalance();
        wallets.add(wallet1);

        WalletModel wallet2 = new TeleWallet("01020202020", 2000, "user2", true, "Vodafone");
        wallet2.deposit(1000);
        wallet2.withdraw(500);
        wallet2.checkBalance();
        wallets.add(wallet2);

        WalletModel wallet3 = new ElectronicWallet("01030303030", 3000, "user3", true, "QRCode1");
        wallet3.deposit(1500);
        wallet3.withdraw(700);
        wallet3.checkBalance();
        wallets.add(wallet3);
    }

}
