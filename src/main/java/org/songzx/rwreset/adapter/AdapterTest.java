package org.songzx.rwreset.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		MusicPlayer player = new PlayerAdapter();
		player.play("mp3", "xxx.mp3");
		player.play("mp4", "xxx.mp4");
	}

}
