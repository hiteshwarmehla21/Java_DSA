package Arrays.RePractise;

public class trappingRainwater {
    public static void main(String[] args) {
        int[] arr = {3, 0, 2, 0, 4};
        int areaOfWater = findTrappedWater(arr);
        System.out.println(areaOfWater);
    }

    static int findTrappedWater(int[] arr){
        int result = 0;
        int left = 0;
        int right = arr.length-1;
        int leftMax = 0, rightMax = 0;
        while (left<=right){
            if(rightMax<=leftMax){
                result += Math.max(0, rightMax-arr[right]);
                rightMax = Math.max(rightMax, arr[right]);
                right--;
            } else {
                result += Math.max(0, leftMax - arr[right]);
                leftMax = Math.max(leftMax, arr[left]);
                left++;
            }
        }

        return result;
    }
}
