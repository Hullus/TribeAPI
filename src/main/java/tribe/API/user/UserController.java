package tribe.API.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserRepository userRepo;

    @GetMapping()
    public String getUsers() {
        return "Howdy";
    }

    @PostMapping()
    public void addUser(@RequestBody User user) {
        userRepo.save(user);
    }

    @DeleteMapping("/{id}")
    public void DeleteUser(@PathVariable String id) {
        userRepo.deleteById(id);
    }
    
    @PutMapping()
    public void updateUser() {
    }
}