package novicePack;

import java.util.ArrayList;
import java.util.List;

public class NovicePack {
    private List<OfficeSupplies> suppliesList = new ArrayList<>();

    public NovicePack() {
        suppliesList.add(new Liner(4));
        suppliesList.add(new Pen(3));
        suppliesList.add(new Erasier(1));
    }

    public void showStarterKit() {
        System.out.println(suppliesList);
    }


}






