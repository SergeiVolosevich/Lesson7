package task2.pants;

public class Shorts implements IPants {
    private String name;
    private int price;
    private String color;

    public Shorts() {

    }

    public Shorts(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void clothe() {
        System.out.println("Штаны марки " + "\"" +getName()+ "\"" + ", с ценой -  " + getPrice() +
                ", с цветом -  " + getColor() + " одеты.");
    }

    @Override
    public void takeOff() {
        System.out.println("Штаны марки " + "\"" +getName()+ "\"" + ", с ценой -  " + getPrice() +
                ", с цветом -  " + getColor() + " сняты.");
    }

}
