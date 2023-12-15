import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private char sex;
    private int age;

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
}

public class A3p1 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the number of students as the first command line argument.");
            return;
        }

        int numStudents = Integer.parseInt(args[0]);

        List<Student> students = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= numStudents; i++) {
            System.out.println("Enter information for student " + i + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Sex('F' or 'M'): ");
            char sex = scanner.nextLine().charAt(0);
            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println();
            
            students.add(new Student(name, sex, age));
        }

        System.out.println("The students you entered are:");
        for (Student student : students) {
            System.out.println(student.getName() + " is a " + (student.getSex() == 'F' ? "female" : "male") + " student of age " + student.getAge() + ".");
        }

        int minMaleAge = Integer.MAX_VALUE;
        int maxFemaleAge = Integer.MIN_VALUE;

        List<Student> youngestMales = new ArrayList<>();
        List<Student> oldestFemales = new ArrayList<>();

        for (Student student : students) {
            if (student.getSex() == 'M') {
                if (student.getAge() < minMaleAge) {
                    minMaleAge = student.getAge();
                    youngestMales.clear();
                    youngestMales.add(student);
                } else if (student.getAge() == minMaleAge) {
                    youngestMales.add(student);
                }
            } else {
                if (student.getAge() > maxFemaleAge) {
                    maxFemaleAge = student.getAge();
                    oldestFemales.clear();
                    oldestFemales.add(student);
                } else if (student.getAge() == maxFemaleAge) {
                    oldestFemales.add(student);
                }
            }
        }

        System.out.println("\nThe oldest female students are:");
        for (Student student : oldestFemales) {
            System.out.println(student.getName() + " (age " + student.getAge() + ").");
        }

        System.out.println("\nThe youngest male students are:");
        for (Student student : youngestMales) {
            System.out.println(student.getName() + " (age " + student.getAge() + ").");
        }
    }
}
