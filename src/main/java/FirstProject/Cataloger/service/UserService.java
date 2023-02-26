package FirstProject.Cataloger.service;

import FirstProject.Cataloger.dto.UserDTO;
import FirstProject.Cataloger.dto.mapper.UserMapper;
import FirstProject.Cataloger.model.User;
import FirstProject.Cataloger.repo.UseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UseRepo useRepo;

    @Autowired
    public UserService(UseRepo useRepo) {
        this.useRepo = useRepo;
    }

    public UserDTO addUser(UserDTO userDTO){
        useRepo.save(UserMapper.mapToUser(userDTO));
        return userDTO;
    }

    public UserDTO editUser(UserDTO userDTO, Long userId){
        User user = useRepo.findById(userId).orElseThrow();
        user.setPass(userDTO.getPass());
        user.setEmail(userDTO.getEmail());
        user.setName(userDTO.getName());
        useRepo.save(user);
        return UserMapper.mapToDTO(user);
    }
    public void deleteUser(Long userId){
        useRepo.deleteById(userId);
    }

}
