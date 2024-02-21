import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        int[] list = {1, 6, 6, 4, 3, 2};
        int[] list2 = {1, 0, 0, 4, 3, 2};
        int[] list3 = {1, 6, 0, 4, 3, 2};
        int[] list4 = {};
        ArrayList list01 = new ArrayList();
        ArrayList list02 = new ArrayList();
        ArrayList list03 = new ArrayList();
        ArrayList list04 = new ArrayList();
        Collections.addAll(list01,  1, 6, 6, 4, 3, 2);
        Collections.addAll(list02,  1, 0, 0, 4, 3, 2);
        Collections.addAll(list03,  1, 6, 0, 4, 3, 2);
        System.out.println(sum(list));
        System.out.println(sum(list2));
        System.out.println(sum(list3));
        System.out.println(sum(list4));
        System.out.println(zeroCount(list01));
        System.out.println(zeroCount(list02));
        System.out.println(zeroCount(list03));
        System.out.println(zeroCount(list04));
    }
    public static int sum(int[] list) {
        return sum(list, 0, list.length - 1);
    }
    private static int sum(int[] list, int first, int last) {
        
        if(first == last) {
            return list[first];
        }
        else if(list.length == 0) {
            return 0;
        }
        else {
            int middel = (first + last) / 2;
            int sum01 = sum(list, first, middel);
            int sum02 = sum(list, middel + 1, last);
            return sum01 + sum02;
        }
    }
    public static int zeroCount(ArrayList<Integer> list) {
        return zeroCount(list, 0, list.size());
    }
    public static int zeroCount(ArrayList<Integer> list, int first, int last) {
        if(first == last) {
            if(first == list.size()) {
                return 0;
            }
            if(list.get(first) == 0) {
                return 1;
            }
            else return 0;
        }
        else {
            int middel = (first + last) / 2;
            int sum01 = zeroCount(list, first, middel);
            int sum02 = zeroCount(list, middel + 1, last);
            return sum01 + sum02;
        }
    }
}