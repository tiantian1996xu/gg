import java.io.*;
import java.util.*;


class MyCode {
    /**
     * 1. Question: Why the amap size is 3? Instead of 4 even though we called put() method 3 times
     *    Answer:
     *  In the main method we only create 3 new objects , even we set a2 = a , they are the same object so the size is 3
     * 2. Fixed the code(Apple class) to let the map treat the apples with the same color as the same key. So the amap size will be 1. Output should be "map size is 1"
     * * DO NOT Change the main method
     */
    public static void main(String[] args){
        Apple a = new Apple("red", 10);
        Apple a1 = new Apple("red", 10);
        Apple a2 = a;
        Apple a3 = new Apple("red", 20);

        Map<Apple, String> amap = new HashMap<>();
        amap.put(a,"one apple");
        amap.put(a1,"two apples");
        amap.put(a2,"three apples");
        amap.put(a3,"four apples");

        System.out.printf("map size is %s \n", amap.size());
    }
}


class Apple {
    private int price;
    private String color;
    HashSet<String> set = new HashSet();
    public Apple(String color,int price) {

        this.price = price;
        this.color = color;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                '}';
    }
}



### How to create List

        The ArrayList and LinkedList classes provide the implementation of List interface. Let's see the examples to create the List:

        ```java
        //Creating a List of type String using ArrayList
        List<String> list=new ArrayList<String>();

        //Creating a List of type Integer using ArrayList
        List<Integer> list=new ArrayList<Integer>();

        //Creating a List of type Book using ArrayList
        List<Book> list= new ArrayList<Book>();

        //Creating a List of type String using LinkedList
        List<String> list=new LinkedList<String>();




        import java.util.*;
public class ListExample1{
    public static void main(String args[]){
        //Creating a List
        List<String> list=new ArrayList<String>();
        //Adding elements in the List
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Iterating the List element using for-each loop
        for(String fruit:list)
            System.out.println(fruit);

    }
}


//How to convert Array to List
import java.util.*;
public class ArrayToListExample{
    public static void main(String args[]){
        //Creating Array
        String[] array={"Java","Python","PHP","C++"};
        System.out.println("Printing Array: "+Arrays.toString(array));
        //Converting Array to List
        List<String> list=new ArrayList<String>();
        for(String lang:array){
            list.add(lang);
        }
        System.out.println("Printing List: "+list);

    }
}

output
Printing Array: [Java, Python, PHP, C++]
Printing List: [Java, Python, PHP, C++]


import java.util.*;
public class ListToArrayExample{
    public static void main(String args[]){
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        //Converting ArrayList to Array
        String[] array = fruitList.toArray(new String[fruitList.size()]);
        System.out.println("Printing Array: "+Arrays.toString(array));
        System.out.println("Printing List: "+fruitList);
    }
}

import java.util.*;
public class LinkedList1{
    public static void main(String args[]){

        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}


import java.util.*;
class HashSet2{
    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        //Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

