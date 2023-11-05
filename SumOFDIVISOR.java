
public class SumOFDIVISOR{
    public static void main(String [] args){
        int n=678687;
        int div=78;
        int Sumofdivisor=div*(div-1)/2;
        int remainder=n%div;
        int Quotient=n/div;
        int sumOfRemainder=remainder*(remainder+1)/2;
        int totSum=sumOfRemainder+(Sumofdivisor)*Quotient;
        System.out.println(totSum);
    }

}
