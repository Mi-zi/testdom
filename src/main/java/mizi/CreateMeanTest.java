package mizi;

public class CreateMeanTest {
    public static void main(String[] args) {
        Person2 ming = new Person2();
        ming.setName("  Mi Zi ");
        ming.setAge(15);
        ming.id = 300;
        System.out.println(ming.getName() + "年龄是：" + ming.getAge());
    }
}

class Person2 {
    private String name;
    private int age;

    public int id;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name.strip();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value");

        }
        this.age = age;
    }

}
