package Module_6;

import java.util.Arrays;

/**
 * Created by Z570 on 31.03.2017.
 */
public class UsersMain {


    public static User user1 = new User(1, "Alex", "Bush", 1000, 1200);
    public static User user2 = new User(1, "Alex", "Bush", 1000, 1200);
    public static User user3 = new User(2, "Bill", "Obama", 1200, 1400);
    public static User user4 = new User(3, "Max", "Klinton", 1600, 1500);
    public static User user5 = new User(4, "Moysha", "Abramovich", 1900, 1600);
    public static User user6 = new User(5, "George", "Milan", 1400, 1400);
    public static User user7 = new User(0, null, null, 0, 0);
    public static User users [] = {user1, user2, user3, user4, user5, user6};
    public static User users2 [] = {user2, user3, user4, user5, user6, user7};

    public static void main(String[] args) {

        // Show Unique Users -------------------------------------
        User[] uncUsers = UserUtils.uniqueUsers(users);
        System.out.println("\n Unique Users: ");
        for (int i = 0; i < uncUsers.length; i++) {
            System.out.println("id-"+uncUsers[i].getId()+" | Name: "+uncUsers[i].getFirstName()+" | Surname: "+uncUsers[i].getLastName()+" | salary: "+uncUsers[i].getSalary()+" | balance: "+uncUsers[i].getBalance());
        }

        // Show Users With Balance -------------------------------------
        User[] balUsers = UserUtils.usersWithContitionalBalance(users, 1400);
        if(balUsers.length >= 1){
            System.out.println("\n Users With Balance "+balUsers[0].getBalance()+": ");
        }else{
            System.out.println("\n No users found with this balance");
        }

        for (int i = 0; i < balUsers.length; i++) {
            System.out.println("id-"+balUsers[i].getId()+" | Name: "+balUsers[i].getFirstName()+" | Surname: "+balUsers[i].getLastName()+" | salary: "+balUsers[i].getSalary()+" | balance: "+balUsers[i].getBalance());
        }

        // Pay Salary -------------------------------------
        User[] paySalary = UserUtils.paySalaryToUsers(UserUtils.uniqueUsers(users));
        System.out.println("\n Users Balance After Pay Salary:");
        for (int i = 0; i < paySalary.length; i++) {
            System.out.println("id-"+paySalary[i].getId()+" | Name: "+paySalary[i].getFirstName()+" | Surname: "+paySalary[i].getLastName()+" | salary: "+paySalary[i].getSalary()+" | balance: "+paySalary[i].getBalance());
        }

        // Get Users ID -------------------------------------
        long[] usersID = UserUtils.getUsersId(uncUsers);
        System.out.println("\n Users ID: ");
        System.out.println(Arrays.toString(usersID));

        // Delete Empty Users -------------------------------
        User[] noEmptyUser = UserUtils.deleteEmptyUsers(users2);
        System.out.println("\n Array Without Empty Users:");
        for (int i = 0; i < noEmptyUser.length; i++) {
            System.out.println("id-"+noEmptyUser[i].getId()+" | Name: "+noEmptyUser[i].getFirstName()+" | Surname: "+noEmptyUser[i].getLastName()+" | salary: "+noEmptyUser[i].getSalary()+" | balance: "+noEmptyUser[i].getBalance());
        }
    }


}
