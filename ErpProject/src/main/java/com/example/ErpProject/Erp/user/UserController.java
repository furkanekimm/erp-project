package com.example.ErpProject.Erp.user;

import com.example.ErpProject.Erp.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @GetMapping("/")
    public List<User> getUsers(){
        return userService.getAllUser();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
