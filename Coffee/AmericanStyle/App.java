package Coffee.AmericanStyle;
/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        try {
            CoffeeShop americanCoffeeShop = new AmericanCoffeeShop();
            CoffeeShop italianCoffeeShop = new ItalianCoffeeShop();

            americanCoffeeShop.orderCoffee(CoffeeType.AMERICANO);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

