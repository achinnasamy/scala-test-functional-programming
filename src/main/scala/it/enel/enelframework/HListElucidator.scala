package it.enel.enelframework

object HListElucidator {

  def main(args : Array[String]) = {

    // This would be List[Any]
    val scalaList = 674563742230L :: "UID" :: true :: Nil

    // In HList the type information is preserved in the List
    import shapeless._
    val hList = 674563742230L :: "UID" :: true ::  HNil

    val secondElement = hList(1)

    println(secondElement)

  }
}
