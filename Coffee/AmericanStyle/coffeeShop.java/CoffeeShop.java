package Coffee.AmericanStyle.coffeeShop.java;

/**
 * Структура работы кафе в разных стилях
 */
public abstract class CoffeeShop {
     /**
     * Готовит кофе заказанного типа
     * @param type - тип кофе
     * @return - возвращает кофе заказанного типа
     */
    public Coffee orderCoffee(CoffeeType type) throws Exception {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
            case LATTE:
            case RAF: {
                coffee = createCoffee(type);
                break;
            }
        }

        coffee.prepareCoffee();
        coffee.pourCoffee();

        return coffee;
    }

    /**
     * Создает конкретную реализацию кофе (фабричный метод)
     * @param type - тип кофе
     * @return - объект определенного типа
     */
    protected abstract Coffee createCoffee(CoffeeType type) throws Exception;
}

