package constructor;
/*Sure, here are five coding questions based on Java constructors that utilize all constructor types at different levels of difficulty:

Level 3:
3. Write a Java class `Book` with four fields, `title`, `author`, `year`, and `isbn`, and constructors that initialize the fields using default, parameterized, copy, and chaining constructors. Add a method `toString()` that returns a string representation of the book.

Level 4:
4. Write a Java class `Song` with five fields, `title`, `artist`, `album`, `year`, and `duration`, and constructors that initialize the fields using default, parameterized, copy, chaining, and varargs constructors. Add a method `play()` that plays the song.

Level 5:
5. Write a Java class `Employee` with six fields, `name`, `age`, `salary`, `department`, `address`, and `phone`, and constructors that initialize the fields using default, parameterized, copy, chaining, varargs, and private constructors. Add methods `getSalary()` that returns the salary and `setSalary(double salary)` that sets the salary field.

Note: The private constructor is used to enforce the singleton pattern, which ensures that only one instance of the class can exist at a time. */

class Employee {
    private String name;
    private int age;
    private int salary;
    private String department;
    private String address;
    private int phone;

    private static Employee e = null;

    // Singleton
    static Employee getinstance() {
        if (e == null)
            return new Employee();
        return e;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    private Employee() {
        this(4);
        name = "lorem";
        age = 000;
        salary = 000;
        department = "lorem";
        address = "lorem";
        phone = 000;
    }
    /// constructor overload
    Employee(int age) {
        this.age = age;
    }

    Employee(String name, int age, int salary, String department, String address, int phone) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.address = address;
        this.phone = phone;
    }

    Employee(Employee ref) {
        name = ref.name;
        age = ref.age;
        salary = ref.salary;
        department = ref.department;
        address = ref.address;
        phone = ref.phone;
    }

    Employee(String... args) {
        for (String vars : args) {
            System.out.println(String.valueOf(vars));
        }
    }
}

class Song {
    private String title;
    private String artist;
    private String album;
    private String duration;
    private int year;

    Song() {
        this("A.R rehaman");
        title = "sa re ga ma pa";
        artist = "ar malik";
        album = "kids";
        duration = "1:30";
        year = 2091;
    }

    Song(String artist) {
        this.artist = artist;
    }

    Song(String title, String artist, String album, String duration, int year) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.year = year;
    }

    Song(Song ref) {
        this.title = ref.title;
        this.artist = ref.artist;
        this.album = ref.album;
        this.duration = ref.duration;
        this.year = ref.year;
    }

    Song(String... args) {
        for (String vars : args) {
            System.out.println(String.valueOf(vars));
        }
    }

    public void play() {
        System.out.println("playing song:" + title);
    }
}

class Book {
    private String title;
    private String author;
    private int year;
    private String isbn;

    Book() {
        title = "jungle book";
        author = "M.K ROY";
        year = 2011;
        isbn = "#1235HFSEFD";
    }

    Book(String title, String author, int year, String isbn) {

        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    Book(Book ref) {
        title = ref.title;
        author = ref.author;
        year = ref.year;
        isbn = ref.isbn;
    }

    public String tostring() {
        return title + " by " + author + " (" + year + ")";
    }
}

class Fraction {
    private int numerator;
    private int denominator;

    Fraction() {
        numerator = 0;
        denominator = 1;
    }

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    Fraction(Fraction other) {
        numerator = other.numerator;
        denominator = other.denominator;
        System.out.println(numerator + " " + denominator);
    }

    public void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}

/**
 * practiceWCW
 */
public class ConstructorPractice {

    public static void main(String[] args) {
        Fraction f = new Fraction(2, 5);
        Fraction f2 = new Fraction(f);
        System.out.println();

    }
}