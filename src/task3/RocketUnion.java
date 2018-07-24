package task3;

public class RocketUnion extends Shuttle {
    public RocketUnion(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean predTest() throws FatalError {
            int number = (int) (Math.random() * 10);
            if (number >1) {
                System.out.println("Проверка прошла успешно. Запуск двигателя.");
                return true;
            } else if (number == 0) {
                throw new FatalError();
            } else {
                return false;
            }
        }
    }

