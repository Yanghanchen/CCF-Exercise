package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<json> jsonList = new ArrayList<>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int flag = 0;
		String qianzhui = "";
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			input = trimxiegang(input);
			if (input.equals("{")) {
				continue;
			} else if (input.equals("}")) {
				break;
			} else if (input.equals("},")) {
				flag--;
				if (qianzhui.contains(".")) {
					qianzhui = qianzhui.substring(0, qianzhui.lastIndexOf("."));
				} else {
					qianzhui = "";
				}
			} else if (input.endsWith("{")) {
				if (flag != 0) {
					qianzhui += ".";
				}
				flag++;
				qianzhui += input.substring(1, input.lastIndexOf("\""));
				jsonList.add(new json(qianzhui));
			} else {
				String[] temp = input.split(":");
				String key = temp[0].trim();
				key = key.substring(1, key.length() - 1);
				if (qianzhui.length() == 0) {
					key = qianzhui + key;
				} else {
					key = qianzhui + "." + key;
				}
				int x = 1;
				if (!input.endsWith(",")) {
					x = 0;
				}
				String value = temp[1].substring(0, temp[1].length() - x).trim();
				value = value.substring(1, value.length() - 1);
				jsonList.add(new json(key, value));
			}
		}
		ArrayList<String> chaxun = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			String input = sc.next();
			chaxun.add(input);
		}
		for (String s : chaxun) {
			Iterator<json> it = jsonList.iterator();
			boolean chadaole = false;
			while (it.hasNext()) {
				json Json = it.next();
				if (Json.getKey().equals(s)) {
					String shuchu=Json.getType() + " " + Json.getValue();
					System.out.println(shuchu.trim());
					chadaole = true;
					break;
				}
			}
			if (!chadaole) {
				System.out.println("NOTEXIST");
			}
		}
		sc.close();
	}

	private static String trimxiegang(String input) {
		while (input.contains("\\\"")) {
			input = input.replace("\\\"", "\"");
		}
		while (input.contains("\\\\")) {
			input = input.replace("\\\\", "\\");
		}
		return input;
	}

	private static class json {
		String key;
		String value;
		String type;

		public json(String key) {
			super();
			this.key = key;
			this.value = "";
			this.type = "OBJECT";
		}

		public json(String key, String value) {
			super();
			this.key = key;
			this.value = value;
			this.type = "STRING";
		}

		public String getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}

		public String getType() {
			return type;
		}
	}
}
