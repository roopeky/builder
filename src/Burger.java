import java.util.ArrayList;

public class Burger {
    private Object burger;

    public Burger(ArrayList<BurgerPart> parts) {
        this.burger = parts;
    }

    public Burger(String burgerString) {
        this.burger = burgerString;
    }

    public Object getBurger() {
        return this.burger;
    }
}

abstract class BurgerPart {}

class HesburgerPatty extends BurgerPart {}
class HesburgerCheese extends BurgerPart {}
class HesburgerLettuce extends BurgerPart {}
class HesburgerTomato extends BurgerPart {}
class HesburgerSauce extends BurgerPart {}
