import scala.util.control.Breaks
import scala.util.control.Breaks._  //이렇게도 사용 가능

object Loop {
  def main(args: Array[String]): Unit = {


    //0~10까지
    for(x<-0 to 10){
      println(x)
    }

    //0부터 9까지 (미만)
    for(x<-0 until 10){
      println(x)
    }

    //2중 for문
    for(x<-0 to 10;y<-0 to 10){
      println(x,y)
    }

    var x = 1

    val loop = new Breaks

    loop.breakable {

    }
    //scala에선 따로 break 제공 안함
    breakable {
      while (true) {
        println(x)


        if (x > 10)
          break
        x += 1
      }
    }

    //인덱스가 있는 for 문

    /*
    for((num, index) <- List.zipWithIndex) {
      println(num, index)
    }
    */

  }
}
