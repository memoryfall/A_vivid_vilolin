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
	 * ��������
	 * @param volumn ����
	 */
	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}

	public int getTone() {
		return tone;
	}
	/**
	 * ������ɫ
	 * @param tone ��ɫ
	 */
	public void setTone(int tone) {
		this.tone = tone;
	}

	public int getBeat() {
		return beat;
	}
	/**
	 * ���ý���
	 * @param beat ����
	 */
	public void setBeat(int beat) {
		this.beat = beat;
	}

	public String getFilename() {
		return filename;
	}
	/**
	 * �����ļ���
	 * @param filename �ļ���
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}

}
