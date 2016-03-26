import android.provider.BaseColumns;

/**
 * Created by willyreyes on 3/26/16.
 */
public class Tabledata {
    public Tabledata(){

    }
    public static abstract class Tableinfo implements BaseColumns
    {
        public static final String USER_NAME="user_name";
        public static final String USER_PASS="password";
        public static final String DATABASE="user_info";
        public static final String TABLE_NAME="reg_info";
    }
}
