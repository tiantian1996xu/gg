public class JavaTester {
    static int x = 11;
    private int y = 33;
    public void run(int x){
        JavaTester t = new JavaTester();
        this.x = 22;
        y= 44;
        System.out.println("x: "+ x);
        System.out.println("Test.x: " + JavaTester.x);
        System.out.println("t.x: " + t.y);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " +y);
    }
}
