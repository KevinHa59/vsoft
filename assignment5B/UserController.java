package assignment.assignment5B;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UserController {
    private User[] users;

    public UserController() {
        users = new User[]{};
    }

    // register
    public void register(User user){
        User[] tempUsers = Arrays.copyOf(users, users.length+1);
        tempUsers[tempUsers.length-1] = user;
        users = tempUsers;
        System.out.println(users[users.length-1]);
    }

    // Login
    public  boolean login(String username, String password){
        for(int i = 0; i < users.length; i++){
            if(users[i].getUsername().equals(username)){
                if(users[i].getPassword().equals(password)){
                    return true;
                }
            }
        }
        return false;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
}
