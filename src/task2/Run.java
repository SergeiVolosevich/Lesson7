package task2;

import task2.footwear.Boots;
import task2.footwear.IFootwear;
import task2.footwear.Slippers;
import task2.footwear.Sneakers;
import task2.jacket.Coat;
import task2.jacket.IJacket;
import task2.jacket.LeatherJacket;
import task2.jacket.Windbreaker;
import task2.pants.IPants;
import task2.pants.Jeans;
import task2.pants.Shorts;
import task2.pants.Trousers;

public class Run {
    public static void main(String[] args) {
        String[] names = {"Вася","Вова", "Дима"};
        IPants[] pants = {new Jeans("Jeans", 100, "Blue"),
                new Shorts("Shorts", 50, "Green"),
                new Trousers("Trousers", 150, "Red")};
        IJacket[] jackets = {new Coat("Coat", 100, "Black"),
                new LeatherJacket("LeatherJacket", 300, "White"),
                new Windbreaker("Windbreaker", 200, "Blue")};
        IFootwear[] footwears = {new Boots("Boots",150,"Black"),
                new Slippers("Slippers",50,"Gray"),
                new Sneakers("Sneakers",200,"White")};
        Human[] humans = new Human[3];

        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human (names[i],pants[(int) (Math.random() * 2)],
                    jackets[(int) (Math.random() * 2)],
                    footwears[(int) (Math.random() * 2)]);
        }

        for (Human hm : humans) {
            System.out.println(hm.toString() + " одевается.");
            hm.clothe();
            System.out.println(hm.toString() + " оделся.");
            System.out.println();
        }

        for (Human hm : humans) {
            System.out.println(hm.toString() + " раздевается.");
            hm.takeOff();
            System.out.println(hm.toString() + " разделся.");
            System.out.println();
        }



    }
}
