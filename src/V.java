import java.util.UUID;

public class V implements App{


    private String name;

    private String accountNo;

    private String password;

    private double balance;

    final double rateOfInt = 7.1;

    public V() {// default constructor
    }

    public V(String name, String password, double balance) {
        this.name = name;
        this.accountNo = String.valueOf(UUID.randomUUID());
        this.password = password;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getROI() {
        return rateOfInt;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "Your current account balance is "+ this.balance;
        }
        return "Incorrect Password";
    }

    @Override
    public String addMoney(double amount) {
           if(amount > 0) {
               this.balance += amount;
               return amount + "is debited to your account your current balance is " + this.balance;
           }
           return 0.00 + " added to your account your current balance is "+ this.balance;
    }

    @Override
    public String withdrawMoney(String password, double amount) {
        if(this.password.equals(password)){
            if(this.balance > amount){
                this.balance -= amount;
                return "Your current balance is "+this.balance;
            }
            else{
                return "Insufficient balance";
            }
        }
        return "Incorrect Password";

    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)){
            this.password = newPassword;
            return "Password changed successfully";
        }

            return "Incorrect Password";
    }

    @Override
    public double rateOfInterest(int year) {
        return (this.balance*year*rateOfInt)/100;
    }

    @Override
    public String toString() {
        return "V{" +
                "name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rateOfInt=" + rateOfInt +
                '}';
    }
}
