package be.helha.demo.project_course;

import be.helha.demo.project_course.model.ToDo;
import be.helha.demo.project_course.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    ToDoRepository toDoRepository;

    @Value("${welcome.message}")
    private String message;

    @GetMapping("/")
    public String index(Model model) {
        List<ToDo> toDoList = new ArrayList<ToDo>();
        toDoRepository.findAll().forEach(toDoList::add);
        ToDo toDo = new ToDo();
        model.addAttribute("demoMessage", message);
        model.addAttribute("todo", toDo);
        model.addAttribute("todoList", toDoList);
        return "welcome";
    }

    @PostMapping("/add")
    public String addToDo(@ModelAttribute ToDo toDo) {
        toDoRepository.save(toDo);
        return "redirect:/";
    }
}
