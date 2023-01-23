import java.util.Arrays;

public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        int[] a2 = arr.clone();
        int temp = 0;
        for(int i=0; i<arr.length-1;i++){
            for(int j=1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        if(Arrays.equals(a2, arr)){
            return true;
        }
        else {
            return false;
        }
    }
}
