public class Howmanytimes_2Occurs {
    public static void main(String[] args) {
        int start=1;
        int end=200;
        int count=0;
        while(end>=start){
            int n=end;
            while(n>0){
                if (n%10==2){
                    count++;
                }
                n/=10;
            }
            end--;
        }
        System.out.println(count);
        
    }
    
}
