package homework;

public class Homework08 {
    public static void main(String[] args) {
//        CheckingAccount c = new CheckingAccount(100);
//        c.deposit(10);
//        c.withdraw(9);
//        System.out.println(c.getBalance());
        SavingAccount s = new SavingAccount(1000);
        s.deposit(100);
        s.deposit(100);
        s.deposit(100);
//        s.deposit(100);
        System.out.println(s.getBalance());
        //下月初，自动调用计算利息的方法
        s.earnMonthlyInterest();
        System.out.println(s.getBalance());
    }
}
class BankAccount{
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }
    //存款
    public void deposit(double amount){
        balance += amount;
    }
    //取款
    public void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
class CheckingAccount extends BankAccount{
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount-1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount+1);
    }
}

class SavingAccount extends BankAccount{
    private double rate = 0.01;
    private int count = 3;
    public void earnMonthlyInterest(){ //每月初计算上月利息
        count = 3; //每月初将count恢复为3
//        super.setBalance(getBalance()*(1+rate));
        super.deposit(getBalance()*rate);
    }
    @Override
    public void deposit(double amount) {
        if(count > 0){
            super.deposit(amount);
        }else{
            super.deposit(amount-1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if(count > 0){
            super.withdraw(amount);
        }else{
            super.withdraw(amount+1);
        }
        count--;
    }

    public SavingAccount(double balance) {
        super(balance);
        this.count = count;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}


//class CheckingAccount extends BankAccount{
//    public CheckingAccount() {
//    }
//    public void fee(){
//        super.setBalance(super.getBalance()-1);
//    }
//}