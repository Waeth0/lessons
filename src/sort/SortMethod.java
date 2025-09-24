package sort;

import java.util.List;
import java.util.Comparator;

public class SortMethod extends NovicePack {

    public static void sortCount(List<OfficeSupplies> getSuppliesList) {
        getSuppliesList.sort(Comparator.comparing(OfficeSupplies::getCount));
        System.out.println("Сортировка по количеству ");

        System.out.println(getSuppliesList);
    }

    public static void sortName(List<OfficeSupplies> getSuppliesList) {
        getSuppliesList.sort(Comparator.comparing(OfficeSupplies::getName));
        System.out.println("Сортировка по имени ");
        System.out.println(getSuppliesList);
    }

    public static void sortPrice(List<OfficeSupplies> getSuppliesList) {
        getSuppliesList.sort(Comparator.comparing(OfficeSupplies::getPrice));
        System.out.println("Сортировка по цене ");
        System.out.println(getSuppliesList);
    }

    public static void sortNamePrice(List<OfficeSupplies> getSuppliesList) {
        getSuppliesList.sort(Comparator.comparing(OfficeSupplies::getPrice));
    }
}