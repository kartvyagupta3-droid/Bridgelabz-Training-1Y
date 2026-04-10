import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;

public class DriverDetails extends CheckPoint{
    public String getDriverid() {
        return driverid;
    }

    public void setDriverid(String driverid) {
        this.driverid = driverid;
    }

    String driverid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
}
