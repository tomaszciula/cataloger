package FirstProject.Cataloger.controller;

import FirstProject.Cataloger.dto.UserDTO;
import FirstProject.Cataloger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("cataloger/user/add")
    public UserDTO add(UserDTO userDTO) {
        userService.addUser(userDTO);
        return userDTO;
    }

    @PutMapping("cataloger/user/{userId}")
    public UserDTO editUser(UserDTO userDTO, Long userId) {
        return userService.editUser(userDTO, userId);
    }

    @DeleteMapping("cataloger/user/{userId}")
    public void deleteUser(Long userId) {
        userService.deleteUser(userId);
    }

}
