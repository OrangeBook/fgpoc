package orange.book.fgpoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

  @GetMapping("/")
  public String hello() {
    return "hello";
  }
}
