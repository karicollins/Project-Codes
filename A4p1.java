import java.util.Scanner;

class Person {
    private String name;
    private String sex;
    protected int age;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is a ";
    }
}

class Singer extends Person {
    private String favoriteSong;
    private String sex;
    public Singer(String name, String sex, int age, String favoriteSong) {
        super(name, sex, age);
        this.sex=sex;
        this.favoriteSong = favoriteSong;
    }

    @Override
    public String toString() {
        return super.toString() + ((sex.equals("M"))?"male":"female") + " singer of " + age + " years old" + " with favorite song " + favoriteSong + ".";
    }
}

class Dancer extends Person {
    private String favoriteDance;
    private String sex;
    public Dancer(String name, String sex, int age, String favoriteDance) {
        super(name, sex, age);
        this.sex=sex;
        this.favoriteDance = favoriteDance;
    }

    @Override
    public String toString() {
        return super.toString() + ((sex.equals("M"))?"male":"female") + " dancer of " + age + " years old" + " with favorite dance " + favoriteDance + ".";
    }
}

public class A4p1 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the number of persons as a command line argument.");
            return;
        }

        int numberOfPersons = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);

        Person[] persons = new Person[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter information for person " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Sex('F' or 'M'): ");
            String sex = scanner.next();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            

            System.out.print("Singer or Dancer('S' or 'D'): ");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("S")) {
                System.out.print("Favorite song: ");
                String favoriteSong = scanner.next();
                persons[i] = new Singer(name, sex, age, favoriteSong);
            } else if (choice.equalsIgnoreCase("D")) {
                System.out.print("Favorite dance: ");
                String favoriteDance = scanner.next();
                persons[i] = new Dancer(name, sex, age, favoriteDance);
                
            }
            System.out.println();
        }

        System.out.println("The persons you entered are:");
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}

