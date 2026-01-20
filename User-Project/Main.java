import java.util.Scanner;
public class Main {
   
   public static void main(String[] args) {

     System.out.println("Welcome to User Management System...\n\n\n");
     UserService service = new UserService(5);

     System.out.println("Enter 5 Users Details..\n\n");
    Scanner sc = new Scanner(System.in);
     for(int i=1;i<=5;i++) {
        System.out.println("Enter "+ i + " User Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter " + i + " User Name: ");
        String name = sc.nextLine();
        System.out.println("Enter " + i + " User Email: ");
        String email = sc.nextLine();
        System.out.println("Enter " + i + " User Phone no.: ");
        String phone = sc.nextLine();
        User u = new User(id, name, email, phone);
        service.addUser(u);
     }

     System.out.println("\n\nAll Users Details\n\n");
     service.viewAllUsers();

   }
}
