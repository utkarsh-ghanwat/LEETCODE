class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left=0;
        int right=numbers.length-1;

        int sum = numbers[left] + numbers[right];

        while(left < right){
            if(sum > target){
                right--;
                sum = numbers[left] + numbers[right];
            }else if (sum < target){
                left++;
                sum = numbers[left] + numbers[right];
            }else {
                return new int[] {left+1,right+1};
            }

        }
        return new int[] {-1,-1};
        
    }
}