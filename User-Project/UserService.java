public class UserService {

    User users[];
    int count;
    UserService(int size) {
       users = new User[size];
       count=0;
    }

    public void addUser(User user){
        users[count] = user;
        System.out.println((count+1) + " User Added Successfuly");
        count++;
    } 

    public void viewAllUsers() {
        for(int i=0;i<count;i++) {
            System.out.println("\nUser " + (i+1) + "Details");
            System.out.println("User Id: " + users[i].getId());
            System.out.println("User Name: " + users[i].getName());
            System.out.println("User Email: " + users[i].getEmail());
            System.out.println("User Phone: " + users[i].getPhone());

        }
    }
}