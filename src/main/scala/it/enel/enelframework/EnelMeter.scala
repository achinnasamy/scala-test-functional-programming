package it.enel.enelframework

class EnelMeter {


  def enelElucidator(id : Int): String = {

    if (id==10) "DATA_COMPUTED" else "DATA_NOT_COMPUTED"

  }

  def enelDataServiceCalls() = {

  }

  def enelReckoner() = {
    val enel = "ENEL"
    enel.charAt(-1)
  }
}
