package orange.book.fgpoc.service;

import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

@Component
public class ExcelWorker implements Worker {

  @Override
  public String calculate(MultiValueMap<String, String> data) {
    StringBuilder sb = new StringBuilder("excel worker received data:");
    sb.append(data);
    return sb.toString();
  }
}
