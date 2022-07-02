abstract class Shape {
    abstract void shapeName();
}

interface Action{
    void action();
}

class Circle extends Shape implements Action{
    @Override
    void shapeName() {
        System.out.println("I'm Circle");
    }

    @Override
    public void action() {
        System.out.println("I can roll");
    }
}

class Rectangle extends Shape{
    @Override
    void shapeName(){
        System.out.println("I'm Rectangle");
    }
}

public class TestShape {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.shapeName();
        c.action();
    }
}
