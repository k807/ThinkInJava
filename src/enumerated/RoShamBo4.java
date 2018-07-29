package enumerated;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-24 22:25
 * =============================================
 */
public enum RoShamBo4 implements Competitor<RoShamBo4>{
    ROCK{
        @Override
        public Outcome compete(RoShamBo4 i) {
            return compete(SCISSORS,i);
        }
    },
    SCISSORS{
        @Override
        public Outcome compete(RoShamBo4 i) {
            return compete(PAPER, i);
        }
    },
    PAPER{
        @Override
        public Outcome compete(RoShamBo4 i) {
            return compete(ROCK, i);
        }
    };

    Outcome compete(RoShamBo4 loser, RoShamBo4 opponent){
        return ((opponent == this) ? Outcome.DRAW : ((opponent == loser) ? Outcome.WIN : Outcome.LOSE));
    }

    public static void main(String[] args) {
        RoShamBo.play(RoShamBo4.class, 20);
    }
}
