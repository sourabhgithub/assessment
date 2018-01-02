package com.hcl.interviews;

public class NumberNamesImpl implements NumberNames {
	final private static String[] units = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };
	final private static String[] tens = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };

	@Override
	public String int2Text(final long input) {
		Integer integerInput = (int) input;
		return integerInput > 0 ? convert(integerInput) : "Invalid Input";

	}

	public static String convert(final Integer i) {

		if (i < 20)
			return units[i];
		if (i < 100)
			return tens[i / 10] + ((i % 10 > 0) ? "-" + convert(i % 10) : "");
		if (i < 1000)
			return units[i / 100] + " hundred" + ((i % 100 > 0) ? " " + convert(i % 100) : "");
		if (i < 1000000)
			return convert(i / 1000) + " thousand," + ((i % 1000 > 0) ? " " + convert(i % 1000) : "");
		return convert(i / 1000000) + " million," + ((i % 1000000 > 0) ? " " + convert(i % 1000000) : "");
	}
}
