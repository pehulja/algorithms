import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by eyevpek on 2017-09-19.
 */
public class BinarySearchTest
{
    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void findIndexRecursion() throws Exception
    {
        Assertions.assertThat(binarySearch.findIndexRecursion(new int[]{0, 1, 2, 3, 4}, 0)).isEqualTo(Optional.of(0));
        Assertions.assertThat(binarySearch.findIndexRecursion(new int[]{0, 1, 2, 3, 4}, 1)).isEqualTo(Optional.of(1));
        Assertions.assertThat(binarySearch.findIndexRecursion(new int[]{0, 1, 2, 3, 4}, 2)).isEqualTo(Optional.of(2));
        Assertions.assertThat(binarySearch.findIndexRecursion(new int[]{0, 1, 2, 3, 4}, 3)).isEqualTo(Optional.of(3));
        Assertions.assertThat(binarySearch.findIndexRecursion(new int[]{0, 1, 2, 3, 4}, 4)).isEqualTo(Optional.of(4));
        Assertions.assertThat(binarySearch.findIndexRecursion(new int[]{0, 1, 2, 3, 4}, 5)).isEqualTo(Optional.empty());

        Assertions.assertThat(binarySearch.findIndexRecursion(new int[]{0, 1, 2, 3}, 1)).isEqualTo(Optional.of(1));
    }

    @Test
    public void findIndexLoop() throws Exception
    {
        Assertions.assertThat(binarySearch.findIndexLoop(new int[]{0, 1, 2, 3, 4}, 0)).isEqualTo(Optional.of(0));
        Assertions.assertThat(binarySearch.findIndexLoop(new int[]{0, 1, 2, 3, 4}, 1)).isEqualTo(Optional.of(1));
        Assertions.assertThat(binarySearch.findIndexLoop(new int[]{0, 1, 2, 3, 4}, 2)).isEqualTo(Optional.of(2));
        Assertions.assertThat(binarySearch.findIndexLoop(new int[]{0, 1, 2, 3, 4}, 3)).isEqualTo(Optional.of(3));
        Assertions.assertThat(binarySearch.findIndexLoop(new int[]{0, 1, 2, 3, 4}, 4)).isEqualTo(Optional.of(4));
        Assertions.assertThat(binarySearch.findIndexLoop(new int[]{0, 1, 2, 3, 4}, 5)).isEqualTo(Optional.empty());

        Assertions.assertThat(binarySearch.findIndexLoop(new int[]{0, 1, 2, 3}, 1)).isEqualTo(Optional.of(1));
    }

}