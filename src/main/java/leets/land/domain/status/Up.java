package leets.land.domain.status;

import leets.land.domain.guess.GuessRange;
import leets.land.domain.guess.GuessValue;

public class Up implements Status {

    @Override
    public GuessRange narrowRange(GuessRange guessRange, GuessValue guessValue) {
        return guessRange.upMin(guessValue);
    }

    @Override
    public boolean isValid(int gap) {
        return gap > 0;
    }

    @Override
    public boolean isContinue() {
        return true;
    }
}
