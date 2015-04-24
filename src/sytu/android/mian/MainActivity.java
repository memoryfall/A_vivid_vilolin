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
	// 获得Gallery组件的属性
	TypedArray typedArray = obtainStyledAttributes(R.styleable.Gallery);
	mGalleryItemBackground = typedArray.getResourceId(
	R.styleable.Gallery_android_galleryItemBackground, 0); 
	}
	// 返回图像总数
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
	// 返回具体位置的ImageView对象
	public View getView(int position, View convertView, ViewGroup parent)
	{
	ImageView imageView = new ImageView(mContext);
	// 设置当前图像的图像（position为当前图像列表的位置）
	imageView.setImageResource(resIds[position]);
	imageView.setScaleType(ImageView.ScaleType.FIT_XY);
	imageView.setLayoutParams(new Gallery.LayoutParams(163, 106));
	// 设置Gallery组件的背景风格
	imageView.setBackgroundResource(mGalleryItemBackground);
	return imageView;
	}
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		// 装载Gallery组件
		Gallery gallery = (Gallery) findViewById(R.id.gallery);
		// 创建用于描述图像数据的ImageAdapter对象
		ImageAdapter imageAdapter = new ImageAdapter(this);
		// 设置Gallery组件的Adapter对象
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
