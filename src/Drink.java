public class Drink {
    private String name;
    private double price;
    static int id=0;

    public Drink(){
        id++;
    }

    public Drink(String name, double price){
        setPrice(price);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink {" + id+". "+
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
