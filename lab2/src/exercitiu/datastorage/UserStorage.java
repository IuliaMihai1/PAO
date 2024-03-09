package exercitiu.datastorage;

import exercitiu.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {
    private Map<String, User> users = new HashMap<>();

    public void createUser(User user) {
        users.put(user.getUsername(), user);
        System.out.println("Created user: " + user);
    }

    public void updateUser(User user) {
        if (users.containsKey(user.getUsername())) {
            users.put(user.getUsername(), user);
            System.out.println("Updated user: " + user);
        } else {
            System.out.println("User does not exist!");
        }
    }

    public void deleteUser(String username) {
        if (users.containsKey(username)) {
            users.remove(username);
            System.out.println("Removed user: " + username);
        } else {
            System.out.println("User does not exist!");
        }
    }

    public void getUser(String username) {
        if (users.containsKey(username)) {
            User user = users.get(username);
            System.out.println("User details: " + user);
        } else {
            System.out.println("User does not exist!");
        }
    }

    public void getAllUsers() {
        for (Map.Entry<String, User> entry : users.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public int getTotalOfUsers() {
        return users.size();

    }
}
