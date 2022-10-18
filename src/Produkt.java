public class Produkt {

    private String name;
    private float price;
    private int days;


    public Produkt(String name, float price, int days){
        this.name=name;
        this.price=price;
        this.days=days;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public float getPrice() {return price;}
    public void setPrice(float price) {this.price = price;}

    public int getDays() {return days;}
    public void setDays(int days) {this.days = days;}



    public void addRabatt(){
        if(days>10 && days<=20)
            price*=0.9;

        if(days>20)
            price*=0.8;
    }

    @Override
    public String toString() {
        return "{" +
                "name=" + name +
                ", price=" + price +
                ", days=" + days +
                '}' + '\n';
    }
}
