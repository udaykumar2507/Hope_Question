public class PrimeYESORNOT {
    public static void main(String[] args) {
        int start=1;
        int end=10;  
            for (int i=end;i>start;i--){
                for (int j=i-1;j>start;j--){
                    if (prime(i) && prime(j)){
                        if (i+j==end){
                        System.out.println(i+" "+j);
                        break;
                        }
                    }
                }
            }

        }
    
    public static boolean prime(int n){
            for (int i=2;i<(int)Math.sqrt(n);i++){
                if (n%i==1){
                    return false;
                }
            }
            return true;
        }
    }
p