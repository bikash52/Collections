package Generics;

public class A1<T,U> {
    public T name;
    public U id;

    public A1(T name, U id) {
        this.name = name;
        this.id = id;
    }

    public T getName() {
        return name;
    }

    public U getId() {
        return id;
    }
}
