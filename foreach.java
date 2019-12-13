public class foreach{
    public static void main(String[] args){
        int[] data={1,3,5,7,8,4,2,9};
        int index = 0;
        for(int i : data){
            System.out.println("data ke"+i+"adalah"+data);
            index++;
        }
    }
}