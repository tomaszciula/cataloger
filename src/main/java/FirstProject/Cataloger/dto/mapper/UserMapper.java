package FirstProject.Cataloger.dto.mapper;

import FirstProject.Cataloger.dto.UserDTO;
import FirstProject.Cataloger.model.User;

public class UserMapper {

    public static User mapToUser(UserDTO userDTO) {
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setName(userDTO.getName());
        user.setPass(userDTO.getPass());
        return user;
    }

    public static UserDTO mapToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setEmail(user.getEmail());
        userDTO.setPass(user.getPass());
        userDTO.setName(user.getName());
        return userDTO;
    }

}
