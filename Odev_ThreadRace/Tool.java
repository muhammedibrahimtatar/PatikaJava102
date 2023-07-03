package Odev_ThreadRace;

import java.util.ArrayList;
import java.util.List;

public class Tool implements Runnable{
    static List<Integer> evens = new ArrayList<>();
    static List<Integer> odds = new ArrayList<>();

    static List<Integer> q1 = new ArrayList<>();
    static List<Integer> q2 = new ArrayList<>();
    static List<Integer> q3 = new ArrayList<>();
    static List<Integer> q4 = new ArrayList<>();
    List<Integer> tenThousand = new ArrayList<>();
    {
        for (int i = 0;i<10000 ; i++){
            tenThousand.add(i);
        }
        for (int i = 0;i<tenThousand.size();i++){
            if (i<tenThousand.size()/4)
                q1.add(i);
            else if(i < tenThousand.size()/2)
                q2.add(i);
            else if (i < tenThousand.size() *3/4)
                q3.add(i);
            else q4.add(i);
        }
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("Thread-0")){
            for(Integer qi : q1){
                add(qi);
            }
        }
        if (Thread.currentThread().getName().equals("Thread-1")) {
            for(Integer qi : q2){
                add(qi);
            }
        }
        if (Thread.currentThread().getName().equals("Thread-2")) {
            for(Integer qi : q3){
                add(qi);
            }
        }
        if (Thread.currentThread().getName().equals("Thread-3")) {
            for(Integer qi : q4){
                add(qi);
            }
        }
    }
    synchronized void add(int qi){
        if(qi%2==0){
            System.out.println(Thread.currentThread().getName()+" => "+qi);
            evens.add(qi);
        }
        else odds.add(qi);
    }
}