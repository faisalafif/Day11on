public class nestedif{
    public static void main(String[] args){
        boolean hujan = false;
        boolean adapayung = true;
        
        if(hujan == true){
            if(adapayung == true){
                System.out.println("boleh keluar rumah karna ada payung");

            }
            else{
                System.out.println("tidak ada payung,jadi tidak boleh keluar rumah");

            }
        }
        else{
            if(adapayung == true){
                System.out.println("boleh keluar rumah dan bawa payung yg ada");

            }
            else{
                System.out.println("boleh");

            }
        }
    }
}