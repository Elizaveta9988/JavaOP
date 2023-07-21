package Coffee.AmericanStyle.ItalianStyle;
/**
 * Латте в Итальянском стиле
 */
public class ItalianLatte  implements Coffee {
    private ItalianLatte() {}

    /**
     * Возвращает кофе в определенном стиле (фабричный метод)
     * @return - кофе
     */
    public static Coffee getCoffee() {
        return new ItalianLatte();
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
            System.out.println("Добавляю 120мл молока");
            System.out.println("Успех! Латте в Итальянском стиле приготовлено!");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Метод, который нальет кофе в стакан
     */
    public void pourCoffee() {
        System.out.println("Наливаю Латте в стакан");
    }
}

