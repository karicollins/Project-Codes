import java.util.*;

abstract class MyPerson implements Comparable<MyPerson> {
    protected String name;
    protected String sex;
    protected int age;

    public MyPerson(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        String gender = sex.equalsIgnoreCase("M") ? "male" : "female";
        return name + " is a " + gender + " " + getInfo() + ".";
    }

    @Override
    public int compareTo(MyPerson other) {
        return this.name.compareTo(other.name);
    }
}

class MySinger extends MyPerson {
    private String favoriteSong;

    public MySinger(String name, String sex, int age, String favoriteSong) {
        super(name, sex, age);
        this.favoriteSong = favoriteSong;
    }

    public String getInfo() {
        return "singer of " + age + " years old with favorite song " + favoriteSong;
    }
}

class MyDancer extends MyPerson {
    private String favoriteDance;

    public MyDancer(String name, String sex, int age, String favoriteDance) {
        super(name, sex, age);
        this.favoriteDance = favoriteDance;
    }

    public String getInfo() {
        return "dancer of " + age + " years old with favorite dance " + favoriteDance;
    }
}

public class A5p1 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the number of persons as a command line argument.");
            return;
        }

        int numberOfPersons = Integer.parseInt(args[0]);

        List<MyPerson> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= numberOfPersons; i++) {
            System.out.println("Enter information for person " + i + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Sex('F' or 'M'): ");
            String sex = scanner.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Singer or Dancer('S' or 'D'): ");
            String type = scanner.nextLine();

            if (type.equalsIgnoreCase("S")) {
                System.out.print("Favorite song: ");
                String favoriteSong = scanner.nextLine();
                persons.add(new MySinger(name, sex, age, favoriteSong));
            } else if (type.equalsIgnoreCase("D")) {
                System.out.print("Favorite dance: ");
                String favoriteDance = scanner.nextLine();
                persons.add(new MyDancer(name, sex, age, favoriteDance));
            }

            System.out.println();
        }

        System.out.println("The persons you entered are:");
        for (MyPerson person : persons) {
            System.out.println(person);
        }

        System.out.print("\nSort by age or name('A' or 'N'): ");
        String sortChoice = scanner.nextLine();

        if (sortChoice.equalsIgnoreCase("A")) {
            Collections.sort(persons, Comparator.comparingInt(p -> p.age));
            System.out.println("All the persons sorted by age are:");
            for (MyPerson person : persons) {
                System.out.println(person);
            }
        } else if (sortChoice.equalsIgnoreCase("N")) {
            Collections.sort(persons);
            System.out.println("All the persons sorted by name are:");
            for (MyPerson person : persons) {
                System.out.println(person);
            }
        }

        scanner.close();
    }
}

