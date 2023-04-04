public class McDonaldsBuilder implements BurgerBuilder{
    private StringBuilder sb = new StringBuilder();

    public void addPatty() {
        sb.append("Beef Patty\n");
    }

    public void addCheese() {
        sb.append("Cheese\n");
    }

    public void addLettuce() {
        sb.append("Lettuce\n");
    }

    public void addTomato() {
        sb.append("Tomato\n");
    }

    public void addSauce() {
        sb.append("Sauce\n");
    }

    public Burger getBurger() {
        return new Burger(sb.toString());
    }
}
