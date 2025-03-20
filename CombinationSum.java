import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    
    public static List<List<Integer>> getCombinations(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        find(nums, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void find(int[] nums, int target, int index, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {  
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0 || index >= nums.length) { 
            return;
        }
        
        current.add(nums[index]);  
        find(nums, target - nums[index], index, current, result); 
        current.remove(current.size() - 1);  
        
        find(nums, target, index + 1, current, result);
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7};
        int target = 7;
        
        List<List<Integer>> result = getCombinations(nums, target);
        
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}
