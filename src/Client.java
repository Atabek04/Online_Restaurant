public class Client {
    private  String Name;
    private  String Surname;
    private static int id_gen = 0;
    private int id;

    public Client(){
        id_gen++;
    }
    public Client(String Name, String Surname){
        setName(Name);
        setSurname(Surname);
    }
    public int getId() {
        return id;
    }

    public String getSurname() {
        return Surname;
    }

    public String getName() {
        return Name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return id + " : " + " " + Name + " " + Surname;
    }
}
