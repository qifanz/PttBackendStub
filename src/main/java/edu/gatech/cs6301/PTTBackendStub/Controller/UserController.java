package edu.gatech.cs6301.PTTBackendStub.Controller;

import edu.gatech.cs6301.PTTBackendStub.Exception.EmptyAttributeException;
import edu.gatech.cs6301.PTTBackendStub.Model.User;
import edu.gatech.cs6301.PTTBackendStub.TransientStuff;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class UserController implements UsersControllerInterface {
    @Override
    public ResponseEntity getUsers() {
        return ResponseEntity.ok().body(TransientStuff.getAllUsers());
    }

    @Override
    public ResponseEntity createUser(User user) {
        try {
            return ResponseEntity.ok().body(TransientStuff.addUser(user));
        } catch (EmptyAttributeException e) {
            throw new ResponseStatusException(
                    HttpStatus., "Attribute empty."
            );
        }
    }

    @Override
    public ResponseEntity<User> getUserById(int userId) {
        User user = TransientStuff.getUserById(userId);
        if (user!= null)
            return ResponseEntity.ok(user);
        else
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "entity not found"
            );
    }

    @Override
    public ResponseEntity<User> updateUser(int userId) {
        return null;
    }

    @Override
    public ResponseEntity<User> deleteUserById(int userId) {
        return null;
    }
}
