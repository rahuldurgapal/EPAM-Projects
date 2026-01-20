import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       StudentService service = new StudentService(5);
             while(true) {
                 System.out.println("1. Add Students");
                 System.out.println("2. View Students");
                 System.out.println("3. Update Students ");
                 System.out.println("4. View Student by Id");
                 System.out.println("5. Delete Student");
                 System.out.println("6. Exit");

                 System.out.println("\n Choose Option: ");
                 int choice = sc.nextInt();

                 switch(choice) {
                     case 1:
                         Student s = new Student();
                         System.out.println("Enter ID: ");
                         System.out.println("Enter Student uid: ");
                         int uid = sc.nextInt();
                         s.setUid(uid);
                         System.out.println("Enter Student name: ");
                         String name = sc.nextLine();
                         s.setName(name);
                         System.out.println("Enter Student age: ");
                         int age = sc.nextInt();
                         s.setAge(age);
                         System.out.println("Enter Student address: ");
                         String address = sc.nextLine();
                         s.setAddress(address);

                         service.addStudent(s);
                         break;
                    case 2:
                        service.viewAllStudents();
                        break;

                     case 3:
                         System.out.println("Enter Id to update: ");
                         int id = sc.nextInt();

                         System.out.println("Enter Student name ");
                         String sname = sc.nextLine();
                         System.out.println("Enter Student age ");
                         int sage = sc.nextInt();
                         System.out.println("Enter Student Address ");
                         String saddress = sc.nextLine();
                         service.updateStudent(id, sname, sage, saddress);
                         break;

                     case 5:
                         System.out.println("Enter Id: to delete");
                         int did = sc.nextInt();
                         service.deleteStudent(did);
                         break;




                 }
             }
        }
    }
