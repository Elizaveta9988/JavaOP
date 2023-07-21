package Coffee.AmericanStyle.ItalianStyle;
/**
 * Раф в Итальянском стиле
 */
public class ItalianRaf  implements Coffee {
    private ItalianRaf() {}

    /**
     * Возвращает кофе в определенном стиле (фабричный метод)
     * @return - кофе
     */
    public static Coffee getCoffee() {
        return new ItalianRaf();
    }

    /**
     * Метод, который готовит кофе
     */
    public void prepareCoffee() {
        try {
            System.out.println("Высыпаю молотый кофе в турку");
            System.out.println("Вливаю 60мл воды в турку");
            System.out.println("Добавляю сахар\n");
            System.out.println("Варю кофе...\n");

            sleep(1000);

            System.out.println("Выливаю сваренный экспрессе в стакан");
            System.out.println("Добавляю 120мл сливок");
            System.out.println("Успех! Раф в Итальянском стиле приготовлено!");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Метод, который нальет кофе в стакан
     */
    public void pourCoffee() {
        System.out.println("Наливаю Раф в стакан");
    }
}

