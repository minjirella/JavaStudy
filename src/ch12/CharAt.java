package ch12;

public class CharAt {
	public static void main(String[] args) {
		String str = "g fmnc wms bgblr rpylqjyrc gr zw fylb. "
				+ "rfyrq ufyr amknsrcpq ypc dmp. "
				+ "bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle "
				+ "sqgle qrpgle.kyicrpylq() gq pcamkkclbcb "
				+ "lmu ynnjw ml rfc spj";
		str = str.trim();
		int len = str.length();
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			if (c=='y') c = 'a';
			else if (c=='z') c = 'b';
			else c += (char)2;
			System.out.print(c);
		}
	}
}