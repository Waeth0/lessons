package oop_basic;

/**
 * Разработать спецификацию и создать класс Ручка(Pen). Определить в этом классе equals(), hashCode() и toString()
 *
 */
public class Main {
    public static void main(String[] args) {
        Pen pen=new Pen();
        Pen pen2=new Pen();
        System.out.println(pen.equals(pen2));//true
        System.out.println(pen.hashCode()==pen2.hashCode());//true

        pen.setConstruction(PenConstruction.BALLPOINT);

        System.out.println(pen.equals(pen2));//false
        System.out.println(pen.hashCode()==pen2.hashCode());//false

        System.out.println("Первая Ручка = "+pen.toString());
        System.out.println("Вторая Ручка = "+pen2.toString());

    }
}
