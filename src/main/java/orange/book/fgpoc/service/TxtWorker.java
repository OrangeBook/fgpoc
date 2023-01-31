package orange.book.fgpoc.service;

import org.springframework.stereotype.Component;

@Component
public class TxtWorker implements Worker {

  @Override
  public String getName() {
    return "txtWorker";
  }
}
