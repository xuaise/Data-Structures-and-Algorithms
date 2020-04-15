package singlon.InnerClass;

public class Singlon {
    private Singlon(){}
    public static Singlon getInstance(){
            return SinglonHolder.singlon;
    }
    private static class SinglonHolder{
        private static Singlon singlon = new Singlon();
    }
}
