package exp1

import java.io.IOException
import java.net.{MalformedURLException, URL}
import javax.imageio.ImageIO

//import scala.sys.process.processInternal.IOException

/**
  * Created by jingyang on 1/25/17.
  */
class scalaexp {

  def process(u: URL) {
    val img = ImageIO.read(u)
   // JOptionPane.showMessageDialog(null, null, null, 0, new ImageIcon(img))
  }


}
case class CustomException(smth:String)  extends Exception(smth)
object Main200 extends App {

  val url="hehe";
  val instance = new scalaexp();

  try {
    instance.process(new URL("fred://horstmann.com/cay-tiny.gif"))
  } catch {
    case _: MalformedURLException => println("Bad URL   111: " + url)
    case ex: IOException => ex.printStackTrace()
  }

  try {
  //  instance.process(new URL("http://horstmann.com/cay-tiny.gif"))
   // instance.process(new URL("http://horstmann.com/fred.gif"))
  } catch {
    case _: MalformedURLException => println("Bad URL   000: " + url)
    case ex: IOException => {
      println("case ex: IOException " )
      ex.printStackTrace()
    }
    case ex2: Exception => {
      println("case ex2: Exception " )
      ex2.printStackTrace()
    }
  }
//q:IOException Exception same time of 1 of 2
  //instance.process(new URL("http://horstmann.com/fred.gif"))//without try
  println("HHHHHHHHHHHHH");

  try{
    val stateCapitals = Map(
      "Alabama" -> "Montgomery",
      "Alaska" -> "Juneau",
      "Wyoming" -> "Cheyenne")

    println("Alabama: " + stateCapitals.get("AlabamaA").get)
  }
  catch{
    case x:Exception => {
      //throw new CustomException("whatever")
    }
  }

  try{
    val stateCapitals = Map(
      "Alabama" -> "Montgomery",
      "Alaska" -> "Juneau",
      "Wyoming" -> "Cheyenne")

    println("Alabama: " + stateCapitals.get("AlabamaA").get)
  }
  catch{
    //case x:Exception => throw new CustomException("whatever!!!!!!!")
    case ex2: Exception => {
      throw new CustomException("whatever")
      println("case ex2: Exception    not throw" )
      ex2.printStackTrace()
    }
  }


  println("running  !!!!!!!!!!!!!!!!!!!!!!  ")

}
