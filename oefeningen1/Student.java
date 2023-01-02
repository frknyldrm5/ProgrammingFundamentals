public class Student {
    private String name;
    private int age;
    private int height;

    public Student(String isim, int age) {
        name = isim;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + " jaar)";
    }
}
