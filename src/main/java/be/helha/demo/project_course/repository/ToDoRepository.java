package be.helha.demo.project_course.repository;

import be.helha.demo.project_course.model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
