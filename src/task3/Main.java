package task3;

public class Main {
    public static void main(String[] args) {
        Cosmodrome cosmodrome = new Cosmodrome();
        Shuttle shuttle = new Shuttle("Discovery");
        Shuttle spaceX = new SpaceX("Falcon Heavy");
        Shuttle rocketUnion = new RocketUnion("Союз 10");
        Shuttle[] arr = new Shuttle[3];
        arr[0] = shuttle;
        arr[1] = spaceX;
        arr[2] = rocketUnion;

        for (Shuttle iStart : arr) {
            try {
                System.out.println("\nПодготовка к запуску летательного аппарата " + iStart.getName() + ".");
                cosmodrome.starts(iStart);
            } catch (FatalError exp) {
                exp.message();
                break;
            }
        }
    }
}

