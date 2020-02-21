package edu.gatech.cs6301.PTTBackendStub;

import edu.gatech.cs6301.PTTBackendStub.Exception.EmptyAttributeException;
import edu.gatech.cs6301.PTTBackendStub.Model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransientStuff {
    public static int lastId = 0;
    public static Map<Integer, User> users = new HashMap<>();

    public static User addUser(User user) throws EmptyAttributeException {
        //add check email blabla
        if (user.getEmail()==null || user.getEmail().isEmpty()||
        user.getFirstName()==null||user.getFirstName().isEmpty()||
        user.getLastName()==null ||user.getLastName().isEmpty()) {
            throw new EmptyAttributeException();
        }
        user.setId(lastId++);
        users.put(user.getId(), user);
        return user;
    }

    public static List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public static User getUserById(int id) {
        if (users.containsKey(id)) {
            return users.get(id);
        }
        return null;
    }


}
