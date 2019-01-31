package it.enel.testcases

import it.enel.enelframework.EnelMeter
import org.scalatest._

class EnelMeterSpecificationTest extends FlatSpec with Matchers with BeforeAndAfter {

  var enelMeter : EnelMeter = _

  before {
    enelMeter = new EnelMeter
  }

  "EnelMeter" should "run OK and return 'DATA_COMPUTED'" in {

    val enelMeter = new EnelMeter

    assert(enelMeter != null)
    assert(enelMeter.enelElucidator(10) === "DATA_COMPUTED")

  }

  it should "should run KO and should not return 'DATA_COMPUTED'" in {
    assert(enelMeter != null)
    assert(enelMeter.enelElucidator(20) === "DATA_NOT_COMPUTED")
  }
}
