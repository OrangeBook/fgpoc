package orange.book.fgpoc.service;

import org.springframework.stereotype.Component;

@Component
public class XmlWorker implements Worker {

  @Override
  public String getName() {
    return "xmlWorker";
  }
}
