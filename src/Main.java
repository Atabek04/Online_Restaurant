import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int summa = 0, choice1 = -1;
        boolean isClient = false, isAdmin = false;
        Scanner input = new Scanner(System.in);
        Admin loggedAdmin = null;
        ArrayList<Integer> orders = new ArrayList<Integer>();

//        ============== -Adding some dishes- ==============
        Dish dish1 = new Dish("Manti", 3000);
        Dish dish2 = new Dish("Lagman", 1500);
        Dish dish3 = new Dish("Plov", 2300);
        Dish dish4 = new Dish("Beshbarmaq", 5000);

        ArrayList<Dish> dishes = new ArrayList<Dish>();
        dishes.add(dish1);
        dishes.add(dish2);
        dishes.add(dish3);
        dishes.add(dish4);

//        ============== -Adding some drinks- ==============
        Drink drink1 = new Drink("Qymaz", 500);
        Drink drink2 = new Drink("Black Tea", 200);
        Drink drink3 = new Drink("Green Tea", 300);
        Drink drink4 = new Drink("Coffee", 600);
        Drink drink5 = new Drink("Coke", 400);

        ArrayList<Drink> drinks = new ArrayList<Drink>();
        drinks.add(drink1);
        drinks.add(drink2);
        drinks.add(drink3);
        drinks.add(drink4);
        drinks.add(drink5);


//        ================= -Creating Users- ======================
        Client client1 = new Client("Birzhan", "Zhambasov");
        Client client2 = new Client("Samal", "Aqtolqyn");
        Client client3 = new Client("Bill", "Gates");

        ArrayList<Client> clients = new ArrayList<Client>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);

//        ================= -Creating Admins- ======================
        Admin admin1 = new Admin("kanye","nacilover", "235");
        ArrayList<Admin> admins = new ArrayList<Admin>();
        admins.add(admin1);
//        =============== Displaying Interface ===============
        // 1. Admin
        //    - adding new dishes or drink
        // 2. Client
        //    - make an order
        //    - checkout

        System.out.println("========================");
        System.out.println("== -AITU Restaurant- ==");
        System.out.println("========================\n");

        System.out.print("Welcome to the our restaurant! \n Please enter your name: ");
        String name = input.nextLine();
        System.out.print("Please enter your surname: ");
        String surname = input.nextLine();
        for(Client c : clients){
            if(c.getName().equals(name) && c.getSurname().equals(surname)){
                isClient = true;
            }
        }
        for(Admin a : admins){
            if(a.getName().equals(name) && a.getSurname().equals(surname)){
                isAdmin = true;
                loggedAdmin = a;
            }
        }

        if(isAdmin){
            System.out.println("Enter your password: ");
            String password = input.nextLine();
            if(loggedAdmin.getPassword().equals(password)){
                // actions
            }
        }

        boolean flag1 = true;
        if(isClient){
            while (flag1){
                System.out.println("Please choose one of the options:");
                System.out.println("1. Make an order");
                System.out.println("2. Make a gift");
                System.out.println("3. Bring the bill");
                System.out.println("4. Exit");
                int choice = input.nextInt();
                input.nextLine();
                switch(choice){
                    case 1:
                        System.out.printf("|%-10s | %-30s | %-15s |%n", "No", "Dish Name", "Price");
                        for(Dish dish:dishes){
                            System.out.printf("|%-10d | %-30s | %15f |%n"  ,dish.getId(), dish.getName(), dish.getPrice());
                        }
                        while (true){
                            System.out.print("Make a choice (-1 for exist) :  ");
                            choice1 = input.nextInt();

                            if(choice1 == -1){
                                System.out.println();
                                break;
                            }

                            orders.add(choice1-1);

                            summa += dishes.get(choice1-1).getPrice();

                        }
                        break;
                    case 3:
                        System.out.printf("|%-10s | %-30s | %-15s |%n", "No", "Dish Name", "Price");
                        for(Integer o:orders){
                            System.out.printf("|%-10d | %-30s | %15f |%n"  , dishes.get(o).getId(), dishes.get(o).getName(), dishes.get(o).getPrice());
                        }
                        System.out.printf("%nTotal price: %d%n%n", summa);
                        break;

                    case 4:
                        System.out.println("Goodbye");
                        flag1 = false;
                }
            }
        }


    }
}