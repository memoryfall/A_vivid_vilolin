package sytu.file.autoplay;

import java.util.HashMap;

import sytu.android.mian.EnjoyActivity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.widget.ImageButton;

public class Sequencer {
	public EnjoyActivity game;
	public Context context;
	public Sequence sequence;
	public HashMap<Integer,Integer> soundMap = new HashMap<Integer, Integer>();
	public Sequencer(MediaPlayer mediaPlayer, Sequence sequence,Context context,EnjoyActivity game) {
		this.sequence = sequence;
		this.context = context;
		this.game = game;
		
	}
	
	public Sequence getSequence() {
		return sequence;
	}
    /**
     * ������������
     * @param sequence  ��������
     */
	public void setSequence(Sequence sequence) {
		this.sequence = sequence;
	}
	
	public void play() throws Exception
	{
		
		//mediaPlayer = MediaPlayer.create(context, soundMap.get(1));
		FileService fileService = new FileService(context);
		String content = fileService.read(sequence.getFilename());
		String notes[] = content.split(" ");          //�Կո�Ϊ�ָ�����ÿ�������ֿ���
		for(String note:notes)
		{
			int letter =0;      //letterΪ����
			int length=0;       //lengthΪ����
			switch(note.charAt(0))
			{
			case 'C':letter=1;break;
			case 'D':letter=3;break;
			case 'E':letter=5;;break;
			case 'F':letter=6;break;
			case 'G':letter=8;break;
			case 'A':letter=10;break;
			case 'B':letter=12;break;
			default:
			}
			if(note.contains("#"))
			{
				letter++;                           //"#"Ϊ����
			}
			
			letter += countOfPoint(note)*12;      //�ҳ�note�к��С���������Ŀ��ÿ��һ����������������7��
			length = (int)note.charAt(note.length()-1)-48;       //��charת����int
			
		
			switch(note.charAt(0))
			{
			case 'C':letter=1;break;
			case 'D':letter=3;break;
			case 'E':letter=5;break;
			case 'F':letter=6;break;
			case 'G':letter=8;break;
			case 'A':letter=10;break;
			case 'B':letter=12;break;
			default:
			}
			
	}
}
	private int countOfPoint(String note)
	{
		
		int count=0;
		for(int i=0;i<note.length();i++)
		{
			if(note.charAt(i)=='.')
			{
				count++;
			}
		}
		return count;
	}
}
