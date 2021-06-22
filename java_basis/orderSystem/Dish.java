package orderSystem;

public class Dish {
    private String name;
    private double price;
    private int supply; //供应量
    private int remain;
    private double discount;
    private int sales; //菜品销售量,在setRemain中计算
    private double income; //计算菜品销售额
    public Dish(String name, double price, int remain, double discount) {
        this.name = name;
        this.price = price;
        this.remain = remain;
        this.discount = discount;
        this.supply = remain;
    }

    public int getSales() {
        return sales;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRemain() {
        return remain;
    }

    public void setRemain(int remain) {
        this.remain = remain;
        sales = this.supply - remain;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return getName()+"\t\t"+getPrice()+"\t\t"+getDiscount()+"\t\t"+getRemain();
    }
}