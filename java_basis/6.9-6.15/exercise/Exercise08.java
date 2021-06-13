package exercise;

public class Exercise08 {
    public static void main(String[] args) {
        Color blue = Color.BLUE;
        blue.show();
        switch (blue){
            case RED:
                System.out.println("红色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            default:
                System.out.println("未找到匹配项");
        }
    }
}
enum Color implements Appearance{
    RED(255,0,0),
    BLUE(0,0,255),GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("三属性分别为：" + redValue + "、" + greenValue + "、" + blueValue);
    }
}
interface Appearance{
    void show();
}