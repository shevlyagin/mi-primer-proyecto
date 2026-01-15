package test;

public class Test {

    static void main() {

        Cat cat = new Cat();
        cat.setPrivateName("Barsik");

        System.out.println(cat.getPrivateName());

        Cat barsik = new Cat("Barsik");
    }
}
