public class Cat {

    //Поля класса
    double weight;
    String name;
    int age;
    String color;

    //Методы класса
    void meow() {
        System.out.println("Meow");
    }

    void pee() {
        weight -= 20;
    }

    void eat() {
        weight += 50;
        System.out.println(weight);
    }

    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.meow();
        barsik.eat();
        barsik.color = "Blue";
    }
}
