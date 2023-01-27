import java.util.ArrayList;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            arr.add(arr1[i]);
        }
        for(int i=0;i<arr1.length;i++){
            arr.add(arr2[i]);
        }
        int[] arr3 = arr.stream().mapToInt(i -> i).toArray();
        return arr3;
    }
}
