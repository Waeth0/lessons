package novicePack;

public class OfficeSupplies {
    private String name;
    private int count;

    public OfficeSupplies(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Канцелярия{" +
                "Название='" + name + '\'' +
                ", Количество=" + count +
                '}';
    }
}






