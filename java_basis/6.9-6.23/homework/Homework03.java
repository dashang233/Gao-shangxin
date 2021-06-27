package homework;

public class Homework03 {
    public static void main(String[] args) {
        try {
            new Account("Tom","123456","110@qq.com");
            System.out.println("恭喜，注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class Account{
    private String name;
    private String password;
    private String email;

    public Account(String name, String password, String email) {
        if (!(name.length()==2 || name.length()==3)){
            throw new RuntimeException("用户名长度错误");
        }
        if(!(password.length() == 6 && test(password))){
            throw new RuntimeException("输入密码错误");
        }
        if(!(email.indexOf('@') > 0 && email.indexOf('@') < email.indexOf('.'))){
            throw new RuntimeException("输入邮箱错误");
        }
        this.name = name;
        this.password = password;
        this.email = email;
    }
    public static boolean test(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] < '0' || chars[i] > '9'){
                return false;
            }
        }
        return true;
    }

}