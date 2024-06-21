package com.danwys.SpringBootStudy.Controller;

import com.danwys.SpringBootStudy.Model.User;
import com.danwys.SpringBootStudy.Repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {
    private final UserRepository userRepository;

    public ApiController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String getPage() {
        return "Hi mum";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public String saveUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        return String.format("Saved with id: %s", savedUser.getId());
    }
    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return String.format("Deleted user with id: %s", id);
    }

    @PutMapping("/users/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody User user) {
        User updatedUser = userRepository.findById(id).get();
        updatedUser.setName(user.getName());
        updatedUser.setAttribute(user.getAttribute());
        userRepository.save(updatedUser);
        return String.format("Updated user with id: %s", id);
    }
}
