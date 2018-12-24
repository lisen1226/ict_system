package com.dhcc.utils;

import java.util.UUID;

public class Tools {

	// 生成32位UUID
	public static String getUUID32() {
		return UUID.randomUUID().toString().replace("-", "").toLowerCase();
	}
}
