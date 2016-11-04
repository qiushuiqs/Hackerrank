import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		BitSet bitSet1 = new BitSet(n);
		BitSet bitSet2 = new BitSet(n);
		for(int i = 0; i < n; i++) {
			bitSet1.set(i, false);
			bitSet2.set(i, false);
		}
		in.nextLine();
		BitSet result;
		BitSet target;

		for (int i = 0; i < m; i++) {
			String operation = in.nextLine();
			String[] positions = operation.trim().split(" ");

			if(Integer.valueOf(positions[1]) == 1) {
				result = bitSet1;
				target = bitSet2;
			} else {
				result = bitSet2;
				target = bitSet1;
			}

			String operand = positions[0];
			switch(operand) {
				case "AND":
					result.and(target);
					break;
				case "OR":
					result.or(target);
					break;
				case "XOR":
					result.xor(target);
					break;
				case "SET":
					result.set(Integer.valueOf(positions[2]));
					break;
				case "FLIP":
					result.flip(Integer.valueOf(positions[2]));
					break;
			}
			System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
		}
	}

	public static int bitSetToInt(BitSet bitSet, int n)
	{
		int bitInteger = 0;
		for(int i = 0 ; i < n; i++)
			if(bitSet.get(i))
				bitInteger |= (1 << i);
		return bitInteger;
	}
}
