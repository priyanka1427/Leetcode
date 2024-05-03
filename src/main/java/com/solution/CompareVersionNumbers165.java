package com.solution;

public class CompareVersionNumbers165 {
	public static void main(String[] args) {
		String v1 = "2.1";
		String v2 = "1.1";

		System.out.println(compareVersion(v1, v2));
	}

	private static int compareVersion(String v1, String v2) {
		String[] v1Array = v1.split("\\.");
		String[] v2Array = v2.split("\\.");

		int length = Math.max(v1Array.length, v2Array.length);

		for (int i = 0; i <= length; i++) {
			int num1 = (i < v1Array.length) ? Integer.parseInt(v1Array[i]) : 0;
			int num2 = (i < v2Array.length) ? Integer.parseInt(v2Array[i]) : 0;

			if (num1 > num2) {
				return 1;
			} else if (num2 > num1) {
				return -1;
			}
		}

		return 0;
	}
}
