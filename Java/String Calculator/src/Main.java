import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		// Create some new StringNumbers;
			// if the string is empty, it defaults to 0 and returns;
			// if a decimal comes before a negative, any negatives and decimals after are parsed out;
			// if a negative comes before a decimal, any negatives after are parsed out;
			// if a decimal comes, any decimal after is parsed out, or if a negative comes, any negative after is parsed out;
			// parses out any non-number with the above conditions being true;
			// after parsing, if the string is still empty, it defaults to 0 and returns;
			// after parsing, if a decimal is the first digit or a negative is the first digit followed by a decimal, a zero is inserted before the decimal;
			// any number of zeros past 1 to the left of the decimal point are removed;
		// creating a new string number follows the rules above for setting a correct StringNumber and same rules for setting a StringNumber;
		System.out.println("Create and Set:");
		StringNumber z = new StringNumber(); // defaults to 0;
		StringNumber x = new StringNumber("6"); // sets to the number you implement;
		StringNumber y = new StringNumber("\n"); // defaults to 0;
		StringNumber n = new StringNumber(x); // sets to another StringNumber;
		System.out.println(n);
		z.set(x);					System.out.println("x:\t\t\t"+z.get()); // sets to another StringNumber;
		z.set();					System.out.println("[EMPTY]:\t\t"+z.get()); // defaults to 0;
		z.set("0");					System.out.println("\"0\":\t\t\t"+z.get()); // defaults to 0; 
		z.set("");					System.out.println("\"\":\t\t\t"+z.get()); // defaults to 0; 
		z.set(".a-a-7-x.mld.89&");	System.out.println(".a-a-7-x.mld.89&:\t"+z.get()); // sets to 0.789;
		z.set("a-a-7-x.mld.89&");	System.out.println("a-a-7-x.mld.89&:\t"+z.get()); // sets to -7.89;
		z.set("a-.a-7-x.mld.89&");	System.out.println("a-.a-7-x.mld.89&:\t"+z.get()); // sets to -0.789;
		z.set("a.a-7-x.mld.89&");	System.out.println("a.a-7-x.mld.89&:\t"+z.get()); // sets to 0.789;
		z.set(".");					System.out.println(".:\t\t\t"+z.get()); // sets to 0;
		z.set("-");					System.out.println("-:\t\t\t"+z.get()); // sets to 0;
		z.set("-.");				System.out.println("-.:\t\t\t"+z.get()); // sets to 0;
		z.set(".-");				System.out.println(".-:\t\t\t"+z.get()); // sets to 0;
		z.set("0007");				System.out.println("0007:\t\t\t"+z.get()); // sets to 7;
		z.set("-00.07");			System.out.println("-00.07:\t\t\t"+z.get()); // sets to -0.07;
		z.set("-.07");				System.out.println("-.07:\t\t\t"+z.get()); // sets to -0.07;
		z.set("00000.00008");		System.out.println("00000.00008:\t\t"+z.get()); // sets to 0.00008;
		z.set("00000.00000");		System.out.println("00000.00000:\t\t"+z.get()); // sets to 0.00000;
		z.set("00008.80000");		System.out.println("00008.80000:\t\t"+z.get()); // sets to 8.8;
		z.set("00000.80008");		System.out.println("00000.80008:\t\t"+z.get()); // sets to 0.80008;
		z.set("0007.0000866000");	System.out.println("0007.0000866000:\t"+z.get()); // sets to 7.0000866;
		z.set("0007000.086600");	System.out.println("0007000.086600:\t\t"+z.get()); // sets to 7000.0866;
		z.set("-0.");				System.out.println("-0.:\t\t\t"+z.get()); // sets to 0;
		z.set("0.");				System.out.println("0.:\t\t\t"+z.get()); // sets to 0;
		z.set(".0");				System.out.println(".0:\t\t\t"+z.get()); // sets to 0;
		z.set("-.0");				System.out.println("-.0:\t\t\t"+z.get()); // sets to 0;
		z.set("-0.0");				System.out.println("-0.0:\t\t\t"+z.get()); // sets to 0;
		z.set("0.0");				System.out.println("0.0:\t\t\t"+z.get()); // sets to 0;
		z.set("008000");			System.out.println("008000:\t\t\t"+z.get()); // sets to 8000;
		// Perform an operation on a set of StringNumbers and set equal to another StringNumber;
		System.out.println("Operations: "+"x: "+x.get()+" y: "+y.get()+" z: "+z.get());
		x = StringMath.add(x, y); // x = 6 + 0 = 60;
		System.out.println(x.get());
		// Perform an operation on a StringNumber and set equal to itself and the other number (A StringNumber or a String);
		x.add(y); // x.add("44");
		System.out.println(x.get());
		System.out.println( "Add two strings together: "+StringMath.add(x.get(), "4LL"));
		System.out.println( "Add two StringNumbers together: " + StringMath.add( x, new StringNumber("4") ).get() );
		// test private add: 
		System.out.println( (10+29) + "|" + (-10+29) + "|" + (10+-29) + "|" + (-10+-29) );
		System.out.println( "10 + 29 = " + StringMath.add("10","29") );
		System.out.println( "-10 + 29 = " + StringMath.add("-10","29") );
		System.out.println( "10 + -29 = " + StringMath.add("10","-29") );
		System.out.println( "-10 + -29 = " + StringMath.add("-10","-29") );
		System.out.println( "\n" + (29+10) + "|" + (-29+10) + "|" + (29+-10) + "|" + (-29+-10) );
		System.out.println( "29 + 10 = " + StringMath.add("29","10") );
		System.out.println( "-29 + 10 = " + StringMath.add("-29","10") );
		System.out.println( "29 + -10 = " + StringMath.add("29","-10") );
		System.out.println( "-29 + -10 = " + StringMath.add("-29","-10") );
		System.out.println( "5 + 101 = " + StringMath.add("5","101") );
		System.out.println( "101 + 5 = " + StringMath.add("101","5") );
//		 test private sub: 
		System.out.println( (10-29) + "|" + (-10-29) + "|" + (10-(-29)) + "|" + (-10-(-29)) );
		System.out.println( "10 - 29 = " + StringMath.sub("10","29") );
		System.out.println( "-10 - 29 = " + StringMath.sub("-10","29") );
		System.out.println( "10 - -29 = " + StringMath.sub("10","-29") );
		System.out.println( "-10 - -29 = " + StringMath.sub("-10","-29") );
		System.out.println( "\n" + (29-10) + "|" + (-29-10) + "|" + (29-(-10)) + "|" + (-29-(-10)) );
		System.out.println( "29 - 10 = " + StringMath.sub("29","10") );
		System.out.println( "-29 - 10 = " + StringMath.sub("-29","10") );
		System.out.println( "29 - -10 = " + StringMath.sub("29","-10") );
		System.out.println( "-29 - -10 = " + StringMath.sub("-29","-10") );
		System.out.println( "-2.04 - -0.555 = " + StringMath.sub("-2.04","-0.555") );
//		 test add and subtract decimals:
		System.out.println( "555401.5552 - 555400.5552 = " + StringMath.sub("555401.5552","555400.5552") );
		System.out.println( "90.989333433999 - 9.989333333999 = " + StringMath.sub("90.989333433999","9.989333333999") );
		System.out.println( "9.989333433999 - 9.989333333999 = " + StringMath.sub("9.989333433999","9.989333333999") );
		System.out.println( "9.989333433999 + 9.989333333999 = " + StringMath.add("9.989333433999","9.989333333999") );
		System.out.println( "9.988 + 9.989 = " + StringMath.add("9.988","9.989") );
		System.out.println( "489.635 + 4 = " + StringMath.add("489.635","4") );
		System.out.println( "-489.635 + 4 = " + StringMath.add("-489.635","4") );
		System.out.println( "4 - 6 = " + StringMath.sub("4","6") );
		System.out.println( "99 - 108 = " + StringMath.sub("99","108") );
		System.out.println( "0.3 - 0.7 = " + StringMath.sub("0.3","0.7") );
		System.out.println( "5554.4555 - 5556.7555 = " + StringMath.sub("5554.4555","5556.7555") );
		System.out.println( "5554.4555 - 5554.4555 = " + StringMath.sub("5554.4555","5554.4555") );
		System.out.println( "18446744073709551615 + 18446744073709551615 = " + StringMath.add("18446744073709551615","18446744073709551615") );
//		 test multiply both decimals and integers: 
		System.out.println(StringMath.toStringNumber("0"));
		System.out.println( "9 * 9 = " + StringMath.mult("9","9") );
		System.out.println( "9001 * 9001 = " + StringMath.mult("9001","9001") );
		System.out.println( "88 * 999 = " + StringMath.mult("999","88") );

		System.out.println( "0.3 * 2.13 = " + StringMath.mult("0.3","2.13") );
		System.out.println( "2.13 * 0.3 = " + StringMath.mult("2.13","0.3") );
		System.out.println( "0.00003 * 2.13 = " + StringMath.mult("0.00003","2.13") );
		System.out.println( "0.000303 * 2.13 = " + StringMath.mult("0.000303","2.13") );
		System.out.println( "213 * 303 = " + StringMath.mult("213","303") );
		System.out.println( "0000.00003 * 2.13 = " + StringMath.mult("0000.00003","2.13") );
		System.out.println( "-0.3 * 222.13 = " + StringMath.mult("-0.3","222.13") );
		System.out.println( "999955 * 999955 = " + StringMath.mult("999955","999955") );
		System.out.println( "9999.55 * -9999.55 = " + StringMath.mult("9999.55","-9999.55") );
		System.out.println( "-.1 * -9 = " + StringMath.mult("-.1","-9") );
		System.out.println( "18446744073709551615 * 2 = " + StringMath.mult("18446744073709551615","2") );
		System.out.println( "18446744073709551615 * 18446744073709551615 = " + StringMath.mult("18446744073709551615","18446744073709551615") );
		System.out.println( "340282366920938463426481119284349108225 * 340282366920938463426481119284349108225 = " + StringMath.mult("340282366920938463426481119284349108225","340282366920938463426481119284349108225") );
		System.out.println( "115792089237316195398462578067141184799968521174335529155754622898352762650625 * 115792089237316195398462578067141184799968521174335529155754622898352762650625 = " + StringMath.mult("115792089237316195398462578067141184799968521174335529155754622898352762650625","115792089237316195398462578067141184799968521174335529155754622898352762650625") );
		System.out.println( "13407807929942597093759315203840991004188031530987402520718628407015669769757842313630909715223819254400837606388228716074377856895316039510175975812890625 * 13407807929942597093759315203840991004188031530987402520718628407015669769757842313630909715223819254400837606388228716074377856895316039510175975812890625 = " + StringMath.mult("13407807929942597093759315203840991004188031530987402520718628407015669769757842313630909715223819254400837606388228716074377856895316039510175975812890625","13407807929942597093759315203840991004188031530987402520718628407015669769757842313630909715223819254400837606388228716074377856895316039510175975812890625") );
		System.out.println( "1000 * 1000 = " + StringMath.mult("1000","1000") );
		// DO LISTS
		List<Object> f = new LinkedList<>();
		StringNumber g = new StringNumber(9.9);
		System.out.println(g);
		f.add(5);
		f.add(6.6D);
		f.add(7.22F);
		f.add(false);
		f.add("-48888888");
		f.add(new StringNumber("1"));
		f.add(g);
		g.add(new StringNumber());
		g.add("44");
		System.out.println(g.get()+"||"+g+"||"+g.toString());
		g.reset();
		System.out.println(g.get()+"||"+g+"||"+g.toString());
		System.out.println( " (two lists of objects (f,f)) = " + StringMath.add( f, f ));
		System.out.println( " true+\"22\"+.222+false = " + StringMath.add( new ArrayList<>(Arrays.asList(true,"22",.222, false)) ));
		System.out.println( " new list(g, g, \"1\") = " + StringMath.add( new LinkedList<>(Arrays.asList(g,g,"1")) ));
		System.out.println( " 3 + g + g = " + StringMath.add( new StringNumber("3"), g, g));
		// test divide both decimals and integers: 
	}
}