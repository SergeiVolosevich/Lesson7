package task1.robot;

import task1.robot.hands.IHand;
import task1.robot.hands.SamsungHand;
import task1.robot.hands.SonyHand;
import task1.robot.hands.ToshibaHand;
import task1.robot.heads.IHead;
import task1.robot.heads.SamsungHead;
import task1.robot.heads.SonyHead;
import task1.robot.heads.ToshibaHead;
import task1.robot.legs.ILeg;
import task1.robot.legs.SamsungLeg;
import task1.robot.legs.SonyLeg;
import task1.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {

        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс ToshibaHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        ILeg[] legs = {new SamsungLeg(100), new SonyLeg(200), new ToshibaLeg(300)};
        IHead[] heads = {new SamsungHead(300), new SonyHead(250), new ToshibaHead(500)};
        IHand[] hands = {new SamsungHand(150), new SonyHand(400), new ToshibaHand(500)};
        Robot[] robots = new Robot[3];

        for (int i = 0; i < robots.length; i++) {
            robots[i] = new Robot(heads[(int) (Math.random() * 2)],
                    hands[(int) (Math.random() * 2)],
                    legs[(int) (Math.random() * 2)]);
        }

        for (Robot rb : robots) {
            rb.action();
            System.out.println();
        }

        int maxPrice = robots[0].getPrice();
        int j = 0;
        for (int i = 1; i < robots.length; i++) {
            if (maxPrice < robots[i].getPrice()) {
                maxPrice = robots[i].getPrice();
                j++;
            }
        }

        System.out.println(robots[j] + "самый дорогой робот, его цена равна: " + robots[j].getPrice() + ".");
    }
}
