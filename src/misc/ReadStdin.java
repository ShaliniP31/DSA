package misc;

public class ReadStdin {
    public static void main(String[] args) {
        String str = "1 2 3 4 5";
        String[] strs = str.trim().split("\\s+");
        int[] nums = new int[strs.length];
        for (int i = 0; i<strs.length;i++){
            nums[i] = Integer.parseInt(strs[i]);
        }

        for(int i : nums){
            System.out.println(i);
        }

        str = "[1,2,3,4]";
        str = str.replace("["," ").replace("]"," ").replace(","," ");
        strs = str.trim().split("\\s+");
        nums = new int[strs.length];
        for(int i =0;i<strs.length;i++){
            nums[i] = Integer.parseInt(strs[i]);
        }

        System.out.println();
        for(int i:nums){
            System.out.println(i);
        }

        str = "1, 2 3, 4 5";
        strs = str.replace(","," ").trim().split("\\s+");
        nums = new int[strs.length];
        for(int i=0;i<strs.length;i++){
            nums[i] = Integer.parseInt(strs[i]);
        }
        System.out.println();
        for(int i:nums){
            System.out.println(i);
        }

        System.out.println();
        str = "1 2 3 | 4 5 6";
        String[] parts = str.split("\\|");
        strs = parts[0].trim().split("\\s+");
        nums = new int[strs.length];
        for(int i=0;i<strs.length;i++){
            nums[i] = Integer.parseInt(strs[i]);
        }

        for (int i:nums){
            System.out.println(i);
        }

        strs = parts[1].trim().split("\\s+");
        nums = new int[strs.length];
        for(int i=0;i<strs.length;i++){
            nums[i] = Integer.parseInt(strs[i]);
        }

        for (int i:nums){
            System.out.println(i);
        }


    }
}
