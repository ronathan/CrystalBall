package com.example.crystalball;

import java.util.Random;

public class CrystalBall {
	// Member variables (properties about the object)
	public String[] mAnswers = {
			"It is certain",
			"It is decidely so",
			"All signs say YES",
			"The stars are not aligned",
			"My reply is no",
			"It is doubtful",
			"Better not tell you now",
			"Concentrate and ask again",
			"Unable to answer now"};
	
	// Methods (abilities: things the object can do)
	public String getAnAnswer() {
		
		String answer = "";
		
		// Randomly select one of three answers: Yes, No, or Maybe
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(mAnswers.length);

		answer = mAnswers[randomNumber];
		
		return answer;
	}
}
