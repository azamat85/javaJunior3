package lesson1;

public class MyHomeWork {
    public static void main(String[] args) {
        int money = 1000;
        int pricePizza = 230;// ��������� �����
        int priceGum = 26;// ��������� ������
        double priceSweet = 2.5;// ��������� ������
        int amountPizza = money / pricePizza;// ���������� �����
        int deliveryFromPizza = money % pricePizza;
        int amountGum= deliveryFromPizza / priceGum;// ���������� ������
        int deliveryFromGum= deliveryFromPizza % priceGum;
        double amountSweet= deliveryFromGum / priceSweet;// ���������� ������
        double deliveryFromSweet = deliveryFromGum % priceSweet;
        System.out.println("�� ��� ������ �� ����� ������:\n"+ amountPizza + " �����\n"+ amountGum +
                " ������\n"+Math.floor(amountSweet) + " ������� \n����� � ��������: " + deliveryFromSweet + " �����");

    }
}
