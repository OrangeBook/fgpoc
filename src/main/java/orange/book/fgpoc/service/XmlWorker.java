package orange.book.fgpoc.service;

import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

@Component
public class XmlWorker implements Worker {

  @Override
  public String calculate(MultiValueMap<String, String> data) {
    StringBuilder sb = new StringBuilder("worker xml received data:");
    sb.append(data);
    return sb.toString();
  }
}
