class Solution {
    public int missingNumber(int[] arr) {
       int i=0;
        while(i < arr.length ){ 
             int a= arr[i];
            if (a < arr.length && arr[i] != arr[arr[i]]  ){
                int temp= arr[i];
                arr[i] = arr[a];
                arr[a] = temp;
            }
            else{
                i++;
            } 
        }
            for(int ind=0; ind<arr.length; ind++){
                if(arr[ind] !=ind){
                    return ind;
                }
            }

            return arr.length;
    }

}
