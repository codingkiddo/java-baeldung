package core_java_string_operations.com.baeldung.emptystrings;

public class EmptyStringCheck {

	public boolean isEmptyString(String string) {
		return string == null || string.isEmpty();
	}
}
