package co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.service;
/**
 *		------------------------------------------------------------------------
 *		------------------------ UserService --------------------------------
 *		------------------------------------------------------------------------
 *
 * INTERFAZ: Encargada de proponer los diferentes servicios mediante funciones que
 * se pueden implementar a necesidad de lo requerido
 *
 * @author : Santiago Buitrago
 *
 * @version 1.3 Final
 **/


import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User create(UserDto userDto );
    User findById( String id );
    List<User> getAll();
    void deleteById( String id );
    User update( User user, String userId );

}
