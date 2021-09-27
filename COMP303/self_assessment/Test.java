package self_assessment;

import java.util.Arrays;

public class Test {
	private static final String TEXT = "Lorem ipsum dolor sit amet, "
			+ "consectetur adipiscing elit. Nunc quis tempor tellus. Nulla "
			+ "tincidunt pretium justo non finibus. Fusce quis bibendum ante. "
			+ "Vivamus a ex maximus, iaculis nunc eu, posuere augue. Vestibulum "
			+ "ante ipsum primis in faucibus orci luctus et ultrices posuere "
			+ "cubilia Curae; Nullam ut lorem metus. Vivamus consequat eros "
			+ "sed lorem rhoncus finibus. Sed porta euismod consequat. Etiam "
			+ "sodales accumsan nulla, non pretium ex tincidunt eget. Aliquam "
			+ "nibh erat, tristique vel augue sit amet, sodales sollicitudin leo. "
			+ "Mauris in arcu volutpat, efficitur erat imperdiet, finibus dolor. "
			+ "Vestibulum a dolor sed justo tempor elementum. Pellentesque eu "
			+ "tincidunt ex, et posuere orci. Phasellus non nibh non nibh pharetra "
			+ "lobortis. ";
	
	public static void main(String[] args) {
		String[] words = TEXT.split(" ");
		//System.out.println(Arrays.toString(words));
		int occ = 1;
		String mostFrequentWord = "";
		for (int i = 0; i < words.length - 1; i++) {
			int currentOcc = 1;
			for(int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])){
					currentOcc++;
				}
			}
			if (currentOcc >= occ) {
				mostFrequentWord = words[i];
				occ = currentOcc;
			}
		}
		
		
		
		
		System.out.print("Most frequent: \""+ mostFrequentWord + "\"" + " (" + occ + " occurences)");
	}
}
