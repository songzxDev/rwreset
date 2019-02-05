package org.songzx.rwreset.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class CISTest {
	public static void main(String[] args) throws IOException {
		DataInputStream in = new DataInputStream(new CharacterInputStream(
				new FileInputStream("F:/souceCodes/workspace/rwreset/src/main/java/org/songzx/rwreset/decorator/text.txt")));

		String str;
		while ((str = in.readLine()) != null) {
			System.out.println(str);
		}
	}
}
