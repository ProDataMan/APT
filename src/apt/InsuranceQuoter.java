package apt;

public class InsuranceQuoter {
	public static double getQuote(int arg1, String arg2, int arg3, String arg4, String arg5) {	
		// basic quote is .2% of market value
		double x = arg1 * .002;
		// then there's a multiplier for the type of the property
		if (arg2.equals("apartment")) x = x * .95;
		if (arg2.equals("semi")) x = x * 1.05;
		if (arg2.equals("terraced")) x = x;
		if (arg2.equals("detached")) x = x * 1.1;
		// add on 1% for each bedroom
		x+= (arg3 * (x / 100));
		// different multipliers based on the year of construction
		if (Integer.parseInt(arg4) <= 1900) x += x * .04;
		else if (Integer.parseInt(arg4) <= 1921) x += x * .03;
		else if (Integer.parseInt(arg4) <= 1951) x += x * .02;
		else if (Integer.parseInt(arg4) <= 1971) x += x * .01;
		// a bit more for a timber house
		if (arg4.equals("timber")) x += x * 0.1;
		return x;
	}
}
