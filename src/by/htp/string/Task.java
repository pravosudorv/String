package by.htp.string;

public class Task {
	public static void main(String[] args) {
		String text	= "afaf affgg agggggs asgaggsg";
		
		text = zamena(2, 'x', text);
		System.out.println(text);
	}
	
	public static String zamena(int k, char simvol, String text) {
		String[] s = text.split(" ");
		String newText = "";
		for(String i : s) {
			if(i.length() > k) {
				
				if(i.length()> k-1) {
					String newI = i.substring(0, k-1) + simvol + i.substring(k, i.length());
					newText = newText+" "+ newI;
				} else {
					String newI = i.substring(0, k-1) + simvol;
					newText +=newI+" ";
				}
			}
		}
		
		
		return newText;
	}
	

}
