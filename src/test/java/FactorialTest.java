import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by eyevpek on 2017-09-19.
 */
public class FactorialTest
{
    private Factorial factorial;

    @Before
    public void setup(){
        factorial = new Factorial();
    }

    @Test
    public void recursion() throws Exception
    {
        Assertions.assertThat(factorial.recursion(1)).isEqualTo(1);
        Assertions.assertThat(factorial.recursion(2)).isEqualTo(2);
        Assertions.assertThat(factorial.recursion(3)).isEqualTo(3 * 2);
        Assertions.assertThat(factorial.recursion(4)).isEqualTo(4 * 3 * 2 * 1);
        factorial.recursion(100_000_000l);
    }

    @Test
    public void loop() throws Exception
    {
        Assertions.assertThat(factorial.loop(1)).isEqualTo(1);
        Assertions.assertThat(factorial.loop(2)).isEqualTo(2);
        Assertions.assertThat(factorial.loop(3)).isEqualTo(3 * 2);
        Assertions.assertThat(factorial.loop(4)).isEqualTo(4 * 3 * 2 * 1);
        factorial.loop(100_000_000l);
    }

    @Test
    public void tree() throws Exception
    {
        Assertions.assertThat(factorial.tree(1)).isEqualTo(1);
        Assertions.assertThat(factorial.tree(2)).isEqualTo(2);
        Assertions.assertThat(factorial.tree(3)).isEqualTo(3 * 2);
        Assertions.assertThat(factorial.tree(4)).isEqualTo(4 * 3 * 2 * 1);
        factorial.tree(100_000_000l);
    }
}