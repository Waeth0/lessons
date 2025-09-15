package OfficeSupplies;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<OfficeSupplies> suppliesList = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public void addSupplies(OfficeSupplies supplies) {
        suppliesList.add(supplies);
    }

    public int getTotalPrice() {
        int sum = 0;
        for (OfficeSupplies supplies : suppliesList) {
            sum += supplies.getPrice();
        }
        return sum;
    }

    public void showInfo() {
        System.out.println(suppliesList);
        System.out.println(name + " Общая стоимость " + getTotalPrice());
    }


}
