package FirstProject.Cataloger.controller;

import FirstProject.Cataloger.model.CatalogerUser;
import FirstProject.Cataloger.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    List<CatalogerUser> all() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    CatalogerUser newUser(@RequestBody CatalogerUser newUser) {
        return userRepository.save(newUser);
    }

    @PutMapping("/users/{id}")
    CatalogerUser updateUser(@RequestBody CatalogerUser newUser, @PathVariable Long id) {
        return userRepository.findById(id).map(item -> {
                    item.setName(newUser.getName());
                    item.setPass(newUser.getPass());
                    item.setEmail(newUser.getEmail());
                    return userRepository.save(item);
                })
                .orElseGet(() -> {
                    newUser.setId(id);
                    return userRepository.save(newUser);
                });
    }

    @DeleteMapping("/users/{id}")
    void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }

}
