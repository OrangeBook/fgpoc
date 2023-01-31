package orange.book.fgpoc.controller;

import java.util.List;
import orange.book.fgpoc.service.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

  @Autowired
  public List<Worker> workers;

  @Value("${name}")
  String name;

  @GetMapping("/workers")
  @ResponseBody
  public String getWorkers() {
    StringBuilder sb = new StringBuilder();
    sb.append("We have such workers: \n");
    sb.append(workers.toString());
    return sb.toString();
  }

  @GetMapping("/")
  public String hello(Model model) {
    System.out.println(name);
    model.addAttribute("name", name);
    return "hello";
  }
}
