package org.songzx.rwreset.adapter;

public interface MusicPlayer {
	/**
	 * 播放音乐
	 * 
	 * @param type
	 *            音乐格式
	 * @param filename
	 *            文件
	 */
	public void play(String type, String filename);
}
