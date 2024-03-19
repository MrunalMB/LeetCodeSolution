class Solution {
    public void reverseString(char[] s) {
       char[] ab= new char[s.length];
     reverse(s, 0,s.length-1);
    }

    public void reverse( char s[],int left, int right){
        if(left > right){
            return;
        }else{
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            reverse(s, left + 1, right - 1);
        }
    }
}
