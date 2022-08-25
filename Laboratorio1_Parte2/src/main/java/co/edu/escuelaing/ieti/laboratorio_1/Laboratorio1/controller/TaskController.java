package co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.controller;
/**
 *		------------------------------------------------------------------------
 *		------------------------ ActividadController --------------------------------
 *		------------------------------------------------------------------------
 *
 * CLASE: Clase encargada de controlar los endpoints para las diferentes funciones solicitadas,
 * donde se reciben las solicitudes de la aplicacion web
 *
 * @author : Santiago Buitrago
 *
 * @version 1.3 Final
 **/
import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.dto.TaskDto;
import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.entities.Task;
import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/task")
@CrossOrigin(origins = "http://localhost")

public class TaskController {
    @Autowired
    private TaskService taskService ;

    public TaskController(@Autowired TaskService taskServiceHashMap) {
        this.taskService = taskService;
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAll() {
        return ResponseEntity.ok(taskService.getAll());
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<TaskDto> findById(@PathVariable String id ) {
        return ResponseEntity.ok((taskService.findById(id)).toDto());
    }

    @PostMapping
    public ResponseEntity<Task> create( @RequestBody TaskDto taskDto ) {
        return ResponseEntity.ok(taskService.create(taskDto));
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<Task> update( @RequestBody TaskDto taskDto, @PathVariable String id ) {
        return ResponseEntity.ok(taskService.update(taskDto, id));
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id ) {
        return ResponseEntity.ok(taskService.deleteById(id));
    }
}
