package lesson1;

public class MyHomeWork {
    public static void main(String[] args) {
        int money = 1000;
        int pricePizza = 230;// стоимость пиццы
        int priceGum = 26;// стоимость жвачки
        double priceSweet = 2.5;// стоимость конфет
        int amountPizza = money / pricePizza;// количество пиццы
        int deliveryFromPizza = money % pricePizza;
        int amountGum= deliveryFromPizza / priceGum;// количество жвачки
        int deliveryFromGum= deliveryFromPizza % priceGum;
        double amountSweet= deliveryFromGum / priceSweet;// количество конфет
        double deliveryFromSweet = deliveryFromGum % priceSweet;
        System.out.println("На эти деньги мы можем купить:\n"+ amountPizza + " пиццы\n"+ amountGum +
                " жвачки\n"+Math.floor(amountSweet) + " конфеты \nСдача с магазина: " + deliveryFromSweet + " рубля");

    }
}
