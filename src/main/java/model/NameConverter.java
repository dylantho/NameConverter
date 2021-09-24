package model;

/**
 * @author Dylan Thomas - djthomas4
 * CIS175 - Fall 2021
 * Sep 23, 2021
 */
public class NameConverter {
	private String name;
	private int nameScore;


	public NameConverter() {
		super();
	}

	public NameConverter(String name) {
		super();
		this.name = name;
		flipName(name);
		calcNameScore(name);
	}

	public void flipName(String name) {
		int length = name.length(); 
		int last = length - 1;
		
		// Array of name characters
        char[] nameLetters = name.toCharArray();
        
        // Reverse characters
        for (int i = 0; i < length/2; i++) {
            char currLetter = nameLetters[i];
            nameLetters[i] = nameLetters[last - i];
            nameLetters[last - i] = currLetter;
        }
        
        // Set name with reversed letters
        setName(new String(nameLetters).toLowerCase());
	}
	
	// NameScore
	public void calcNameScore(String name) {
		String lowerName = name.toLowerCase();
		for(int i = 0; i < name.length(); i++) {
			if (lowerName.charAt(i) == 'a') {
				nameScore += 1;
			}
			else if (lowerName.charAt(i) == 'b') {
				nameScore += 2;
			}
			else if (lowerName.charAt(i) == 'c') {
				nameScore += 3;
			}
			else if (lowerName.charAt(i) == 'd') {
				nameScore += 4;
			}
			else if (lowerName.charAt(i) == 'e') {
				nameScore += 5;
			}
			else if (lowerName.charAt(i) == 'f') {
				nameScore += 6;
			}
			else if (lowerName.charAt(i) == 'g') {
				nameScore += 7;
			}
			else if (lowerName.charAt(i) == 'h') {
				nameScore += 8;
			}
			else if (lowerName.charAt(i) == 'i') {
				nameScore += 9;
			}
			else if (lowerName.charAt(i) == 'j') {
				nameScore += 10;
			}
			else if (lowerName.charAt(i) == 'k') {
				nameScore += 11;
			}
			else if (lowerName.charAt(i) == 'l') {
				nameScore += 12;
			}
			else if (lowerName.charAt(i) == 'm') {
				nameScore += 13;
			}
			else if (lowerName.charAt(i) == 'n') {
				nameScore += 14;
			}
			else if (lowerName.charAt(i) == 'o') {
				nameScore += 15;
			}
			else if (lowerName.charAt(i) == 'p') {
				nameScore += 16;
			}
			else if (lowerName.charAt(i) == 'q') {
				nameScore += 17;
			}
			else if (lowerName.charAt(i) == 'r') {
				nameScore += 18;
			}
			else if (lowerName.charAt(i) == 's') {
				nameScore += 19;
			}
			else if (lowerName.charAt(i) == 't') {
				nameScore += 20;
			}
			else if (lowerName.charAt(i) == 'u') {
				nameScore += 21;
			}
			else if (lowerName.charAt(i) == 'v') {
				nameScore += 22;
			}
			else if (lowerName.charAt(i) == 'w') {
				nameScore += 23;
			}
			else if (lowerName.charAt(i) == 'x') {
				nameScore += 24;
			}
			else if (lowerName.charAt(i) == 'y') {
				nameScore += 25;
			}
			else if (lowerName.charAt(i) == 'z') {
				nameScore += 26;
			}
			else {
				nameScore += 0;
			}
		}
		setNameScore(nameScore);
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "NameConverter result: " + name;
	}


	public int getNameScore() {
		return nameScore;
	}

	public void setNameScore(int nameScore) {
		this.nameScore = nameScore;
	}

	

}
