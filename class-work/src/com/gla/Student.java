package src.com.gla;

public class Student extends Person{

    private int year;
    private long rollNo;
    private Branch branch;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getRollNo() {
        return rollNo;
    }

    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
