package task1.robot.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("Делает шаг ногой Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ToshibaLeg " + getPrice();
    }
}
