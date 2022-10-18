import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produkt> list= new ArrayList<>();

        Produkt prod1= new Produkt("mere",15,10);
        Produkt prod2= new Produkt("pere",20,11);
        Produkt prod3= new Produkt("mere",30,15);
        Produkt prod4= new Produkt("mere",15,20);

        list.add(prod1);
        list.add(prod2);
        list.add(prod3);
        list.add(prod4);


        System.out.println(list);


    }


}