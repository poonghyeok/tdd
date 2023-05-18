import baekjoon.Boj1740;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class Boj1740Test {

    @DisplayName("get max val test")
    @Test
    void getNeededMaxValTest() {
        //given
        final Boj1740 boj1740 = new Boj1740();
        final long nTemp = 4L;
        //when
        int maxVal = boj1740.getNeededMaxVal(nTemp);
        //then
        assertThat(maxVal).isEqualTo(2);

    }
}
