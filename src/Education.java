import java.util.ArrayList;
import java.util.Collections;

public class Education {
    private ArrayList<String> schools;

    public Education() {
        schools = new ArrayList<>();
        Collections.addAll(schools, "Harvard", "Princeton", "Yale", "Stanford",
                "Carnegie Mellon", "UMBC", "Dartmouth", "Cornell", "MIT", "Johns Hopkins");
    }

    public ArrayList<String> getSchools() {
        return schools;
    }

    public void setSchools(ArrayList<String> schools) {
        this.schools = schools;
    }

    public String toString() {
        return "Schools: " + this.schools;
    }
}
