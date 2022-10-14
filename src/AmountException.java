public class AmountException  extends  Exception{
     private  Double remainingAmout;

    public AmountException(String message , Double remainingAmout) {
        super(message);
        this.remainingAmout = remainingAmout;

    }
    public Double getRemainingAmout(){
        return remainingAmout;
    }
}
