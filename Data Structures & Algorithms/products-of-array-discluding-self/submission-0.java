class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int prefixProduct = 1;
        for(int i = 0; i < n; i++){
            result[i] = prefixProduct;
            prefixProduct *= nums[i];
        }

        int productSuffix = 1;
        for(int i = n - 1; i >= 0; i--){
            result[i] *= productSuffix;
            productSuffix *= nums[i];
        }
        return result;
    }
    } 
