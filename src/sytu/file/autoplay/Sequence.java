package sytu.file.autoplay;
public class Sequence {

	private String filename;
	private int volumn;
	private int tone = 1;
	private int beat = 8000;
	
	public Sequence(String filename) {
		this.filename = filename;
	}
	
	public int getVolumn() {
		return volumn;
	}
	/**
	 * 设置音量
	 * @param volumn 音量
	 */
	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}

	public int getTone() {
		return tone;
	}
	/**
	 * 设置音色
	 * @param tone 音色
	 */
	public void setTone(int tone) {
		this.tone = tone;
	}

	public int getBeat() {
		return beat;
	}
	/**
	 * 设置节拍
	 * @param beat 节拍
	 */
	public void setBeat(int beat) {
		this.beat = beat;
	}

	public String getFilename() {
		return filename;
	}
	/**
	 * 设置文件名
	 * @param filename 文件名
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}

}
