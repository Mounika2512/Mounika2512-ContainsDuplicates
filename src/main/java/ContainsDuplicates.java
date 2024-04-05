import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true; 
            } else {
                set.add(num);
            }
        }
        return false;
    }
        
    public static void main(String[] args) {
        ContainsDuplicates containsDuplicates = new ContainsDuplicates();
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5, 1,2};
        System.out.println("Array nums1 contains duplicates: " + containsDuplicates.containsDuplicate(nums1));
        System.out.println("Array nums2 contains duplicates: " + containsDuplicates.containsDuplicate(nums2));
    }
}