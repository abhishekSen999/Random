abstract class Drawable {
    abstract void draw();

    abstract int cube(int x); 
}

class Rectangle extends Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
    public int cube(int x) {
        return x * x * x;
    }
    public int square(int x)
    {
        return x*x;
    }


}

public class TestInterface1 {
    public static void main(String args[]) {
        Drawable d = new Rectangle();
        d.draw();
        System.out.println(d.cube(3));
        //System.out.println(d.square(3));
    }
}