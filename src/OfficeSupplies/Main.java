package OfficeSupplies;
/**
Напишите приложение, позволяющее вести учет канцелярских товаров на рабочем месте сотрудника. Определите полную стоимость канцтоваров у определенного сотрудника
 */
public class Main {
    public static void main(String[] args) {
        Person Pasha = new Person("Pasha");
        Pasha.addSupplies(new Pen("Ручка", 35, 8));
        Pasha.addSupplies(new Liner("Ластик", 16, 45));
        Pasha.showInfo();

        Person Anton = new Person("Anton");
        Anton.addSupplies(new Erasier("Карандаш", 13, 1023));
        Anton.showInfo();

    }
}
