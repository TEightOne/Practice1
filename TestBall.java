public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball ("Andrey", 5, "Adidas");
        Ball b2 = new Ball ("Anton", 3, "Nike");
        Ball b3 = new Ball ("Maxim",4);
        b3.setBrand("Puma");
        System.out.println(b2);
        b1.Ball();
        b2.Ball();
        b3.Ball();
    }
}