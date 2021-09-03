package angelof.fixture.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Developer {

  private String name;
  private DevType devType;
  private List<DevLanguage> devLanguageList;

}
