import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by willyreyes on 3/26/16.
 */
public class DatabaseOperation extends SQLiteOpenHelper {
    public static final int Database_version = 1;
    public String CREATE_QUERY="CREATE_TABLE"+ Tabledata.Tableinfo.TABLE_NAME+"("+ Tabledata.Tableinfo.USER_NAME+" TEXT,"+ Tabledata.Tableinfo.USER_PASS+"TEXT ;)";
    public DatabaseOperation(Context context) {
        super(context, Tabledata.Tableinfo.DATABASE,null, Database_version);
        Log.d("Database Operations", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb){

        sdb.execSQL(CREATE_QUERY);
        Log.d("DAtabase Operations", "Table Created");
    }
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1,int arg2 ){

    }
}
