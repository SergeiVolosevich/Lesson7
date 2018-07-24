package task3;

public class Cosmodrome {
    public void starts(IStart iStart) throws FatalError {
        if (iStart.predTest()) {
            iStart.startEngine();
            for (int i = 10; i >=1; i--) {
                System.out.println(i);
            }
            iStart.start();
        } else {
            System.out.println("Предстартовая проверка провалена.");
        }
    }
}
