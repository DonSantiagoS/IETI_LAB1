package co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.dto;

import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.entities.Status;
import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.entities.Task;

import java.util.Date;

public class TaskDto {
    private String id;
    private String name;
    private String description;
    private Status status;
    private String assignedTo;
    private Date dueDate;
    private Date createdAt;

    public TaskDto(String id, String name, String description, Status status, String assignedTo, Date dueDate, Date createdAt){
        this.id=id;
        this.name=name;
        this.description= description;
        this.status=status;
        this.assignedTo=assignedTo;
        this.dueDate=dueDate;
        this.createdAt=createdAt;
    }
    public TaskDto(Task task){
        this.id=task.getId();
        this.name=task.getName();
        this.description= task.getDescription();
        this.status=task.getStatus();
        this.assignedTo=task.getAssignedTo();
        this.dueDate=task.getDueDate();
        this.createdAt=task.getCreateAd();
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Date getCreateAd() {
        return createdAt;
    }
    public Task toEntiti(){
        Task task= new Task(this);
        return task;
    }
}
