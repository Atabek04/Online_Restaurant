public class Admin {
    private static int id_gen = 0;

    private String password;
    private String name;
    private String surname;


    public Admin(){
        id_gen++;
    }

    public Admin(String name, String surname ,String password){
        setName(name);
        setPassword(password);
        setSurname(surname);
    }

    public int getId() {
        return id_gen;
    }


    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
