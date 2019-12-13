public class CariBprima{
    public static void main(String[] args){
        int[] data = {3,10,7,11,15,16,23,50};
        
        for(int index = 0; index < data.length; index++){
            //start program cek prima atau bukan
            //start cek prima

            int x = data [index];
            boolean isPrime = true;
            for(int i = 2; i <= x-1;i++){
                if(x %  i == 0){
                isPrime = false;
                break;
                }
            }
        if(isPrime == true){
            System.out.println(x);
        }
        //end cek prima
        //end program cek prima atau bukan
     }
    }
}