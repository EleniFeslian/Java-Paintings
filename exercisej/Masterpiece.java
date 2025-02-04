
package exercisej;

public abstract class Masterpiece extends Artifact{
    String cond;
    String move;
    
    public enum condition{
        excellent,
        good,
        bad;
        
        static condition getRandom() {
             return values()[(int) (Math.random() * values().length)];
        }
    }
    
    public enum movement{
        naturalism,
        expressionism,
        impressionism;
        
        static movement getRandom() {
            return values()[(int) (Math.random() * values().length)];
        }
    }
    
    Masterpiece(int y, String cr, String c, String m){
        super(y,cr);
        move=movement.getRandom().name();
        cond=condition.getRandom().name();
        System.out.println("Creating an instance of masterpiece");
        System.out.println("Condition: " + cond + " and Movement: " + move);
    }
    void getInfo(){
        super.getInfo();
    }
}
