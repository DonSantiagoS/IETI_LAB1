package co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.service;

import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.dto.UserDto;
import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.entities.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceHashmap implements UserService {

    private HashMap<Integer, User> HashMapUsers;

    public UserServiceHashmap(){
        HashMapUsers= new HashMap<Integer, User>();
    }

    @Override
    public User create(UserDto userDto) {
        User user= userDto.toEntity();
        HashMapUsers.put(userDto.getId(),user);
        return user;
    }

    @Override
    public User findById(String id) {
        return HashMapUsers.get(id);
    }

    @Override
    public List<User> getAll() {
        return (List<User>) HashMapUsers;
    }

    @Override
    public void deleteById(String id) {
        HashMapUsers.remove(id);
    }

    @Override
    public User update(User user, String userId) {
        HashMapUsers[userId]=user;
        return HashMapUsers[userId];
    }
}
