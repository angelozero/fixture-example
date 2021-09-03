package angelof.fixture.template;

import angelof.fixture.domain.DevLanguage;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class TypeLanguageTemplate implements TemplateLoader {
  @Override
  public void load() {
    Fixture.of(DevLanguage.class)
      .addTemplate("Java", new Rule() {{
        add("description", "Java 8");
      }})

      .addTemplate("Node", new Rule() {{
        add("description", "Node JS");
      }})

      .addTemplate("Python", new Rule() {{
        add("description", "Python 3.9.7");
      }})

      .addTemplate("Angular", new Rule() {{
        add("description", "Angular JS");
      }});
  }
}
