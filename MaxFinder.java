import java.util.*;

public class MaxFinder {
    public static int findThirdMax(int[][] array) {
        ArrayList numbers = new ArrayList();
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int num = array[i][j];
                boolean exists = false;
                
                for (int k = 0; k < numbers.size(); k++) {
                    if ((int) numbers.get(k) == num) {
                        exists = true;
                        break;
                    }
                }
                
                if (!exists) {
                    numbers.add(num);
                }
            }
        }
        
        Collections.sort(numbers, Collections.reverseOrder());
        
        if (numbers.size() < 3) {
            return -1;
        }
        return (int) numbers.get(2);
    }

    public static void main(String[] args) {
        int[][] array = {
            {10, 20, 30},
            {5, 25, 35},
            {40, 20, 15}
        };
        
        int thirdMax = findThirdMax(array);
        System.out.println("Third maximum number: " + thirdMax);
    }
}
