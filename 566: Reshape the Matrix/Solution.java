class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       int n = mat.length , m = mat[0].length;;

       if(n * m == r*c){
           int res[][]= new int[r][c];
           for(int i= 0 ; i < r*c ; i++){
             res[i/c][i%c] = mat[i/m][i%m];
           }
           return res;
       }else{
           return mat;
       }
    }
}
