package orange.book.fgpoc.config;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import orange.book.fgpoc.service.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

  @Autowired
  List<Worker> workers;

  @Bean
  @Qualifier("workers")
  public Map<String, Worker> getWorkersMap() {
    HashMap<String, Worker> map = new HashMap<>();
    return workers.stream()
        .collect(Collectors.toMap( (Worker worker) -> worker.getClass().toString(), (Worker worker) -> worker));

  }
}
