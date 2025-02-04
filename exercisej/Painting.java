
package exercisej;

public class Painting extends Masterpiece{
    int length;
    int width;
    String tech;
    
    String default_cond="good";
    
    public enum technique{
        oil, 
        aquarelle,
        tempera;
        
        static technique getRandom() {
            return values()[(int) (Math.random() * values().length)];
        }
    }
    
    Painting(int y, String cr, String c, String m, int l, int w, String t){
        super(y,cr,c,m);
        length=l;
        width=w;
        tech=t;      
        System.out.println("Creating an instance of painting ");
    }
    
    void getInfo(){
        super.getInfo();
        System.out.println("Surface: " + length*width);
    } 
    
    boolean evaluate(String c, String m){
        if(this.cond==c && this.move==m){
            return true;
        }else if(((this.cond == "excellent" || this.cond=="good")&& c=="good") 
                && this.move == m){
            return true;
        }else{
            return false;
        }
    }
    
    boolean evaluate(String m){
        return this.evaluate(default_cond,m);
    }
}
