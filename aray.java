public class aray{
    public static void main(String[] args){
        int[] data = {18, 34, 5, 23, 6, 55, 50, 20, 66};

        for(int i = 0; i < data.length; i++){ //latihan mencari bilangn ganjil
            if(data[i] % 2 != 0){
            System.out.println(data[i]);
            }
        }
    }
}