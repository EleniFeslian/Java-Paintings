
package exercisej;

public class Sculpture extends Masterpiece{
    int volume;
    String mat;

    String default_cond="excellent";
    
    public enum material{
        iron,
        stone,
        wood;
        
        static material getRandom() {
            return values()[(int) (Math.random() * values().length)];
        }
    }
    
    Sculpture(int y, String cr, String c, String m, int v, String ma){
        super(y,cr,c,m);
        volume=v;
        mat=ma;
        System.out.println("Creating an instance of sculpture ");
    }
    
    void getInfo(){
        super.getInfo();
    }
    
    boolean evaluate(String c, String m){
        if(this.cond==c && this.move==m){
            return true;
        }else{
            return false;
        }
    }
    
    boolean evaluate(String m){
        return this.evaluate(default_cond,m);
    }
}
