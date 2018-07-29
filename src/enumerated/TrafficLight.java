package enumerated;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-24 12:47
 * =============================================
 */
enum Signal{
    GREEN,YELLOW,RED,
}
public class TrafficLight {
    Signal color = Signal.RED;
    public void change(){
        switch (color){
            case RED: color = Signal.GREEN;break;
            case GREEN: color = Signal.YELLOW;break;
            case YELLOW: color = Signal.RED;break;
            default:break;
        }
    }
}
