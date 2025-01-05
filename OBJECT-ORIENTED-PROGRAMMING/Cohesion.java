class UserService {
    public void createUser() {
    System.out.println("User created.");
    }
    public void deleteUser() {
    System.out.println("User deleted.");
    }
}
    public class Cohesion{
    public static void main(String[] args) {
    UserService userService = new UserService();
    userService.createUser();//both the methods related to user only
    userService.deleteUser();
    }
}
/* all the details in the UserService class are focused on serving the user credential 
 * .so they are serving a common purpose by working together . this is known as Cohesion
 */
