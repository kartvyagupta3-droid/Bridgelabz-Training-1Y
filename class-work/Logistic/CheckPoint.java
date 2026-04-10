public class CheckPoint {
    String checkponit;
    String locatoinName;

    public String getLocatoinName() {
        return locatoinName;
    }

    public void setLocatoinName(String locatoinName) {
        this.locatoinName = locatoinName;
    }

    public int getDistanceFromLast() {
        return distanceFromLast;
    }

    public void setDistanceFromLast(int distanceFromLast) {
        this.distanceFromLast = distanceFromLast;
    }

    public int getActualDuration() {
        return actualDuration;
    }

    public void setActualDuration(int actualDuration) {
        this.actualDuration = actualDuration;
    }

    public int getExpectedDuration() {
        return expectedDuration;
    }

    public void setExpectedDuration(int expectedDuration) {
        this.expectedDuration = expectedDuration;
    }

    public String getCheckponit() {
        return checkponit;
    }

    public void setCheckponit(String checkponit) {
        this.checkponit = checkponit;
    }

    int distanceFromLast;
    int expectedDuration;
    int actualDuration;

}
