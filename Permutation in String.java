import java.util.*;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }

        char [] a = s1.toCharArray();
        Arrays.sort(a);

        

        for(int i = 0; i <= s2.length() - s1.length(); i++ ){

           String str =  s2.substring(i , i + s1.length());

           char [] b = str.toCharArray();
           Arrays.sort(b);

           if(Arrays.equals(a , b )){
            return true;
           }
        }

       return false;
    }
}
 import java.util.*;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()){
            return false;
        }

        char[] a = s1.toCharArray();
        Arrays.sort(a);

        int n = s1.length();

        for(int i = 0; i <= s2.length() - n; i++){

            String str = s2.substring(i, i + n);

            char[] b = str.toCharArray();
            Arrays.sort(b);

            if(Arrays.equals(a, b)){
                return true;
            }
        }

        return false;
    }
