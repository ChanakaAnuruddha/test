class TestApply {
  def apply() {
    println("inside the apply method")
  }

  def sum(int: Int) = int + 5
}

object Demo {
  def main(args: Array[String]): Unit = {
    import java.io._
    val pw = new PrintWriter(new File("a.txt" ))
    for( a <- 0 to 20000){
      pw.write(a+"\n")
    }

    pw.close

  }
}

