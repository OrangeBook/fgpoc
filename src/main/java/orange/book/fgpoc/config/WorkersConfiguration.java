package orange.book.fgpoc.config;

import java.util.List;
import java.util.Map;
import orange.book.fgpoc.model.Field;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.javapoet.FieldSpec;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class WorkersConfiguration {

// public List<Field> fields;

  public List<Map<String, List<Field>>> workers;

  @Override
  public String toString() {
    return "WorkersConfiguration{" +
        "workers=" + workers +
        '}';
  }

  public List<Map<String, List<Field>>> getWorkers() {
    return workers;
  }

  public void setWorkers(
      List<Map<String, List<Field>>> workers) {
    this.workers = workers;
  }
}
