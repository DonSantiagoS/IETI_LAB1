package co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.entities;

import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.dto.TaskDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;
    private String name;
    private String description;
    private Status status;
    private String assignedTo;
    private Date dueDate;
    private Date createdAt;

    public Task(TaskDto taskDto) {
        this.id=taskDto.getId();
        this.name=taskDto.getName();
        this.description= taskDto.getDescription();
        this.status=taskDto.getStatus();
        this.assignedTo=taskDto.getAssignedTo();
        this.dueDate=taskDto.getDueDate();
        this.createdAt=taskDto.getCreateAd();
    }

    public TaskDto toDto() {
        TaskDto taskDto= new TaskDto(this);

        return taskDto;
    }

    public Task(){}
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
}
