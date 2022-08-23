package co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.entities;
/**
 *		------------------------------------------------------------------------
 *		------------------------ User --------------------------------
 *		------------------------------------------------------------------------
 *
 * CLASE: Entidad principal, siendo la clase que representa a cada uno de los usuarios que ingresan
 * al landing registrando la informacion del mismo
 *
 * @author : Santiago Buitrago
 *
 * @version 1.3 Final
 **/



import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.dto.UserDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
public class User {
    @Id
    @id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
    private String lastName;
    private String email;
    private LocalDateTime createdAt;

    public User(UserDto userDto) {
        id= userDto.getId();
        name = userDto.getName();
        lastName= userDto.getLastName();
        email= userDto.getEmail();
        createdAt= userDto.getCreatedAt();
    }

    public User() {}

    public UserDto toDto(){
        UserDto userDto= new UserDto(id, name, lastName, email, createdAt);
        return userDto;
    }

    public Integer getId() {
        return null;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
