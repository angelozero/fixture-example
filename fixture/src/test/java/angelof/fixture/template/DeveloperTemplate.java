package angelof.fixture.template;

import angelof.fixture.domain.DevType;
import angelof.fixture.domain.Developer;
import angelof.fixture.domain.DevLanguage;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;


public class DeveloperTemplate implements TemplateLoader {
  @Override
  public void load() {
    Fixture.of(Developer.class)

      .addTemplate("dev Java", new Rule() {{
        add("name", "Angelo");
        add("devType", one(DevType.class, "Backend"));
        add("devLanguageList", has(1).of(DevLanguage.class, "Java"));
      }})

      .addTemplate("dev Python", new Rule() {{
        add("name", "Fabio");
        add("devType", one(DevType.class, "Backend"));
        add("devLanguageList", has(1).of(DevLanguage.class, "Python"));
      }})

      .addTemplate("dev Node", new Rule() {{
        add("name", "Carlos");
        add("devType", one(DevType.class, "Frontend"));
        add("devLanguageList", has(2).of(DevLanguage.class, "Node", "Angular"));
      }})

      .addTemplate("dev Fullstack", new Rule() {{
        add("name", "Fernanda");
        add("devType", one(DevType.class, "Fullstack"));
        add("devLanguageList", has(3).of(DevLanguage.class, "Angular", "Java", "Node"));
      }});
  }
}
