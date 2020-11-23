package demo.handler;

public class Person {
    private String name;
    private int age;
    private int birthday;
    private String info;

    public Person(String name, int age, int birthday, String info) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.info = info;
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

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return name +
                "\nage " + age +
                "\nbirthday " + birthday +
                "\ninfo " + info;
    }
}
