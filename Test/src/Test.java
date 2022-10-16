public class Test {
    public void sayHello(){
        String name = "jack";
        int age = 18;
        System.out.println("my name is " + name + ". i am age "+age);
        foo();
    }
        private void foo(){
            System.out.println("inside foo");
            bar();
        }
        private void bar(){
            System.out.println("inside bar");
            baz();
        }
        private void baz(){
            System.out.println("inside baz");
        }
        public static void main(String[] arg){
          //  Test t = new Test();
           // t.sayHello();
            System.out.println("hi");
            int number = 10;
            System.out.println(number);
        }


}
