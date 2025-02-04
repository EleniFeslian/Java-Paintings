
package exercisej;

public abstract class Artifact {
    final int index;
    final int year;
    final String creator;
    
    static int y=1;        //counter for index
    
    Artifact(int ye, String cr){
        year= ye;
        index=y++;
        creator=cr;
        System.out.println("Creating an instance of artifact");
    }
    
    void getInfo(){
        System.out.println("Creator: " + creator + " and Year: "
                            + year);
    }
    void getIndex(){
        System.out.println("Index: " + index);
    }
    boolean evaluate(String c, String m){
        return false;
    }
}
