package banco.sqllite

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.security.AccessControlContext

@Database(entities = arrayOf(User::class), version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun userDao(): UserDao

    val db = Room.databaseBuilder(
        applicationContext,
        AppDatabase::class.java, "database-name"
    ).build()

    companion object {
        private var instance: AppDatabase? = null
        fun getInstance(context: Context): AppDatabase {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java, "base.db"
                )
                    .allowMainThreadQueries()
                    .build()
            }
            return instance as AppDatabase
        }
        fun destroyInstance(){}
    }


}
