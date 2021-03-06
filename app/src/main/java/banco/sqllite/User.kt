package banco.sqllite

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName= "users")
data class User (
    @PrimaryKey var id: Int,
    @ColumnInfo(name ="first_name") val firstName: String?,
    @ColumnInfo(name ="last_name") var lastName: String?
    )

