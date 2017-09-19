/**
 * Created by eyevpek on 2017-09-19.
 */
public class Factorial
{
    public long recursion(long i){
        if(i <= 1){
            return 1;
        } else {
            return i * recursion(i - 1);
        }
    }

    public long loop(long i){
        long factorial = i;
        while (i > 1){
            factorial *= --i;
        }

        return factorial;
    }

    static long ProdTree(long l, long r)
    {
        if (l > r)
            return 1;
        if (l == r)
            return l;
        if (r - l == 1)
            return l * r;
        long m = (l + r) / 2;
        return ProdTree(l, m) * ProdTree(m + 1, r);
    }

    public long tree(long n)
    {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        if (n == 1 || n == 2)
            return n;
        return ProdTree(2, n);
    }
}
