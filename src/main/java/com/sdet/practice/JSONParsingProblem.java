package com.sdet.practice;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONParsingProblem {

	public static void main(String[] args) {

		String jsonPayload = "{\n" + "  \"orderId\": \"O1001\",\n" + "  \"orderDate\": \"2025-05-10\",\n"
				+ "  \"customer\": {\n" + "    \"name\": \"Bob Johnson\",\n" + "    \"address\": {\n"
				+ "      \"street\": \"123 Maple Street\",\n" + "      \"city\": \"Anytown\",\n"
				+ "      \"state\": \"CA\",\n" + "      \"zip\": \"90210\"\n" + "    },\n" + "    \"contact\": {\n"
				+ "      \"email\": \"bob.j@example.com\",\n" + "      \"phone\": \"555-4567\"\n" + "    }\n" + "  },\n"
				+ "  \"items\": [\n" + "    {\n" + "      \"productId\": \"P001\",\n"
				+ "      \"productName\": \"Laptop\",\n" + "      \"quantity\": 2,\n" + "      \"price\": 999.99\n"
				+ "    },\n" + "    {\n" + "      \"productId\": \"P003\",\n" + "      \"productName\": \"Keyboard\",\n"
				+ "      \"quantity\": 1,\n" + "      \"price\": 75.50\n" + "    }\n" + "  ],\n"
				+ "  \"associatedProblems\": [\n" + "    {\n" + "      \"problemName\": \"Diabetes\",\n"
				+ "      \"medications\": [\n" + "        {\n" + "          \"medicationName\": \"Aspirin\",\n"
				+ "          \"dose\": \"500 mg\"\n" + "        },\n" + "        {\n"
				+ "          \"medicationName\": \"Metformin\",\n" + "          \"dose\": \"850 mg\"\n" + "        }\n"
				+ "      ]\n" + "    }\n" + "  ],\n" + "  \"status\": \"pending\"\n" + "}";

		paresJSON(jsonPayload);
	}

	public static void paresJSON(String jsonPayload) {

		JSONObject jsonObject = new JSONObject(jsonPayload);

		JSONArray jsonArray = jsonObject.getJSONArray("items");

		for (int index = 0; index < jsonArray.length(); index++) {

			JSONObject item = jsonArray.getJSONObject(index);

			if (item.getString("productName").equalsIgnoreCase("Laptop")) {

				item.put("productName", "Desktop");
			}
		}

		System.out.println("Replace JSON: " + jsonObject.toString(2));
	}
}