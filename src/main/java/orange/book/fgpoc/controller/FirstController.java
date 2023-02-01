package orange.book.fgpoc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import orange.book.fgpoc.config.WorkersConfiguration;
import orange.book.fgpoc.service.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

  @Autowired
  private WorkersConfiguration config;

  @Autowired
  public List<Worker> workers;

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
    model.addAttribute("workers", config.getWorkers());
    return "hello";
  }

  @PostMapping(value = "/calculate",
      consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)

  @ResponseBody
  public String calculated(@RequestBody MultiValueMap<String, String> formData) {
    System.out.println(formData);
    return "Jellp";

  }



}
