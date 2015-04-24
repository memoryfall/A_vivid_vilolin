package sytu.android.Sound;

import java.util.HashMap;

import sytu.android.mian.R;
import android.media.SoundPool;
import android.widget.Toast;
import android.content.Context;

public class ViolinSoundPool {
	
	public  Context context ;

	//SoundPool soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
	public  SoundPool soundPoll;
	//= new SoundPool(8, AudioManager.STREAM_MUSIC, 0); ;
	
	//public Context context;
	public  HashMap<Integer,Integer> soundPoolMap;
	//= new HashMap<Integer, Integer>();  
	
	public ViolinSoundPool( Context ccontext,HashMap<Integer,Integer> soundMap,SoundPool soundpoll){
		this.context = ccontext;
		soundPoolMap=soundMap;
		soundPoll=soundpoll;
		
	}//构造函数
	
	public  void SoundPoolLoadtest(){
		//if(true)
		//    Toast.makeText(context.getApplicationContext() , "已完成加载音乐文件" , Toast.LENGTH_SHORT).show();
		//else{
		    soundPoolMap.put(1,soundPoll.load(context, R.raw.m1, 1));
		    soundPoolMap.put(2,soundPoll.load(context, R.raw.m2, 1));
		    soundPoolMap.put(3,soundPoll.load(context, R.raw.m3, 1));
		    soundPoolMap.put(4,soundPoll.load(context, R.raw.m4, 1));
		    soundPoolMap.put(5,soundPoll.load(context, R.raw.m5, 1));
		    soundPoolMap.put(6,soundPoll.load(context, R.raw.m6, 1));
		    soundPoolMap.put(7,soundPoll.load(context, R.raw.m7, 1));
		    soundPoolMap.put(8,soundPoll.load(context, R.raw.m8, 1));
		    Toast.makeText(this.context , "已完成加载音乐文件" , Toast.LENGTH_SHORT).show();
		//}
	}
	public final int play(int soundID, float leftVolume, float rightVolume, int priority, int loop, float rate)throws Exception{
		
		return soundPoll.play(soundID,leftVolume,rightVolume,priority,loop,rate);
	}

	public  void stop(int streamID)throws Exception {
		// TODO Auto-generated method stub
		soundPoll.stop(streamID);
	}


	public void pause(Integer integer) {
		// TODO Auto-generated method stub
		soundPoll.pause(integer);
	}
}
