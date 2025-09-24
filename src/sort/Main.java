package sort;

import java.util.Comparator;
import java.util.List;


/**
 * "Используйте "набор новичка" или другую любую коллекццию объекторв. Остортируйте вещи в этом наборе по стоимости, по наименованию, по стоимости и наименованию"
 */
public class Main {
    public static void main(String[] args) {
        NovicePack Pasha = new NovicePack();
        Pasha.showStarterKit();
        SortMethod.sortName(NovicePack.getSuppliesList());
        SortMethod.sortCount(NovicePack.getSuppliesList());
        SortMethod.sortPrice(NovicePack.getSuppliesList());
    }


}
