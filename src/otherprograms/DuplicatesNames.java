package otherprograms;

import java.util.HashSet;

public class DuplicatesNames {

	public static void main(String[] args) {
		String[] names = { "abc", "def", "ghi", "jkl", "abc", "pqr", "abc" };
		HashSet h = new HashSet();
		for (String x : names) {
			if (h.add(x) == false) {
				System.out.println("Duplicate Found:" + x);
			}
		}
		System.out.println("************");
		findDuplicate(names);
	}

	public static void findDuplicate(String names[]) {
		int length = names.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Duplicate Found: " + names[i]);
				}
			}
		}
	}
}
