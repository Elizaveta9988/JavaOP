package Coffee.AmericanStyle;
/**
 * Латте в Американском стиле
 */
public class AmericanLatte implements Coffee {
    private AmericanLatte() {}

    /**
     * Возвращает объект кофе в определенном стиле (фабричный метод)
     * @return - кофе
     */
    public static Coffee getCoffee() {
        return new AmericanLatte();
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

            sleep(250);

            System.out.println("Добавляю 120мл молока");

            sleep(500);

            System.out.println("Добавляю маршмеллоу...");

            sleep(250);

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

