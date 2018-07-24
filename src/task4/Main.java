package task4;

public class Main {
    public static void main(String[] args) {
        String[] mark = {"Hyundai", "BMW", "Citroen"};
        double[] speed = {100, 200, 100};
        float[] price = {10000, 30000, 13000};

        Car[] cars = new Car[3];

        for (int i = 0; i < 3; i++) {
            cars[i] = new Car(mark[i], speed[i], price[i]);
        }

        for (Car car : cars) {
            try {
                car.start();
            } catch (SergeyException exp) {
                System.out.println(exp.message() + car.getMark() + " не завелся");
                System.out.println("Ваши деньги потрачены зря.");
            }
        }

    }
}
