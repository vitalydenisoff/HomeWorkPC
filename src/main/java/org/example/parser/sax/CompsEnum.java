package org.example.parser.sax;

public  enum CompsEnum {
    DEVICES("devices"),
    DEVICE("device"),
    PRICE("price"),
    LOCATION("location"),
    POWERCONSUM("powerconsum"),
    COOLER("cooler"),
    PORT("port"),
    CRITICAL("critical"),
    DATE_OF_ISSUE("dateOfIssue"),
    EXPIRATION("expiration"),
    CompsEnum("compsenum");

    private String location;

    public void Type("type") {

    }

    public void Type (String location, Integer powerconsum, Boolean cooler, String port) {
        this.location = location;

    }


    private String value;

    CompsEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
