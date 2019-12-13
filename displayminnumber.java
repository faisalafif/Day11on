public class displayminnumber{
    public static void main(String[] args){
        int[] data = {10, 3, 5, 23, 24, 6, 7,50, 20};
        
        int LowestData = data[0];
        int LowestIndex = 0;

        for(int i = 0; i < data.length; i++){
            if(data[LowestIndex] > data[i]){
                LowestData = data[i];
                LowestIndex = i;
            }
        }

        System.out.println("jadi data paling kecil adalah "+LowestIndex+ " yg berada pada index ke " +LowestIndex);

    }
}