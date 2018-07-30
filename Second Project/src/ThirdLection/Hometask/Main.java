package ThirdLection.Hometask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan","Petrov","Male",20,"IT","IT-1");
        Student student2 = new Student("Klara","Cetkina","Female",19,"IT","IT-1");
        Student student3 = new Student("Bohdan","Stupka","Male",19,"IT","IT-1");
        Student student4 = new Student("Alexandr","Vasiliev","Male",20,"IT","IT-1");
        Student student5 = new Student("Vasiliy","Prianoev","Male",20,"IT","IT-1");
        Student student6 = new Student("Elena","Shmel","Female",21,"IT","IT-1");
        Student student7 = new Student("Kristina","Shmel","Female",18,"IT","IT-1");
        Student student8 = new Student("Anna","Krut","Female",19,"IT","IT-1");
        Student student9 = new Student("Leonid","Smal","Male",19,"IT","IT-1");
        Student student10 = new Student("Roman","Yan","Male",20,"IT","IT-1");
        Student student11 = new Student("Ihor","Varnik","Male",19,"IT","IT-1");


        //String firstName, String lastName, String sex, int age, String department, String group)
        Group group = new Group();
        //System.out.println(group);

        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);
        group.addStudent(student6);
        group.addStudent(student7);
        group.addStudent(student8);
        group.addStudent(student9);
        group.addStudent(student10);
        group.addStudent(student11);
        group.delStudent(student9);
        group.addStudent(student11);

        //group.sortStudents();
        //group.sortStudents();
        //System.out.println(group.getStudent("Alex","Yelis"));
        //System.out.println(group.compareTo(student));
        System.out.println(group);
        System.out.println(group.getStudent("Vasylisa"));
        System.out.println(group.getStudent("Shmel"));

    }
}
