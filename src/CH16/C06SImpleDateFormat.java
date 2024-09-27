package CH16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C06SImpleDateFormat {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("YYYY/MM/DD 입력 :");
		String ymd = sc.next();
		
		//포메터 객체 생성(입력용)
		SimpleDateFormat fmtin = new SimpleDateFormat("yyyy/mm/dd");//y,m,d,h,m,s
		System.out.println(ymd);
		Date date = fmtin.parse(ymd);
		System.out.println(date);
		
		//포매터 객체 생성(출력용)
		SimpleDateFormat fmtout = new SimpleDateFormat("yyyy~mm~dd");//y,m,d,
		System.out.println(fmtout.format(date));
		
		
	}

}
