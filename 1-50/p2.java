import java.util.*;
public class p2{
     public static void main(String []args){
        ArrayList<Integer> my_arr = new ArrayList<Integer>();
        my_arr.add(1);
        my_arr.add(1);
        int returned = 0;
        while (my_arr.get(my_arr.size()-1)<4*1000000) {
            int n = my_arr.size();
            int last = my_arr.get(n-1);
            if (last % 2 == 0) {
                returned += last;
            }
            int newval = my_arr.get(n-2)+my_arr.get(n-1);
            my_arr.add(newval);
        }
        System.out.print(returned);
     }
}