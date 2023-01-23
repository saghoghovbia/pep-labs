
import java.util.*;

public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        int num = 0;
        int longest = 0;
        int ndx = 0;
        int ndxL = 0;
        Map<String,Integer> map = new HashMap();
        for(String string:arr){
            num=string.length();
            map.put(string,num);
            if(num>longest){
                longest = num;
                ndxL = ndx;
            }
            ndx +=1;
        }
        return arr[ndxL];
    }
}
// I have the length of the string, now I need to find out which string has the length.