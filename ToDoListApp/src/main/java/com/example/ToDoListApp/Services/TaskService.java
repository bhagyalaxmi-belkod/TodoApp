package com.example.ToDoListApp.Services;

import com.example.ToDoListApp.Model.Task;
import com.example.ToDoListApp.Repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepo taskRepo;

    public Task createNewTask(Task task){
        return taskRepo.save(task);
    }

    public List<Task> getAllTask(){
        return taskRepo.findAll();
    }

    public Task findTaskById(Long id){
        return taskRepo.getById(id);
    }

    public List<Task> findAllCompletedTask(){
        return taskRepo.findByCompletedTrue();
    }

    public List<Task> findAllIncompleteTask(){
        return taskRepo.findByCompletedFalse();
    }

    public void deleteTask(Long id) {
        taskRepo.deleteById(id);
    }

    public Task updateTask(Task task) {
        return taskRepo.save(task);
    }

}
