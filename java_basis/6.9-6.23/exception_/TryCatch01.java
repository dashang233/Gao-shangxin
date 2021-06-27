package exception_;

public class TryCatch01 {
    public static void main(String[] args) {

        try {
            Person person = new Person();
            person = null;
            person.getName();
            int n1 = 1;
            int n2 = 0;
            System.out.println(n1/n2);
        } catch(NullPointerException e){
            System.out.println("空指針異常"+e.getMessage());
        } catch(ArithmeticException e){
            System.out.println("算數異常"+e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Person{
    private String name = "Tom";

    public String getName() {
        return name;
    }
}