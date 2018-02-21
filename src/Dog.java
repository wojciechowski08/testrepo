public class Dog implements Comparable<Dog> {

    private double weight;
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public void bark() {
        System.out.print("bark");
    }

    @Override
    public int compareTo(Dog o) {
        if (this.weight > o.weight)         { return 1; }
        else if (this.weight < o.weight)    { return -1; }
        else                                { return 0; }
    }
}
