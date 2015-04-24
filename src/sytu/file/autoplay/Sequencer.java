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
     * 设置音乐序列
     * @param sequence  音乐序列
     */
	public void setSequence(Sequence sequence) {
		this.sequence = sequence;
	}
	
	public void play() throws Exception
	{
		
		//mediaPlayer = MediaPlayer.create(context, soundMap.get(1));
		FileService fileService = new FileService(context);
		String content = fileService.read(sequence.getFilename());
		String notes[] = content.split(" ");          //以空格为分隔，将每个音符分开来
		for(String note:notes)
		{
			int letter =0;      //letter为音符
			int length=0;       //length为音长
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
				letter++;                           //"#"为半音
			}
			
			letter += countOfPoint(note)*12;      //找出note中含有“。”的数目，每多一个“。”，音符升7度
			length = (int)note.charAt(note.length()-1)-48;       //将char转换成int
			
		
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
