package orderSystem;

public class Dishes {
    public static orderSystem.Dish[] dishes = new orderSystem.Dish[12]; //存放全部菜品对象需设置为静态
    static {
        dishes[0] = new orderSystem.Dish("水饺(素三鲜)", 12, 1, 1);
        dishes[1] = new orderSystem.Dish("水饺(酸菜油吱啦)", 12, 30, 1);
        dishes[2] = new orderSystem.Dish("猪肉",16,50, 1);
        dishes[3] = new orderSystem.Dish("汤饺(素)",5,20, 1);
        dishes[4] = new orderSystem.Dish("汤饺(肉)",7,20, 1);
        dishes[5] = new orderSystem.Dish("米饭(小碗)",2,25, 1);
        dishes[6] = new orderSystem.Dish("米饭(大碗)",2,25, 1);
        dishes[7] = new orderSystem.Dish("面条(小碗)",2,35, 1);
        dishes[8] = new orderSystem.Dish("面条(中碗)",3,35, 1);
        dishes[9] = new orderSystem.Dish("面条(大碗)",4,35, 1);
        dishes[10] = new orderSystem.Dish("饹豆子(小碗)",2,10, 1);
        dishes[11] = new orderSystem.Dish("饹豆子(大碗)",3,10, 1);
    }
}
