import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;

public class Passenger {


    private String name;
    private int contactInformation;
    private int uniqueId;

    public Passenger(String name, int contactInformation, int uniqueId) {
        this.name = name;
        this.contactInformation = contactInformation;
        this.uniqueId = uniqueId;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(int contactInformation) {
        this.contactInformation = contactInformation;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", contactInformation=" + contactInformation +
                ", uniqueId=" + uniqueId +
                '}';
    }
}
