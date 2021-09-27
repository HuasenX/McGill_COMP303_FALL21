package chapter1;

public class TwelveDaysExercise1 {
	public static void main(String[] args)
	{
		System.out.println(poem());
	}

	static String[] DAYS = {"first", "second", "third", "fourth",
			"fifth", "sixth", "seventh", "eighth",
			"ninth", "tenth", "eleventh", "twelfth"};

	static String[] GIFTS = {
			"a partridge in a pear tree",
			"two turtle doves",
			"three French Hens",
			"four Calling Birds",
			"five Golden Rings",
			"six Geese a Laying",
			"seven Swans a Swimming",
			"eight Maids a Milking",
			"nine Ladies Dancing",
			"ten Lords a Leaping",
			"eleven Pipers Piping",
			"twelve Drummers Drumming"
	};
	
	static String firstLine(int day)
	{
		return "On the " + DAYS[day] +
				" day of Christmas my true love sent to me:\n";
	}

	static String poem() {
		String poem = firstLine(0) + GIFTS[0] + "\n\n";
		for (int d = 1; d < 12; d++) {
			poem += firstLine(d);
			for (int i = d; i >= 0; i--) {
				if (i > 0) {
					poem += GIFTS[i] + "\n";
				}else {
					poem += "and " + GIFTS[0] + "\n\n"; 
				}
			}
		}
		
		return poem;
	}
}
