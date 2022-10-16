import java.util.*;
public class test{
    public static void main(String args[]){
        List<String> list1 = new ArrayList<>();
        list1.add("mango");
        list1.add("apple");
        list1.add("banana");
        list1.add("grapes");
        for(String fruit: list1){
            System.out.println(fruit);
        }
    }

    public static void main(String args[]){
        String[] array={"java", "python","PHP","C++"};
        System.out.println("Printing Array: "+ Arrays.toString(array));
        List<String> list = new ArrayList<String>();
        for(String lang:array){
            list.add(lang);
        }
        System.out.println("Printing List: "+ list);

    }

    public static void main(String args[]){
        List<String> fruitlist = new ArrayList<>();
        fruitlist.add("Mango");
        fruitlist.add("banana");
        fruitlist.add("apple");
        fruitlist.add("Strawberry");

        //Converting ArrayList to Array

        String[] array = fruitlist.toArray(new String[fruitlist.size()]);
        System.out.println("Printing Array" + Arrays.toString(array));
        System.out.println("Printing List" + fruitlist);
    }
    public static void main(String args[]){
        LinkedList<String> al = new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

    public static void main(String args[]){
        HashSet<String> set = new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }

    }
    public static void main(String args[]){
        List<String> list1 = new ArrayList<String>();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");
        Collections.sort(list1);
        for(String fruit:list1){
            System.out.println(fruit);
        }
    }*/

    public static void main(String args[]){
    List<Integer> list2 = new ArrayList<Integer>();;
    list2.add(21);
    list2.add(11);
    list2.add(51);
    list2.add(1);
    Collections.sort(list2);
    for(Integer number:list2){
        System.out.println(number);

    }

    }
}