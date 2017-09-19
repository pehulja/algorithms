import java.util.Optional;

/**
 * Created by eyevpek on 2017-09-19.
 */
public class BinarySearch
{
    public Optional<Integer> findIndexRecursion(int [] array, int value){
        return findIndexRecursion(array, value, 0, array.length - 1);
    }

    private Optional<Integer> findIndexRecursion(int [] array, int value, int left, int right){
        if(left > right){
            return Optional.empty();
        }

        int median = (left + right) / 2;
        int medianValue = array[median];

        if(medianValue > value){
            return findIndexRecursion(array, value, left, median - 1);
        } else if (medianValue < value){
            return findIndexRecursion(array, value, median + 1, right);
        } else {
            return Optional.of(median);
        }
    }

    public Optional<Integer> findIndexLoop(int [] array, int value){

        int left = 0;
        int right = array.length - 1;

        while(left <= right){
            int median = (left + right) / 2;
            int medianValue = array[median];

            if(medianValue > value){
                right = median - 1;
            } else if (medianValue < value){
                left = median + 1;
            } else {
                return Optional.of(median);
            }
        }

        return Optional.empty();
    }
}
