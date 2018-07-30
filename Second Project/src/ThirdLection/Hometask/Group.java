package ThirdLection.Hometask;

import java.util.Arrays;

public class Group{
    private Student[] group = new Student[10];

    public void addStudent(Student student) {

        for (int i = 0; i < group.length; i++) {
            try {
                if (group[i] == null) {
                    group[i] = student;
                    System.out.println(String.format("Student %s %s joined the group!", group[i].getFirstName(), group[i].getLastName()));
                    break;
                } else if (group[i] != null && i == group.length - 1) {
                    throw new GroupException();
                }
            } catch (GroupException e) {
                System.out.println(e.getString(student.getFirstName(), student.getLastName()));
            }
        }

    }

    public void delStudent(Student student) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] == student) {
                System.out.println(String.format("Student %s %s was send down!", group[i].getFirstName(), group[i].getLastName()));
                group[i] = null;
            }
        }

    }

    public String getStudent(String lastName) {
        String str = "";
        for (int i = 0; i < group.length; i++) {
            if (group[i].getLastName().equals(lastName)) {
                str = group[i].toString() + "\n" + str;
            }
        }
        return str.length() > 0 ? str : String.format("Student %s not found", lastName);
    }


    @Override
    public String toString() {
        String[] arr = Arrays.toString(group).split("}, ");
        Arrays.sort(arr);
        return "Group{" +
                (group == null ? null : Arrays.toString(arr)) +
                '}';
    }
}
