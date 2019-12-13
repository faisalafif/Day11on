public class loopwhile{
    public static void main(String[] args){

        boolean runApp = true;
        while(runApp == true){
            Scanner input = new Scanner(System.in);
            System.out.println("pilih 1 Untuk lanjut running aplikasi");
            System.out.println("pilih 2 untuk lanjut running aplikasi");
            System.out.println("pilih 3 untuk stop aplikasi  !");
            int x = input.nextInt();
            switch(x){
                case 1:
                System.out.println("kamu pilih 1");
                break;
                case 2:
                System.out.println("kamu pilih 2");
                break;
                default:
                runApp = false;
                break;

            }  
        }
    }
}