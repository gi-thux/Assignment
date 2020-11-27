package day32;



public class Q42DuplicateWords {
	public static void main(String[] args) {
		String line = "i am enjoying to write java programme, programming was very dificult, its getting enteresting as i am getting to know better, everyone should learn to programmer";
		String[] words = line.split(" ");
		int count;
	
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {

				if (words[i].equals(words[j])) {
					count++;
				
				words[j] = "0";
			}
		}
		
		if (count > 1 && words[i] != "0") {
			System.out.println(words[i]);

		
	}
	}}
	
	}
