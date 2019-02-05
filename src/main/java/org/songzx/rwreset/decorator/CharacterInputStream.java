package org.songzx.rwreset.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CharacterInputStream extends FilterInputStream {

	protected CharacterInputStream(InputStream in) {
		super(in);
	}

	@Override
	public int read() throws IOException {
		// ASCLL码对照,[97,122] 和 [65,90]是英文字母
		int c = super.read();
		if (c >= 97 && c <= 122 || c >= 65 && c <= 90) {
			return 32; // 32是空格
		} else {
			return c;
		}
	}

	

}
