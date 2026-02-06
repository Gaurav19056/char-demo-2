public class IsArrayAscending {
    public static boolean isAscending(int[] numbers) {
        for(int i=0; i<numbers.length-1;i++){
            if(numbers[i]>=numbers[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("[1, 2, 3, 4, 5] → " + isAscending(new int[]{1, 2, 3, 4, 5}));   
        System.out.println("[2, 2, 3] → " + isAscending(new int[]{2, 2, 3}));               
        System.out.println("[10, 9, 8] → " + isAscending(new int[]{10, 9, 8}));             
        System.out.println("[5] → " + isAscending(new int[]{5}));                           
        System.out.println("[] → " + isAscending(new int[]{}));                             
    }
}

