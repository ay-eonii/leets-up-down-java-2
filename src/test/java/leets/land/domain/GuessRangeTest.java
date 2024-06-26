package leets.land.domain;

import leets.land.domain.guess.GuessNumber;
import leets.land.domain.guess.GuessRange;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GuessRangeTest {

    @Test
    @DisplayName("상한값을 낮춘다")
    void downMax() {
        GuessRange guessRange = new GuessRange(new GuessNumber(1), new GuessNumber(100));
        GuessNumber max = new GuessNumber(50);

        GuessRange downedMax = guessRange.downMax(max);

        assertThat(downedMax).isEqualTo(new GuessRange(new GuessNumber(1), max));
    }

    @Test
    @DisplayName("하한값을 높인다")
    void upMin() {
        GuessRange guessRange = new GuessRange(new GuessNumber(1), new GuessNumber(100));
        GuessNumber min = new GuessNumber(50);

        GuessRange downedMax = guessRange.upMin(min);

        assertThat(downedMax).isEqualTo(new GuessRange(min, new GuessNumber(100)));
    }
}
