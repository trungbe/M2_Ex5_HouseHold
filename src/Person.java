public class Person {
    public static final int CURRENT_YEAR = 2021;
    private String name;
    private int yearOfBirth;
    private String job;

    public Person(String name, int yearOfBirth, String job) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.job = job;
    }

    public int getAge() {
        return CURRENT_YEAR - yearOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", job='" + job + '\'' +
                '}';
    }
}
