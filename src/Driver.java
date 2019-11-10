
public class Driver {
	
	static String choice;
	static boolean pressed;

	public static void main(String[] args) {
		
		GUI game = new GUI();
		game.setUp();	
		
		final String q1a1 = "<html>Help them study! Go over vocabulary, let them explain concepts to you, do problems with them, whatever they need to ace this exam!";
		final String q1a2 = "<html>Let them know that you’re there to support them emotionally, but they have to learn the material on their own. Tough love, but you know it’s best for them in the long run.";
		final String q1a3 = "<html>Offer to help them study, but eventually get too busy with your own work that you don’t get a chance to help them. It’s okay, right? Everyone is busy, and it's the thought that counts!";
		final String q1a4 = "<html>Friends? What are those?";
		
		final String q2a1 = "<html>Depends on the project! If it gives you an opportunity to express your artistic and creative visions, you’re on it! You’ve been waiting for a reason to bust out the art supplies :)";
		final String q2a2 = "<html>You’re already on it, organizing meetings, making contacts, and coordination with your co-execs. You’ve always loved being at the center of organizing events, and this will be no exception! You’re already looking forward to having another successful event under your belt.";
		final String q2a3 = "<html>You’re normally not the first to sign up for things like this, so you’ll play it by ear. You could take it or leave it, but if your friends are doing it, you’d get involved.";
		final String q2a4 = "<html>You’ll pass on this one. You’ll help out if it’s something that you can individually work on, but group projects aren’t your forte.";
		
		final String q3a1 = "<html>You can’t say no to people, even when you know that you should.";
		final String q3a2 = "<html>Your high ambitions and drive to achieve them can leave you taking on far more than you have time and energy for";
		final String q3a3 = "<html>You’re brutally honest, in a way that people sometimes can find rude or insensitive";
		final String q3a4 = "<html>Your focus on your own interests and goals can reduce the time and priority you place on your relationships with others";
		 
		final String q4a1 = "<html>Using your creative outlet--painting, drawing, writing-- whatever it may be.";
		final String q4a2 = "<html>Spending time with your friends. They always know how to cheer you up!";
		final String q4a3 = "<html>Making a to-do list to get all your thoughts and tasks out on paper.";
		final String q4a4 = "<html>Spending some time alone to rest and recharge from the day you’ve had.";
		 
		final String q5a1 = "<html>The “Mom friend”";
		final String q5a2 = "<html>The weird one";
		final String q5a3 = "<html>The quiet one";
		final String q5a4 = "<html>Depends on the friend group! You adapt to who you’re hanging out with.";
		 		
		final String q6a1 = "<html>Practical and comfortable";
		final String q6a2 = "<html>Expressive and breaking the mold";
		final String q6a3 = "<html>Whatever lets you channel your inner badass boss (confidence is key!)";
		final String q6a4 = "<html>A meme t-shirt and/or socks";
		 
		final String q7a1 = "<html>You stay true to yourself no matter what, and no person or thing can change that";
		final String q7a2 = "<html>You’re reliable, trustworthy, and honest with people";
		final String q7a3 = "<html>You’re a visionary-- able to think outside of the box and dream big dreams.";
		final String q7a4 = "<html>You’re in-tune with yourself and your own thoughts and emotions";
		
		final String plainDesc = "You are a plain bagel! This means that you are easy-going, compatible with many different types of people, and you generally go with the flow. You’re likeable, a crowd-favorite, because who doesn’t love a plain bagel?! Your strengths are compromise and adaptability, although sometimes that means that you can seek to please other people to the point where you sacrifice your happiness. Here’s what to remember, people care about you no matter what, so you don’t need to change for anyone!! Know that you’re irreplaceable, loved, and wanted, no matter where you are, so take heart in that :) Lastly, thank you for everything your plain bagel qualities add to this world <33";
		final String everythingDesc = "You are an everything bagel! You’re a go-getter, check things off a to-do list, badass boss human. You’re seriously a force of nature, and the rest of the world is continually in awe of what you’re able to accomplish. There’s nothing you can’t do! So while you’re out there, kicking ass and taking names, here’s a reminder: it’s okay to rest every once in a while. You’re not selfish or lazy or “failing to live up to your potential” when you take a well-deserved break! Like Morgan Harper Nicholas says, “Giving your all doesn’t mean you have to do it all, and you’re allowed to pace yourself.” Take those words to heart, and know that in the times that you’re working AND in the times that you’re resting, you’re changing the world, one everything bagel at a time :)";
		final String wholeWheatDesc = "You’re a whole wheat bagel! This means that you’re responsible, level headed, and rational. You tend to make decisions based on practical thinking, and experience, and when others come to you for advice (as they often do), you advise them to do the same. You truly know what’s best for your friends, and that sometimes, that means telling them things they might not want to hear. In fact, your ability to be brutally honest can be both a strength and a weakness. Used at the right times, and in situations where people know that you have their best interests at heart, this honesty can be exactly the wake up call that they need. Just be sure to know when and how to tell others the truth, because your words have power that you might not even realize. All in all, your character is the foundation of many fulfilling relationships, and friend groups, and your willingness to care for others truly and fully is unmatched. Thank you for everything you bring to this world, whole wheat bagel pal, because without you, your care and honesty would be sorely missed <33";
		final String poppyDesc = "You’re a Poppyseed bagel! This means that you are driven, have large-scale ambitions, and are tunnel-vision focused on what matters to you. Your strengths include perseverance, a fearless plan for the future, and the drive to take steps in the present to get you there. But while you’re chasing success, and passing milestones like speed limit signs on a highway, here’s a piece of advice: slow down every once in a while. As much as you will pack into this lifetime of yours, you do only live once, and if you’re always in pursuit of the next goal or advancement, you’ll forget to look around and be content with the people and circumstances that you have now. Every day is a blessing, and as you’re speeding down the road of life, be passionate about your destination, but also be grateful for who you get to have in the car with you :)";
		final String bloobDesc = "You’re a blueberry bagel! This means you’re artistic, individualistic, creative, and expressive. Although people may not always understand your ideas and beautifully unconventional thoughts, take that as a compliment. You have such strength in being a visionary, and the world needs more reckless dreamers like you!!";
		final String cinnaDesc = "You’re a Cinnamon Raisin bagel! Loved by all, you’re a kind and faithful friend. You prioritize compassion and empathy, and you enjoy providing for others. That is where your strengths lie-- in your social abilities and strong relationships with the people around you. With all of this love that you have to give, make sure to save some of that love for yourself, too. Sometimes when you prioritize relationships with others so much, you might forget how to have a loving relationship with yourself-- your mind & your body. Practice self-love today, and everyday, knowing that the empathy and care you have will never, ever run out, so you have plenty to spare :) <33";
		final String eggDesc = "You’re an Egg bagel! This means that you tend to be introverted, and enjoy time spent reflecting and pondering, on both the world outside of you, and the world inside of your own mind. People can misunderstand you as being antisocial or closed-off, but in reality, you’re more perceptive, open, and understanding to people’s emotions and needs than most others! This is a true strength, as your deep thinking and self-awareness makes your insight invaluable, and your worldview incredibly well-rounded and impactful. Keep using that beautiful mind of yours, because your thoughts have real power, and Egg Bagel ideas change the world :)";
		final String sunDriedDesc = "You’re a Sun-Dried Tomato and Wheat Bagel! This means that your strengths lie in originality and uniqueness. Your eccentric nature is what makes you awesome, because your passion is unmatched and your dedication to staying true to yourself is something we can all learn from :) In your adventure towards pursuing the you-est version of you, remember this: you don’t have to “fit in” to belong, and in fact, the things that set  you apart that are your greatest assets. Thank you for your reckless pursuit of yourself, in every way that you do so, because this world would not be the same without your Sun-Dried Tomato and Wheat self :)";
		
		String[] b1 = {q1a1, q1a2, q1a3, q1a4};
		
		String[] b2 = {q2a1, q2a2, q2a3, q2a4};
		
		String [] b3 = {q3a1, q3a2, q3a3, q3a4};
		
		String [] b4 = {q4a1, q4a2, q4a3, q4a4};
		
		String [] b5 = {q5a1, q5a2, q5a3, q5a4};
		
		String [] b6 = {q6a1, q6a2, q6a3, q6a4};
		
		String [] b7 = {q7a1, q7a2, q7a3, q7a4};
		
		Question q1 = new Question(1, "<html>Your friend is having trouble with"
				+ " a class, and their next midterm is next week. What do you do?", b1);
		
		Question q2 = new Question(2, "<html>One of your school clubs has a big upcoming project!"
				+ " How will you get involved?",b2);
		
		Question q3 = new Question(3, "<html>What’s your fatal flaw?", b3);
		
		Question q4 = new Question(4, "<html>What’s your tried-and-true de-stressor?", b4);
		
		Question q5 = new Question(5, "<html>In your friend group, you are: ", b5);
		
		Question q6 = new Question(6, "<html>Your choice in clothing: ", b6);
		
		Question q7 = new Question(7, "<html>One of your greatest strengths: ", b7);
		
		Question[] q = {q1, q2, q3, q4, q5, q6, q7};
		
		String[] responses = new String[7];
		for (int i = 0; i < responses.length; i++) {
			pressed = false;
			game.change(q[i]);
			while (!pressed) {
				responses[i]= choice;
			}
		}
		
		// get results
		int plain = 0;
		int everything = 0;
		int wholeWheat = 0;
		int poppySeed = 0;
		int bloobBgl = 0;
		int cinnamonRaisin = 0;
		int egg = 0;
		int sunDriedTomatAnWheet = 0;
		
		switch (responses[0]) {
		case q1a1:
			cinnamonRaisin++;
			break;
		case q1a2:
			wholeWheat++;
			break;
		case q1a3:
			poppySeed++;
			break;
		case q1a4:
			sunDriedTomatAnWheet++;
			break;
		}
		
		switch (responses[1]) {
		case q2a1:
			bloobBgl++;
			break;
		case q2a2:
			everything++;
			break;
		case q2a3:
			plain++;
			break;
		case q2a4:
			egg++;
			break;
		}
		
		switch (responses[2]) {
		case q3a1:
			plain++;
			break;
		case q3a2:
			everything++;
			break;
		case q3a3:
			wholeWheat++;
			break;
		case q3a4:
			poppySeed++;
			break;
		}

		switch (responses[3]) {
		case q4a1:
			bloobBgl++;
			break;
		case q4a2:
			cinnamonRaisin++;
			break;
		case q4a3:
			everything++;
			break;
		case q4a4:
			egg++;
			break;
		}
		
		switch (responses[4]) {
		case q5a1:
			wholeWheat++;
			break;
		case q5a2:
			sunDriedTomatAnWheet++;
			break;
		case q5a3:
			egg++;
			break;
		case q5a4:
			plain++;
			break;
		}
		
		switch (responses[5]) {
		case q6a1:
			wholeWheat++;
			break;
		case q6a2:
			bloobBgl++;
			break;
		case q6a3:
			everything++;
			break;
		case q6a4:
			sunDriedTomatAnWheet++;
			break;
		}
		
		switch (responses[6]) {
		case q7a1:
			sunDriedTomatAnWheet++;
			break;
		case q7a2:
			wholeWheat++;
			break;
		case q7a3:
			bloobBgl++;
			break;
		case q7a4:
			egg++;
			break;
		}
		
		int[] bagelArray = new int[8];
		bagelArray[0] = plain;
		bagelArray[1] = everything;
		bagelArray[2] = wholeWheat;
		bagelArray[3] = poppySeed;
		bagelArray[4] = bloobBgl;
		bagelArray[5] = cinnamonRaisin;
		bagelArray[6] = egg;
		bagelArray[7] = sunDriedTomatAnWheet;
		
		int highestFlavor=0;
		int highestRep = bagelArray[0];
		for(int i=1; i < bagelArray.length;i++) {
			if (bagelArray[i] > highestRep) {
				highestRep = bagelArray[i];
				highestFlavor = i;
			}
		}
		
		Results results;
		switch(highestFlavor) {
		case 0:
			results = new Results(plainDesc, "product-plain-bagel.jpg" );
			break;
		case 1:
			results = new Results(everythingDesc, "product-everything-bagel.jpg" );
			break;
		case 2:
			results = new Results(wholeWheatDesc, "product-whole-wheat-bagel.jpg" );
			break;
		case 3:
			results = new Results(poppyDesc, "product-poppy-bagel.jpg" );
			break;
		case 4:
			results = new Results(bloobDesc, "bloob.jpg" );
			break;
		case 5:
			results = new Results(cinnaDesc, "product-cinnamon-raisin-bagel.jpg" );
			break;
		case 6:
			results = new Results(eggDesc, "product-egg-bagel.jpg" );
			break;
		default:
			results = new Results(sunDriedDesc, "sundried.jpg" );
			break;
			
		}
		game.finalScreen(highestFlavor, results);
	}
}
