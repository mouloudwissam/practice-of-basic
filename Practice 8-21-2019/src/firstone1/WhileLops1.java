package firstone1;

public class WhileLops1 {
	public static void main (String[] args) {
		int t =5;
		
		int j=1; 
		while (t<45) {
			System.out.println(" T is less than 45:" +t);
			t++;
		}
		while (j<20) {
			System.out.println("j is less than 13 :" + j);
			j++;
		}
		while (j<4 || t<40) {
			System.out.println("t and j is the best"+ j+t);
			j++;t++;
		}
	}

}
