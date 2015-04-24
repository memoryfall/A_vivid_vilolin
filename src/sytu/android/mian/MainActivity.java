package sytu.android.mian;


import sytu.android.Sound.ViolinSoundPool;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity {

	private int[] resIds = new int[]{ 
			R.drawable.start, R.drawable.about, R.drawable.enjoy,R.drawable.myviolin,R.drawable.setting
			};

	public class ImageAdapter extends BaseAdapter
	{
	int mGalleryItemBackground;
	private Context mContext;
	public ImageAdapter(Context context)
	{
	mContext = context;
	// ���Gallery���������
	TypedArray typedArray = obtainStyledAttributes(R.styleable.Gallery);
	mGalleryItemBackground = typedArray.getResourceId(
	R.styleable.Gallery_android_galleryItemBackground, 0); 
	}
	// ����ͼ������
	public int getCount()
	{
	return resIds.length;
	}
	public Object getItem(int position)
	{
	return position;
	}
	public long getItemId(int position)
	{
	return position;
	}
	// ���ؾ���λ�õ�ImageView����
	public View getView(int position, View convertView, ViewGroup parent)
	{
	ImageView imageView = new ImageView(mContext);
	// ���õ�ǰͼ���ͼ��positionΪ��ǰͼ���б��λ�ã�
	imageView.setImageResource(resIds[position]);
	imageView.setScaleType(ImageView.ScaleType.FIT_XY);
	imageView.setLayoutParams(new Gallery.LayoutParams(163, 106));
	// ����Gallery����ı������
	imageView.setBackgroundResource(mGalleryItemBackground);
	return imageView;
	}
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		// װ��Gallery���
		Gallery gallery = (Gallery) findViewById(R.id.gallery);
		// ������������ͼ�����ݵ�ImageAdapter����
		ImageAdapter imageAdapter = new ImageAdapter(this);
		// ����Gallery�����Adapter����
		gallery.setAdapter(imageAdapter);
		
	
		gallery.setOnItemClickListener(new OnItemClickListener() 
		{
		public void onItemClick (AdapterView<?> parent, View v,
		int position, long id) 
		{
			switch(position){
                 case 0:
                	 Intent intentstart = new Intent();
                	 intentstart.setClass(MainActivity.this,Game_onActivity.class);
                	 startActivity(intentstart);
                    break;
                 case 1:
                	 Intent intentus = new Intent();
                	 intentus.setClass(MainActivity.this,AboutActivity.class);
                	 startActivity(intentus);
                     break;
                 case 2:
                	 Intent intentenjoy = new Intent();
                	 intentenjoy.setClass(MainActivity.this,EnjoyActivity.class);
                	 startActivity(intentenjoy);
                    break;
                 case 3:
                	 Intent intentmy = new Intent();
                	 intentmy.setClass(MainActivity.this,FreeplayActivity.class);
                	 startActivity(intentmy);
                     break;
                 case 4:
                	 Intent intentsetting = new Intent();
                	 intentsetting.setClass(MainActivity.this,SettingActivity.class);
                	 startActivity(intentsetting);
                	 break;
                 default:
                    break;
    }
		}
		});
	
	}	
}
