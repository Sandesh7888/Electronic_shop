package Project_Java;
public class Warranty {
    private String duration;
    private String description;

    public Warranty(String duration, String description) {
        this.duration = duration;
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }
}
