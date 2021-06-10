package Test;

public class Weeks {
    public static void main(String[] args) {
        Week.show(3);
    }
}
enum Week{
    MONDAY(1,"monday"),TUESDAY(2,"tuesday"),WEDNESDAY(3,"wednesday"),THURSDAY(4,"thursday"),FRIDAY(5,"friday"),SATURDAY(6,"saturday"),SUNDAY(7,"sunday");

    private int index;
    private String call;

    private Week(int index, String call) {
        this.index = index;
        this.call = call;
    }
    static Week[] weeks = Week.values();
    public static void show(int i){
        for(Week week : weeks){
            if(i == week.index){
                System.out.println(week.call);
            }
        }
    }
}