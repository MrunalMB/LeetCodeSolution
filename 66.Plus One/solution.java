class Solution {
 
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i =n-1;i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;//just add the last digit by 1 
                return digits;//and return this will be your ans
            }else{
                digits[i] = 0;//and continue to the loop
            }
        }
        //you reach here mean the carry is generated so we just need 1 as our starting digits
        int arr[] =new int[n+1];
        arr[0] = 1;
        return arr;//as array's 1st element is 1,and remaing will all 0's will by default
    }
}
