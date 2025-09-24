package sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;


public class NovicePack {
    public static List<OfficeSupplies> suppliesList = new ArrayList<>();

    public NovicePack() {
        suppliesList.add(new Liner(2, 1323));
        suppliesList.add(new Pen(6, 3123));
        suppliesList.add(new Erasier(2, 300));

    }

    public static List<OfficeSupplies> getSuppliesList() {
        return suppliesList;
    }

    public void showStarterKit() {
        System.out.println(suppliesList);
    }


}






