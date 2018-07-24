package task2;

import task2.footwear.IFootwear;
import task2.jacket.IJacket;
import task2.pants.IPants;

public class Human implements IHuman {
    private String name;
    private IFootwear footwear;
    private IJacket jacket;
    private IPants pants;

    public Human() {

    }

    public Human(String name, IPants pants, IJacket jacket, IFootwear footwear) {
        this.name = name;
        this.footwear = footwear;
        this.jacket = jacket;
        this.pants = pants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IFootwear getFootwear() {
        return footwear;
    }

    public void setFootwear(IFootwear footwear) {
        this.footwear = footwear;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    @Override
    public void clothe() {
        footwear.clothe();
        jacket.clothe();
        pants.clothe();
    }

    @Override
    public void takeOff() {
        footwear.takeOff();
        jacket.takeOff();
        pants.takeOff();
    }

    @Override
    public String toString() {
        return name;
    }
}
