package edu.gatech.cs6301.PTTBackendStub.Controller;

import edu.gatech.cs6301.PTTBackendStub.Model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public interface UsersControllerInterface {

    @GetMapping("/users")
    public ResponseEntity getUsers();

    @PostMapping("/users")
    public ResponseEntity createUser(@RequestBody User user);

    @GetMapping("/users/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable int userId);

    @PutMapping("/users/{userId}")
    public ResponseEntity updateUser(@PathVariable int userId);

    @DeleteMapping("/users/{userId}")
    public ResponseEntity deleteUserById(@PathVariable int userId);
}
