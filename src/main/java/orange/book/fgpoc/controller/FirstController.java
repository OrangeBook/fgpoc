package orange.book.fgpoc.controller;

import java.util.List;
import orange.book.fgpoc.config.WorkersConfiguration;
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
  private WorkersConfiguration config;

  @Autowired
  public List<Worker> workers;

  @Value("${name}")
  String name;

  @GetMapping("/workers")
  @ResponseBody
  public String getWorkers() {
    StringBuilder sb = new StringBuilder();
    sb.append("We have such workers: ");
    sb.append("</br>");
    sb.append(workers.toString());
    sb.append("</br>");
    sb.append("We have such configuration:");
    sb.append("</br>");
    sb.append(config.toString());
    return sb.toString();
  }

  @GetMapping("/")
  public String hello(Model model) {
    System.out.println(name);
    model.addAttribute("name", name);
    return "hello";
  }
}
