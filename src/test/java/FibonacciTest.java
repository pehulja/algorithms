import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by eyevpek on 2017-09-19.
 */
public class FibonacciTest
{
    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void bad() throws Exception
    {
        Assertions.assertThat(fibonacci.bad(0)).isEqualTo(0);
        Assertions.assertThat(fibonacci.bad(1)).isEqualTo(1);
        Assertions.assertThat(fibonacci.bad(2)).isEqualTo(1);
        Assertions.assertThat(fibonacci.bad(3)).isEqualTo(2);
        Assertions.assertThat(fibonacci.bad(4)).isEqualTo(3);
        Assertions.assertThat(fibonacci.bad(5)).isEqualTo(5);
        Assertions.assertThat(fibonacci.bad(6)).isEqualTo(8);
        Assertions.assertThat(fibonacci.bad(7)).isEqualTo(13);
    }

    @Test
    public void good() throws Exception
    {
        Assertions.assertThat(fibonacci.good(0)).isEqualTo(0);
        Assertions.assertThat(fibonacci.good(1)).isEqualTo(1);
        Assertions.assertThat(fibonacci.good(2)).isEqualTo(1);
        Assertions.assertThat(fibonacci.good(3)).isEqualTo(2);
        Assertions.assertThat(fibonacci.good(4)).isEqualTo(3);
        Assertions.assertThat(fibonacci.good(5)).isEqualTo(5);
        Assertions.assertThat(fibonacci.good(6)).isEqualTo(8);
        Assertions.assertThat(fibonacci.good(7)).isEqualTo(13);
    }

    @Test
    public void throughArray() throws Exception
    {
        int[] array = fibonacci.throughArray(7);

        Assertions.assertThat(array[array.length - 1]).isEqualTo(13);
    }

}