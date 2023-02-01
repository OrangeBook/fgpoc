package orange.book.fgpoc.controller;

import java.util.Map;
import orange.book.fgpoc.config.WorkersConfiguration;
import orange.book.fgpoc.service.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @Autowired
  private WorkersConfiguration config;

  @Autowired
  public Map<String, Worker> workers;

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("workers", config.getWorkers());
    return "index";
  }

  @PostMapping( value = "/calculate",
                consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  @ResponseBody
  public String calculate(@RequestBody MultiValueMap<String, String> formData) {
    StringBuilder sb = new StringBuilder();
    sb.append("Form data:");
    sb.append(formData);
    sb.append("</br>");
    sb.append("</br>");

    sb.append("Available workers:");
    sb.append("</br>");
    sb.append(workers);

    String workerName = formData.getFirst("worker");
    Worker worker = workers.get(workerName);
    sb.append("</br>");
    sb.append("</br>");
    sb.append("Chosen worker:" + worker.toString());
    sb.append("</br>");
    sb.append(worker.calculate(formData));
    return sb.toString();
  }



}
