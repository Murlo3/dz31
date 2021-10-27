package dz31;

public class Human {
    private String Name;
    private String LastName;
    private int age;
    private Gender gender;

    public Human(String name, String lastName, int age, Gender gender) {
        Name = name;
        LastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public Human() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
