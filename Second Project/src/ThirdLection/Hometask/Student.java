package ThirdLection.Hometask;

public class Student extends Human{
    private String faculty;
    private String group;

    public Student(String firstName, String lastName, String sex, int age, String department, String group) {
        super(firstName, lastName, sex, age);
        this.faculty = department;
        this.group = group;
    }

    public Student() {
    }

    public String getDepartment() {
        return faculty;
    }

    public void setDepartment(String department) {
        this.faculty = department;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", sex='" + super.getSex() + '\'' +
                ", age=" + super.getAge() +
                ", faculty='" + faculty + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
