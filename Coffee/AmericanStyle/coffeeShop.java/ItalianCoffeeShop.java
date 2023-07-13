package Coffee.AmericanStyle.coffeeShop.java;
/**
 * Сеть кафе в Итальянском стиле (фабрика)
 */
public class ItalianCoffeeShop extends CoffeeShop{
     /**
     * Создает конкретную реализацию кофе (фабричный метод)
     *
     * @param type - тип кофе
     * @return - объект определенного типа
     */
    protected Coffee createCoffee(CoffeeType type) throws Exception {
        switch (type) {
            case AMERICANO:
                return ItalianAmericano.getCoffee();
            case LATTE:
                return ItalianLatte.getCoffee();
            case RAF:
                return ItalianRaf.getCoffee();
            default:
                throw new Exception("Такого кофе нет, можете выбрать что-то, что есть в нашем ассортименте");
        }
    }
}

