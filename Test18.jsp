public class Test18{
    public static void main (String[] args) {
	    int money = 85; // 基本車資
		int km = 50;
	    
		if (km > 8)
		    for (int i=8; i<=km; i++)
			    money += 5;
		System.out.printf("NT$ %d",money);
	}
}	
		