public class Dish {
    private String name;
    private double price;
    private static int id_gen=1;
    private int id;

    public Dish(){
        id = id_gen++;
    }


    public Dish(String name, double price){
        this();
        setPrice(price);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
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
        return "Dish {" + id+". "+
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
