package testing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestClass
{

public static void main(String[] args) {

	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	LocalDate d1 = LocalDate.parse("09/10/2017", format);
	LocalDate d2 = LocalDate.parse("12/10/2017", format);
	System.out.println((int)getDifferenceDays(java.sql.Date.valueOf(d1),java.sql.Date.valueOf(d2)));
}

static long getDifferenceDays(Date d1, Date d2) {
    long diff = d2.getTime() - d1.getTime();
    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
}	
}


