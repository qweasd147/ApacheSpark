object Each {
  def main(args: Array[String]): Unit = {

    //1~10까지
    for(x <- 1 to 10){
      println("for by to " + x)
    }

    //1~9까지 (미만)
    for(x<-1 until 10){
      println("for by util " + x)
    }

    //2중 for문
    for(x<-1 to 10; y<-1 to 10){
      println("x, y", x, y)
    }

    var x :Int = 1;
    while(x < 10){
      println("while " + x)

      x = x+1
    }
  }
}
