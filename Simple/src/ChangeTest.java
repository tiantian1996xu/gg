public class ChangeTest {
    public static void main(String[] args){
        Simple originalSimple = new Simple(5);
        changeSimpleValue1(originalSimple);
        System.out.println(originalSimple.value);

        Simple oringinalSimple2 = new Simple(5);
        oringinalSimple2 = changeSimpleValue3(originalSimple);
        System.out.println(oringinalSimple2.value);

        Simple originalsimpel3 = new Simple(5);
        changeSimpleValue3(originalSimple);
        System.out.println(originalsimpel3.value);

        int x = 5;
        changeIntValue(x);
        System.out.println(x);
    }
    private static void changeSimpleValue1(Simple simple){
        Simple newSimple = new Simple(10);
        simple = newSimple;
    }

    private static void changeSimpleValue2(Simple simple){
        simple.value = 10;
    }

    private static Simple changeSimpleValue3(Simple simple){
        Simple newSimple = new Simple(10);
        return newSimple;

    }

    private static void changeIntValue(int x){
        x = 10;
    }
}
