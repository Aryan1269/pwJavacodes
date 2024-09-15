import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //basically array but we are using wrapper class
        ArrayList<Integer> li = new ArrayList<>();

        li.add(98);
        li.add(11);
        li.add(12);
        li.add(1,4);
        
        //operation
        li.remove(1);
        li.remove(Integer.valueOf(12)); // remove given element

        System.out.println(li.contains(Integer.valueOf(12))); //if elem present or not
        
        /// To display meth1 and meth2
        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }

        System.out.println(li); //[98,11]

        //store any datatype in array

        ArrayList li2 = new ArrayList<>();
        li2.add("hi");
        li2.add(true);
        li2.add(18);
        li2.add(7.5);
        System.out.println(li2);

    }
}
