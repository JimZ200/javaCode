import java.util.*;
public class gloveList {
    public static void main(String[] args) {
       // hello h = new hello2("Jim");
        printNum(5);
        int[] list = {1,3,2,1,4,7,8,3};

        System.out.println("Sort:");
        sort2(list);
        for(int i =1; i<list.length; i++) {
            int temp = list[i];
            int j = i - 1;
            for(; j>=0 && list[j] > temp; j-- ){
                list[j+1] = list[j];
            }
            list[j + 1] = temp;
        }

        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;

        arr2[0] = 5;
        arr1[2] = 9;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Queue<Integer> sss = new LinkedList<>();
        sss.add(1);
        sss.add(2);
        sss.add(3);

        System.out.println();
        while(!sss.isEmpty()) {
            System.out.println(sss.remove());
        }

    }
    static void printNum(int x){
        //int temp =0;
        for(int i =1; i<= x; i++) {
            for(int j =1; j <= i; j++ ) {
                System.out.print(j);
                //temp+= j;
            }
            System.out.println();
           // temp =1;
        }
    }
    void remove(String x, ArrayList<String> list2){
        ArrayList<String> temp = new ArrayList<>();
        for(String i : list2) {
            if (x.equalsIgnoreCase(i)) {
                temp.add(i);
            }
        }

        for(String i : temp) {
            list2.remove(i);
        }
    }
    static void sort2(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
