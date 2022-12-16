public class ArrInverse {
    public static void main(String[] args) {
	    int [] myArr = {7, 5, 4, 8, 1, 2};
        int[] result = new int[myArr.length];
		
		int temp;
        for (int i=0; i<myArr.length/2; i++) {
            result[i] = myArr[myArr.length-1-i];    
        }

        for (int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }
	}
}
