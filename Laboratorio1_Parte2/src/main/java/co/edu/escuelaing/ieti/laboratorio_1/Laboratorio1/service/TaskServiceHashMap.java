package co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.service;

import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.dto.TaskDto;
import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class TaskServiceHashMap implements TaskService {


    private  HashMap<String, Task> taskServiceHashMap;

    public TaskServiceHashMap(){
        this.taskServiceHashMap = new HashMap<String, Task>();
    }

    @Override
    public Task create(TaskDto taskDto) {
        Task task= new Task(taskDto);
        taskServiceHashMap.put(taskDto.getId(),task);
        return task;
    }
    @Override
    public Task findById( String id ){
        return taskServiceHashMap.get(id);
    }
    @Override
    public List<Task> getAll(){
        List tasks=new ArrayList();
        for (Task valor : taskServiceHashMap.values()) {
            tasks.add(valor);
        }
        return tasks;
    }
    @Override
    public boolean deleteById( String id ){
        taskServiceHashMap.remove(id);
        return taskServiceHashMap.containsKey(id);
    }

    @Override
    public Task update( TaskDto taskDto, String id ){
        Task task= new Task(taskDto);
        taskServiceHashMap.replace(id,task);
        return taskServiceHashMap.get(id);

    }
}
