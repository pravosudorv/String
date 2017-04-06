package by.htp.string;

public class Task2 {
	public static void main(String[] args) {
		String text	= "afaf affgg /agggggs/ asgaggsg";
		String simvol = "/";
		
		text = vubros(text, simvol);
		System.out.println(text);
	}
	
	public static String vubros(String text, String simvol) {
		
		String[] s = text.split(simvol);
		String newText = "";
		for(int i = 0; i < s.length; i++) {
			if(i%2 == 0) {
				
				newText = newText+ s[i];
			}	
		}
		
		
		return newText;
	}
	


}
