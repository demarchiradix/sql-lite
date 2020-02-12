package banco.sqllite

import androidx.room.*

@Dao
interface UserDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUsers(vararg users: User)

    @Insert
    fun insertBothUsers(user1: User, user2: User)

    @Insert
    fun insertUsersAndFriends(user: User, friends: List<User>)

    @Update
    fun updateUsers(vararg users: User)

    @Delete
    fun deleteUsers(vararg users: User)

    @Query("Select * from Users")
    fun loadAllUsers(): Array<User>

  // @Query("SELECT * FROM users where age > : minAge")
  //  fun loadAllUsersOlderThan(minAge: Int): Array<User>


}