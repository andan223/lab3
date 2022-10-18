import java.util.ArrayList;
import java.util.List;

public class Methoden {

    public void price100(List<Produkt> prod) {

        List<Produkt> new_list = new ArrayList<>();

        for (int i = 0; i < prod.size(); i++)
            if (prod.get(i).getPrice() > 100)
                new_list.add(prod.get(i));

        System.out.println(new_list);
    }

    public void sort_Rabatt(List<Produkt> prod){

        List<Produkt> new_list = new ArrayList<>();

        for (var p : new_list) {
            p.addRabatt();
            new_list.add(p);
        }

        System.out.println(new_list);
    }
}
