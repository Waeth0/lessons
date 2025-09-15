package OfficeSupplies;

public class OfficeSupplies {
    private String name;
    private int cost;
    private int count;

    public OfficeSupplies(String name, int cost, int count) {
        this.name = name;
        this.cost = cost;
        this.count = count;
    }

    public int getPrice() {
        return cost * count;
    }

    @Override
    public String toString() {
        return
                " Название предмета= " + name + '\'' + "  " +
                        " цена= " + cost + "р  " +
                        " количество= " + count + "шт " + '\n';

    }
}


