package com.javalesson.interfaces;

public class InterfaceRunner {
    public static void main(String[] args) {

        Pricable pizza = new Pizza("Neopolitana", 1, 20, Size.L);
        Pricable phone = new CellPhone("Motorolla", "XT1575", 1, 250);
        Pricable frige = new Frige("LG", "E9090", 1, 300);

        printDeliveryPrice(pizza);
        printDeliveryPrice(phone);
        printDeliveryPrice(frige);
    }

    private static void printDeliveryPrice(Pricable del) {
        System.out.println("Delivery price " + del.calcDeliveryPrice());
           System.out.println("Delivery price " + del.calcOrderPrice());
        System.out.println("Full price is " + del.calcPrice());
}
}
