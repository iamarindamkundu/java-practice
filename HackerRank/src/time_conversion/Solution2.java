package time_conversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		String t = time.substring(0, 8) + " " + time.substring(8);
//		System.out.println(t);
		SimpleDateFormat dateformat = new SimpleDateFormat("hh:mm:ss aa");
		SimpleDateFormat dtformat = new SimpleDateFormat("HH:mm:ss");
		try {
			Date date = dateformat.parse(t);
			System.out.println(dtformat.format(date));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
