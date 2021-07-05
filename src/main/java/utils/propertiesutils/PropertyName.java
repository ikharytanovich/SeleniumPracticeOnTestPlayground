package utils.propertiesutils;

public enum PropertyName {
    DRIVER_SRC("driver.src");

    private final String value;

    PropertyName(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
