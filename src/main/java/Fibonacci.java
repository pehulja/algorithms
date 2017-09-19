import java.util.HashMap;
import java.util.Map;

/**
 * Created by eyevpek on 2017-09-19.
 */
public class Fibonacci
{
    public int bad(int i){
        if(i <= 1){
            return i;
        } else {
            return bad(i - 1) + bad(i - 2);
        }
    }

    public int good(int i){
        Map<Integer, Integer> cache = new HashMap<>();

        return good(0, i, cache);
    }


    private int good(int from, int i, Map<Integer, Integer> cache){
        int result;

        if(from <= 1){
            cache.put(from, from);
            result = i;
        } else {
            int smaller = cache.get(from - 2);
            int bigger = cache.get(from - 1);
            result = smaller + bigger;
            cache.put(from, result);
        }

        if (from == i){
            return result;
        } else
        {
            return good(++from, i, cache);
        }
    }

    public int [] throughArray(int i){
        if(i <= 1){
            return new int[]{i, 0};
        } else {
            int [] temp = throughArray(i - 1);
            int [] answer = new int[]{temp[0] + temp[1], temp[0]};
            return answer;
        }

    }
}
