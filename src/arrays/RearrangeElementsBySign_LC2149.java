package arrays;

public class RearrangeElementsBySign_LC2149 {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        //Output: [3,-2,1,-5,2,-4]
        int[] res = rearrangeArray(nums);
        for(int num:res){
            System.out.print(num+" ");
        }
    }

    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int e = 0, o = 1;
        for(int num:nums){
            if(num>0){
                res[e] = num;
                e = e+2;
            } else{
                res[o] = num;
                o=o+2;
            }
        }
        return res;
    }
}
