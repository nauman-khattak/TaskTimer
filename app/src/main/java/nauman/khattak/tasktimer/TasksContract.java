package nauman.khattak.tasktimer;

import android.provider.BaseColumns;

public class TasksContract {

    static final String TABLE_NAME = "Tasks";

    public static class Columns{
        //Tasks fields
        public static final String _ID = BaseColumns._ID;
        public static final String TASKS_NAME = "Name";
        public static final String TASKS_DESCRIPTION = "Description";
        public static final String TASKS_SORTORDER = "SortOrder";

        private Columns(){
            //private constructor to prevent instantiation
        }
    }
}
