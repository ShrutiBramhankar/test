package NSE;

public class InSufficentAgeException1  extends RuntimeException{

    public InSufficentAgeException1() {
        super("Age is not sufficient to vote....");
    }
}
