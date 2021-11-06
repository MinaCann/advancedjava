package javadevelopmentDay01;

public class Enum02Class {

	public static void main(String[] args) {
		Enum01 enm1= Enum01.JANUARY;
		System.out.println(enm1);
		
		Enum01 month = Enum01.JANUARY;
		
		switch(month) {//Inside the month variable
		case JANUARY://If the month is January
			System.out.println("This is January");//Print "This is January"
			break;
		case FEBRUARY:
			System.out.println("This is FEBRUARY");
			break;
		case MARCH:
			System.out.println("This is MARCH");
			break;
		case APRIL:
			System.out.println("This is APRIL");//Print "This is January"
			break;
		case MAY:
			System.out.println("This is MAY");//Print "This is January"
			break;
		case JUNE:
			System.out.println("This is JUNE");//Print "This is January"
			break;
		case JULY:
			System.out.println("This is January");//Print "This is January"
			break;
		case AUGUST:
			System.out.println("This is January");//Print "This is January"
			break;
		case SEPTEMBER:
			System.out.println("This is January");//Print "This is January"
			break;
		case OCTOBER:
			System.out.println("This is January");//Print "This is January"
			break;
		case NOVEMBER:
			System.out.println("This is January");//Print "This is January"
			break;
		case DECEMBER:
			System.out.println("This is January");//Print "This is January"
			break;
			
			
		}

	}

}
