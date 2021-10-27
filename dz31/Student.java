package dz31;

public class Student extends Human {

    private long recordBookNumber;
    private String groupName;

    public Student(String name, String lastName, int age, Gender gender, long recordBookNumber, String groupName) {
        super(name, lastName, age, gender);
        this.recordBookNumber = recordBookNumber;
        this.groupName = groupName;
    }

    public Student() {
    }

    public long getRecordBookNumber() {
        return recordBookNumber;
    }

    public void setRecordBookNumber(long recordBookNumber) {
        this.recordBookNumber = recordBookNumber;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "recordBookNumber=" + recordBookNumber +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
