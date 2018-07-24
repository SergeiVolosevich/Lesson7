package task2.jacket;

public class LeatherJacket implements IJacket {
    private String name;
    private int price;
    private String color;

    public LeatherJacket() {

    }

    public LeatherJacket(String name, int price, String color) {
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
        System.out.println("Куртка марки " + "\"" +getName()+ "\"" + ", с ценой -  " + getPrice() +
                ", с цветом -  " + getColor() + " одета.");
    }

    @Override
    public void takeOff() {
        System.out.println("Куртка марки " + "\"" +getName()+ "\"" + ", с ценой -  " + getPrice() +
                ", с цветом -  " + getColor() + " снята.");
    }

}
