
package enumerated;
import static enumerated.Outcome.*;
public enum RoShamBo6 implements Competitor<RoShamBo6>{
    PAPER,SCISSORS,ROCK;
    private static Outcome[][] table = {
            {DRAW,LOSE,WIN},
            {WIN,DRAW,LOSE},
            {LOSE,WIN,DRAW}
    };

    @Override
    public Outcome compete( RoShamBo6 i) {
        return table[this.ordinal()][i.ordinal()];
    }

    public static void main(String[] args) {
        RoShamBo.play(RoShamBo6.class,20);
    }
}
