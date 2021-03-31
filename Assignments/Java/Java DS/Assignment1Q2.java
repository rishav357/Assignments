import java.util.Arrays;

class ArmstrongNumBetweenRange {
    public int[] armstrongNumbersInRange(int min, int max) {
        int num, total, temp_num, rem, counter = 0;
        int[] arr = new int[10];
        for (num = min; num < max; num++) {
            total = 0;
            temp_num = num;
            while (temp_num != 0) {
                rem = temp_num % 10;
                total += Math.pow(rem, 3);
                temp_num = temp_num / 10;
            }
            if (total == num) {
                arr[counter] = total;
                counter++;
            }
        }
        return arr;
    }
}

public class Assignment1Q2 {
    public static void main(String[] args) {
        int min = 100;
        int max = 999;

        ArmstrongNumBetweenRange arm = new ArmstrongNumBetweenRange();
        int[] a = arm.armstrongNumbersInRange(min, max);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                break;
            }
            System.out.print(a[i] + " ");
        }
    }
}
