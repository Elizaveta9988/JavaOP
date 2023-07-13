package Coffee.AmericanStyle;

public class AmericanRaf implements Coffee  {
    private AmericanRaf() {}

    /**
     * Возвращает объект кофе в определенном стиле (фабричный метод)
     * @return - кофе
     */
    public static Coffee getCoffee() {
        return new AmericanRaf();
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

            System.out.println("Добавляю 120мл сливок");

            sleep(500);

            System.out.println("Добавляю маршмеллоу...");

            sleep(250);

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

