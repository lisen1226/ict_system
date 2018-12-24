package com.dhcc.utils;

public class CheckAccuracy {

	public static String CheckAccuracy(String accuracy) {
		String[] accs = accuracy.split("/");
		double rate = Double.valueOf(accs[0].toString()) / Double.valueOf(accs[1].toString());
		if (rate >= Common.PASS_RATE) {
			return "pass:" + rate;
		}
		return "fail:" + rate;
	}

	public static String CheckAccuracy(String accuracy, double rater) {
		String[] accs = accuracy.split("/");
		double rate = Double.valueOf(accs[0].toString()) / Double.valueOf(accs[1].toString());
		if (rate >= rater) {
			return "pass:" + rate;
		}
		return "fail:" + rate;
	}

	public static Integer CheckAccuracy(String accuracy, int score) {
		String[] accs = accuracy.split("/");
		return Integer.valueOf(accs[0]) * score;
	}
}
