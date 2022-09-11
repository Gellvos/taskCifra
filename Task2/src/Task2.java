
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File a = new File(args[0]);
        Scanner sc = new Scanner(a);
        ArrayList<Integer> numbersArr = new ArrayList<>();

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            numbersArr.add(num);
        }
        getMinTurnNum(numbersArr);
    }


    private static void getMinTurnNum(ArrayList<Integer> arrayList) {
        int sum = 0;
        int elemAmount = 0;
        for (Integer num : arrayList) {
            sum += num;
            elemAmount++;
        }
        int midNum = sum / elemAmount;
        int count = 0;
        for (Integer elem : arrayList) {
            while (elem != midNum) {
                if (elem < midNum) {
                    elem++;
                    count++;
                }
                if (elem > midNum) {
                    elem--;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}