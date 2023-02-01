package orange.book.fgpoc.config;

import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import orange.book.fgpoc.model.Field;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class WorkersConfiguration {

  public Map<String, List<Field>> workers;

  @Override
  public String toString() {
    return "WorkersConfiguration{" +
        "workers=" + workers +
        '}';
  }

  public Map<String, List<Field>> getWorkers() {
    return workers;
  }

  public void setWorkers(
      Map<String, List<Field>> workers) {
    this.workers = workers;
  }
}
