package Odev_GenericList;

public class Main {
    public static void main(String[] args) {

        MyList op=new MyList<Integer>(2);
        System.out.println(op.size());
        System.out.println(op.getCapacity());
        op.add(1);
        op.add(2);
        op.add(3);
        op.add(4);
        System.out.println(op.getCapacity());
        System.out.println(op.getItem(2));
        System.out.println(op.remove(2));
        op.setItem(0,4);
        System.out.println(op.toString());
    }
}
