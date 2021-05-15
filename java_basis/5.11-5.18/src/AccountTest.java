import java.util.Scanner;

/**
 * author dashang
 * date 2021/5/15 - 21:44
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("小明");
    }
}

class Account{
    private String name;
    private double money;
    private String password = "1433223";
    Scanner scanner = new Scanner(System.in);
    public void setName(String name) {
        System.out.println("请输入密码：");
        String pwd = scanner.next();
        if(pwd.equals(this.password)){
            if(name.length() >= 2 && name.length() <= 4){
                this.name = name;
                System.out.println("名字为："+this.name);
            }else{
                System.out.println("请输入位数2/3/4的字符串");
                this.name = "";
            }
        }else{
            System.out.println("密码错误");
        }

    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}