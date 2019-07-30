object Extend {
  def main(args: Array[String]): Unit = {

    val grantUser = new UserWithGrant("firstName1", "lastName2", 20, "full");

    grantUser.displayGrant
    println(grantUser.fullName)
  }
}

class User(firstName: String, lastName: String, age: Int){
  def fullName: String = firstName + lastName
}

class UserWithGrant(firstName: String, lastName: String, age: Int, grant: String)
  extends User(firstName, lastName, age){

  def displayGrant = () -> {println(grant)}
}