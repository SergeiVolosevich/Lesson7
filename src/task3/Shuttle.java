package task3;

public class Shuttle implements IStart {
    private String name;

    public Shuttle() {

    }

    public Shuttle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean predTest() throws FatalError {
        int number = (int) (Math.random() * 10);
        if (number > 3) {
            System.out.println("Проверка прошла успешно. Запуск двигателя.");
            return true;
        } else if (number == 0) {
            throw new FatalError();
        } else {
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели " + getName() + " запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт " + getName() + ".");
    }
}
