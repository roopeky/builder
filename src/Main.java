import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BurgerBuilder hesburgerBuilder = new HesburgerBuilder();
        hesburgerBuilder.addPatty();
        hesburgerBuilder.addCheese();
        hesburgerBuilder.addLettuce();
        hesburgerBuilder.addTomato();
        hesburgerBuilder.addSauce();
        Burger hesburger = hesburgerBuilder.getBurger();

        BurgerBuilder mcdonaldsBuilder = new McDonaldsBuilder();
        mcdonaldsBuilder.addPatty();
        mcdonaldsBuilder.addCheese();
        mcdonaldsBuilder.addLettuce();
        mcdonaldsBuilder.addTomato();
        mcdonaldsBuilder.addSauce();
        Burger mcdonalds = mcdonaldsBuilder.getBurger();

        System.out.println("Hesburger:");
        ArrayList<BurgerPart> hesburgerParts = (ArrayList<BurgerPart>) hesburger.getBurger();
        for (BurgerPart part : hesburgerParts) {
            System.out.println(part.getClass().getSimpleName());
        }

        System.out.println("\nMcDonald's:");
        String mcdonaldsBurger = (String) mcdonalds.getBurger();
        System.out.println(mcdonaldsBurger);
    }
}