package prog.hei.school.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import prog.hei.school.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
