package singlon.dcl;

public class Singlon {
    private volatile static Singlon instance = null;
    private Singlon(){}

    public static Singlon getInstance(){
        if(instance == null){
            synchronized(Singlon.class){
                if(instance == null){
                    instance = new Singlon();
                }
            }
        }
        return instance;
    }

}
