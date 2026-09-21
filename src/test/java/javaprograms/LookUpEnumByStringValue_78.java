package javaprograms;

enum Status {
    SUCCESS("200"),
    ERROR("500"),
    NOT_FOUND("404");

    private final String value;

    Status(String value) {
        this.value = value;
    }

    public static Status fromValue(String value) {
        for (Status status : Status.values()) {
            if (status.value.equals(value)) {
                return status;
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }
}

public class LookUpEnumByStringValue_78 {
    static void main() {
        String value = "404";

        Status status = Status.fromValue(value);

        System.out.println(status);
    }

}