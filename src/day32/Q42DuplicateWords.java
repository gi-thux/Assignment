package day32;

public class Q42DuplicateWords {
	public static void main(String[] args) {
		String line = "i am enjoying to write java programme, programming was very dificult, its getting enteresting as i am getting to know better, everyone should learn to programmer";
		String[] words = line.split(" ");
	
		String ab="";
		for (int i = 0; i < words.length; i++) {
		int	count =0;
			
		
			
		for (int j = 0; j < words.length; j++) {
			if(words[j].equals(words[i])) {
				count ++;
				ab=ab+words[j];
				
			}
		}
			
		}
		System.out.println(ab);
		
		
	}}

	