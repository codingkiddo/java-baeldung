package core_java_8.com.baeldung.java_8_features;

import java.util.Optional;

public class OptionalAddress {

    private String street;

    public Optional<String> getStreet() {
        return Optional.ofNullable(street);
    }

    public void setStreet(String street) {
        this.street = street;
    }
}