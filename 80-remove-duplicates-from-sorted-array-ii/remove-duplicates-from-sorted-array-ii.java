import java.util.ArrayList;
import java.util.List;

class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for (int num:nums) {
            int c=0;
            for (int x:l) {
                if (x==num) {
                    c++;
                }
            }
            if (c<2) {
                l.add(num);
            }
        }
        for(int i=0;i<l.size();i++){
            nums[i]=l.get(i);
        }
        return l.size();
    }
}