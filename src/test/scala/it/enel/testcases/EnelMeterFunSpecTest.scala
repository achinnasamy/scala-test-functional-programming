package it.enel.testcases

import it.enel.enelframework.EnelMeter
import org.scalatest._

class EnelMeterFunSpecTest extends FunSpec with Matchers with BeforeAndAfter {

  var enelMeter : EnelMeter = _

  before {
    enelMeter = new EnelMeter
  }

  describe("EnelMeter should run OK") {

    it("should return 'DATA_COMPUTED'") {
      assert(enelMeter != null)
      assert(enelMeter.enelElucidator(10) === "DATA_COMPUTED")
    }

  }

  describe("EnelMeter should run KO") {

    it ("should not return 'DATA_COMPUTED'") {
      assert(enelMeter != null)
      assert(enelMeter.enelElucidator(20) === "DATA_NOT_COMPUTED")
    }
  }

  describe("EnelMeter should run OK") {

    it("TODO") (pending)

  }

}
