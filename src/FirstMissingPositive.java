public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums={1,2,0};
        System.out.println(cyclic(nums));

    }
    static int cyclic(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i] > 0 && nums[i] < nums.length && nums[correct]!=nums[i]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }

        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return index+1;
            }
        }
        return nums.length+1;

    }
    static void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}

