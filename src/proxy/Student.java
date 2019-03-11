package proxy;

public class Student implements Person {
    @Override
    public void study() {
        System.out.println("student study");
    }

    @Override
    public int getid(int i) {
        return i;
    }

    @Override
    public void eat() {
        System.out.println("student eat");
    }
}
