package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> resultNumbers1 = App.take(numbers1, 3);
        assertThat(resultNumbers1.size()).isEqualTo(3);
        for (int i = 0; i < resultNumbers1.size(); i++) {
            assertThat(resultNumbers1.get(i)).isEqualTo(numbers1.get(i));
        }
        // END
    }
}
