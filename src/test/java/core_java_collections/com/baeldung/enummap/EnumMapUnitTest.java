package core_java_collections.com.baeldung.enummap;

import static org.assertj.core.api.Assertions.assertThatCode;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class EnumMapUnitTest {

	public enum DayOfWeek {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	
	@Test
    public void whenContructedWithEnumType_ThenOnlyAcceptThatAsKey() {
        Map dayMap = new EnumMap<>(DayOfWeek.class);
        assertThatCode(
          () -> dayMap.put(TimeUnit.NANOSECONDS, "NANOSECONDS"))
          .isInstanceOf(ClassCastException.class);
    }
}
