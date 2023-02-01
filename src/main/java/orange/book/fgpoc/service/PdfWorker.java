package orange.book.fgpoc.service;

import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

@Component
public class PdfWorker implements Worker {


  @Override
  public String calculate(MultiValueMap<String, String> data) {
    StringBuilder sb = new StringBuilder("pdf worker received data:");
    sb.append(data);
    return sb.toString();
  }
}
