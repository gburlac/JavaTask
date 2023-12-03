package methodOverriding;

public class runner {

    public static void main(String[] args) {

        OverrideParent parent = new OverrideParent();
        parent.myMethod();
        OverrideChid chid = new OverrideChid();
        chid.myMethod();

    }
}
