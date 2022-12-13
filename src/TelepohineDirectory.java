import java.util.HashMap;

public class TelepohineDirectory {

    private String fullName;
    private String number;
    private HashMap<String,String> map = new HashMap<>();

    public TelepohineDirectory(String fullName, String number) {
        this.fullName = fullName;
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
