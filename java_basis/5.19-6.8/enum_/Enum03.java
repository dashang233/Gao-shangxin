package enum_;

public class Enum03 {
    int i;
    public static void main(String[] args) {
        System.out.println("===所有星期信息如下+++");
        Week[] arr = Week.values();
        for(Week w : arr){
            System.out.println(w);
        }
    }
}
enum Week{
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");
    private String week;

    private Week(String week) {
        this.week = week;
    }

    @Override
    public String toString() {
        return this.week;
    }
}