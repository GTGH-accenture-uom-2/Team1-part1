import java.util.List;

public class VaccinationCenter {
    private String code;
    private String address;  // Corrected instance variable name
    private List<String> timeslots;

    // Constructor
    public VaccinationCenter(String code, String address, List<String> timeslots) {
        this.code = code;
        this.address = address;
        this.timeslots = timeslots;
    }

    // Getter methods
    public String getCode() {
        return code;
    }

    public String getAddress() {
        return address;
    }

    public List<String> getTimeslots() {
        return timeslots;
    }

    // Setter methods
    public void setCode(String code) {
        this.code = code;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTimeslots(List<String> timeslots) {
        this.timeslots = timeslots;
    }
}
