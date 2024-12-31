package core_java_8.com.baeldung.java8;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import core_java_8.com.baeldung.java_8_features.User;

public class Java8MethodReferenceUnitTest {
	private List<String> list;

	@Before
	public void init() {
		list = new ArrayList<>();
		list.add("One");
		list.add("OneAndOnly");
		list.add("Derek");
		list.add("Change");
		list.add("factory");
		list.add("justBefore");
		list.add("Italy");
		list.add("Italy");
		list.add("Thursday");
		list.add("");
		list.add("");
	}

	@Test
    public void checkStaticMethodReferences_whenWork_thenCorrect() {

        List<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        
        boolean isReal = users.stream().anyMatch(user -> User.isRealUser(user));
        boolean isRealRef = users.stream().anyMatch(User::isRealUser);
        
        assertTrue(isReal);
        assertTrue(isRealRef);
        
	}
}
