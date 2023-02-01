package orange.book.fgpoc.service;

import java.util.Map;
import org.springframework.util.MultiValueMap;

public interface Worker {

  String calculate(MultiValueMap<String, String> data);
}
