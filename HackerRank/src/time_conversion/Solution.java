package time_conversion;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		int hour = Integer.valueOf(time.substring(0, 2));
		int min = Integer.valueOf(time.substring(3, 5));
		int sec = Integer.valueOf(time.substring(6, 8));
		String ampm = time.substring(8);
		
		if (ampm.equalsIgnoreCase("AM")) {
            if (hour == 12) {
                String h = "00";
                String m = min < 10 ? "0" + min : min + "";
    			String s = sec < 10 ? "0" + sec : sec + "";
                System.out.println(h + ":" + m + ":" + s);
            }
            else {
                String h = hour < 10 ? "0" + hour : hour + "";
                String m = min < 10 ? "0" + min : min + "";
                String s = sec < 10 ? "0" + sec : sec + "";
                System.out.println(h + ":" + m + ":" + s);
            }
        }
		else if (ampm.equalsIgnoreCase("PM")) {
            if (hour == 12) {
               String m = min < 10 ? "0" + min : min + "";
			   String s = sec < 10 ? "0" + sec : sec + "";
			   System.out.println(hour + ":" + m + ":" + s);
            }
            else {
                hour += 12;
                String m = min < 10 ? "0" + min : min + "";
                String s = sec < 10 ? "0" + sec : sec + "";
                System.out.println(hour + ":" + m + ":" + s);
            }
		}
		sc.close();
	}
}
