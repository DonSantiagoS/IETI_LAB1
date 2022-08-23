package co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.dto;

/**
 *		------------------------------------------------------------------------
 *		------------------------ UserDto ---------------------------------------
 *		------------------------------------------------------------------------
 *
 * CLASE: Clase encargada de ser un mapeo de la entidad Usuario de manera que
 * proporciona seguridad en el momento de ser utilizada la entidad, ya que no se
 * entrega la propia entidad
 *
 * @author : Santiago Buitrago
 *
 * @version 1.3 Final
 **/

import org.apache.catalina.User;
import java.time.LocalDateTime;

public class UserDto {

    private Integer id;
    private String name;
    private String lastName;
    private String email;
    private LocalDateTime createdAt;

    public UserDto (Integer id, String name, String lasName, String email, LocalDateTime createdAt){
        this.id=id;
        this.name=name;
        this.lastName=lastName;
        this.email=email;
        this.createdAt=createdAt;
    }

    public User toEntity(){
        User user= new User(id, name, lastName, email, createdAt);
        return user;
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}