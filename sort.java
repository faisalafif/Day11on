public class sort{
    public static void main(String[] args){
        int[] data = {3,10,5,50,51,2,4,-2,6};
        //lakukan pengulangan pengeckan dan tukar data dari index ke 0 hingga terakhir
        
        for(int index = 0;index < data.length;index++){
            int lowestIndex = index; //lowest index sementara
            //start paling kecil dari i to data.length

            for(int i=lowestIndex;i<data.length;i++){
                if(data[lowestIndex] > data[i]){
                    lowestIndex = i; //ganti index paling kecil ke i apabila data[i] lebih kecil drpada data[lowetsindex]
                }
            }
             //end cari paling kecil
             //tukar data :
            int temp = data[index];
            data[index] = data[lowestIndex];
            data[lowestIndex] =temp;
        }
        //untuk menampilkan data yg telah diurutkan
        for(int j = 0;j<data.length;j++){
            System.out.println(data[j]);
        }
    }
}