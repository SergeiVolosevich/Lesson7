package task4;

public class Car {
    private String mark;
    private double speed;
    private float price;

    Car() {

    }

    public Car(String mark, double speed, float price) {
        this.mark = mark;
        this.speed = speed;
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public double getSpeed() {
        return speed;
    }

    public float getPrice() {
        return price;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void start() throws SergeyException {
        int number = (int) (Math.random() * 20);
        if (number % 2 == 0 && number!=0) {
            throw new SergeyException();
        } else if (number==0) {
            System.out.println("Ключ не подходит для автомобиля. Возьмите другой ключ.");
            while (number==0){
                start();
            }
        } else {
            System.out.println("Автомобиль марки " + getMark() + " завелся");
        }
    }
}
