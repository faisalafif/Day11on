public class contohnestedif{
    public static void main(String[] args){
        // username dan pw yg diinpur user
        String username ="faisal@gmail.com";
        String password ="secret";        

        // proses login
        if(username == "faisal@gmail.com"){
            // username ditemukan
            if(password == "secret"){
                // username ditemukan dan pw benar
                System.out.println("berhasil login");
            }
            else{
                // username dutemukan tetapi pw salah
                System.out.println("password salah");
            }
        }
        else{
            System.out.println("username tidak ditemukan");
        }
    }
}