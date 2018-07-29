package enumerated;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-24 22:02
 * =============================================
 */
import static enumerated.Outcome.*;
interface Competitor<T extends Competitor<T>>{
    Outcome compete(T i);
}
public enum  RoShamBo2 implements Competitor<RoShamBo2>{
    PAPER(DRAW,LOSE,WIN),
    SCISSORS(WIN,DRAW,LOSE),
    ROCK(LOSE,WIN,DRAW);
    private Outcome vPAPER,vSCISSORS,vROCK;

    RoShamBo2(Outcome vPAPER, Outcome vSCISSORS, Outcome vROCK) {
        this.vPAPER = vPAPER;
        this.vSCISSORS = vSCISSORS;
        this.vROCK = vROCK;
    }

    @Override
    public Outcome compete(RoShamBo2 it) {
        switch (it){
            default:
            case PAPER: return vPAPER;
            case SCISSORS: return vSCISSORS;
            case ROCK: return vROCK;
        }
    }

    public static void main(String[] args) {
        RoShamBo.play(RoShamBo2.class,20);
    }
}
