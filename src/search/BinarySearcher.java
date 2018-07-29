package search;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-17 20:11
 * =============================================
 */
public class BinarySearcher implements Searcher<Integer> {
    @Override
    public int search(Integer[] arr, Integer target) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            //may overflow
            int mid = (low + high) >>> 1;
            if(arr[mid] < target){
                low = mid + 1;
            }else if(arr[mid] > target){
                high = mid - 1;
            }else{
                return arr[mid];
            }
        }
        return low;
    }
}
