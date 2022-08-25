package co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.service;

import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.dto.TaskDto;
import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.entities.Task;

import java.util.List;

public interface TaskService {
        Task create(TaskDto task );
        Task findById( String id );
        List<Task> getAll();
        boolean deleteById( String id );
        Task update( TaskDto taskDto, String id );
}
