
package exercisej;

public class Main {

    public static void main(String[] args) {
        int N=Integer.parseInt(args[0]);
        String c=args[1];
        String m=args[2];

        int j=1;      
        
        Artifact[] art = new Artifact[N];
        
        for(int i=0; i<N; i++){
    //min+(int)(Math.random()*((max-min)+1)
    //[min,max]=range of numbers we want
    //Math.random() returns number in [0,1)
    //Math.random()*(max-min) to get the specific range
    //adding min to shift the range (bc we have double*integer)
    //and +1 to the product: Math.random()*(max-min), get max
            int x=(int)(Math.random() * (2));   //min=0 max=1
            int y=1700 + (int)(Math.random() * (322)),  //min=1700 max=2021
                l=1 + (int)(Math.random() * (100)),     //min=1 max=100
                w=1 + (int)(Math.random() * (100)),     //min=1 max=100
                v=1 + (int)(Math.random() * (100));     //min=1 max=100
            
            String m1=Masterpiece.movement.getRandom().name(),
                   c1=Masterpiece.condition.getRandom().name(),
                   t=Painting.technique.getRandom().name(),
                   ma=Sculpture.material.getRandom().name();
            String cr="Creator"+j;
                    j++;
            if(x==0){
                art[i]=new Painting(y,cr,c1,m1,l,w,t);
            }else{
                art[i]=new Sculpture(y,cr,c1,m1,v,ma);
            }
        }
        
        auction(art,c,m);
    }
        public static void auction(Artifact[] a,String c, String m){
        for(int i=0; i<a.length; i++){
            a[i].getIndex();
            a[i].getInfo();
            if(a[i].evaluate(c,m)==true){
                System.out.println("True evaluation");
            }else{
                System.out.println("False evaluation");
            }
        }
    }
}
