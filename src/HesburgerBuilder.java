import java.util.ArrayList;

public class HesburgerBuilder implements BurgerBuilder{
    private ArrayList<BurgerPart> parts = new ArrayList<BurgerPart>();

    public void addPatty() {
        parts.add(new HesburgerPatty());
    }

    public void addCheese() {
        parts.add(new HesburgerCheese());
    }

    public void addLettuce() {
        parts.add(new HesburgerLettuce());
    }

    public void addTomato() {
        parts.add(new HesburgerTomato());
    }

    public void addSauce() {
        parts.add(new HesburgerSauce());
    }

    public Burger getBurger() {
        return new Burger(parts);
    }
}
