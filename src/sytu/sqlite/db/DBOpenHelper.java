package sytu.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpenHelper extends SQLiteOpenHelper {

	public DBOpenHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// factory=NULL
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// 数据库第一次被创建
		db.execSQL("CREATE TABLE musiclist(musicid integer primary key autoincrement,name varchar(20),url varchar(20))");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// 数据库版本号改变时候
		
	}

}
