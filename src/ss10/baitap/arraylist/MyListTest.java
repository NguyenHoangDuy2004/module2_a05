package ss10.baitap.arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();

        list.add(1,0);
        list.add(2,1);
        list.add(3,2);
        System.out.println(list.clone());
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.add(1));
        System.out.println(list.indexOf(2));

    }
}
