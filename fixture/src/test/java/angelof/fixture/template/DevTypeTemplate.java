package angelof.fixture.template;

import angelof.fixture.domain.DevType;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

import java.util.UUID;

public class DevTypeTemplate implements TemplateLoader {
  @Override
  public void load() {
    Fixture.of(DevType.class)
      .addTemplate("Fullstack", new Rule() {{
        add("description", "this is a description of a Fullstack developer - ID:" + UUID.randomUUID());
      }})

      .addTemplate("Frontend", new Rule() {{
        add("description", "this is a description of a Frontend developer - ID: " + UUID.randomUUID());
      }})

      .addTemplate("Backend", new Rule() {{
        add("description", "this is a description of a Backend developer - ID:" + UUID.randomUUID());
      }});
  }
}
