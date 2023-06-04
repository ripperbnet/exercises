public class ThirdTask {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5 };

        nums[0] = nums[4];

        nums[4] = nums[0];

        System.out.println(nums[nums.length-5] + nums[nums.length-3]);
    }


}
