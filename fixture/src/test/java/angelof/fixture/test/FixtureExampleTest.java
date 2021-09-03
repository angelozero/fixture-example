package angelof.fixture.test;

import angelof.fixture.domain.Developer;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FixtureExampleTest {

  @BeforeAll
  public static void setup() {
    FixtureFactoryLoader.loadTemplates("angelof.fixture.template");
  }

  @Test
  void testFixture() {

    Developer developerJava = Fixture.from(Developer.class).gimme("dev Java");

    List<Developer> developerBackendJavaPythonList = Fixture.from(Developer.class).gimme(2, "dev Java", "dev Python");
    List<Developer> developerFullList = Fixture.from(Developer.class).gimme(3, "dev Java", "dev Node", "dev Fullstack");
    List<Developer> developerBackendList = Fixture.from(Developer.class).gimme(4, "dev Java");

    assertNotNull(developerJava);

    assertNotNull(developerBackendJavaPythonList);
    assertEquals(2, developerBackendJavaPythonList.size());

    assertNotNull(developerFullList);
    assertEquals(3, developerFullList.size());

    assertNotNull(developerBackendList);
    assertEquals(4, developerBackendList.size());
  }
}
