object Clazz {
  def main(args: Array[String]): Unit = {
    val temp1 = CaseClazz("temp1", 10, '5') //new 생략 가능!
    var temp2 = CaseClazz("temp1", 10, '5')
    val temp3 = new normalClazz1("temp3", 30, 'c')
    val temp4 = new normalClazz2("temp4", 30, '4')

    println(temp1, temp2)
    println(temp3.toString) //기본 toString을 override 하지않음
    print(temp1 == temp2)


    println(temp1.temp1, temp1.temp2)
    //println(temp3.temp1) //private  멤버변
    println(temp4.temp12, temp4.temp22)


  }
}

//toString, hashcode, equals 자동 생성. 멤버는 public
case class CaseClazz (temp1: String, temp2: Int, temp3: Char)

//멤버가 private
class normalClazz1 (temp1: String, temp2: Int, temp3: Char)

//멤버가 기본 public
class normalClazz2 (temp1: String, temp2: Int, temp3: Char){
  var temp12 :String = temp1
  var temp22 :Int = temp2
  var temp32 = temp3
}
