
package Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicPatternMatch {
	
	public static void main(String[] args) {
		int count = 0;
		Pattern p = Pattern.compile("bd");
		Matcher m = p.matcher("abcbdefgbdasfbd");
		
		while(m.find()){
			count++;
			System.out.println("Occurance:"+ count);
			System.out.println(m.start() +"   "+ m.end()+"  "+m.group());
		}
	}
}
