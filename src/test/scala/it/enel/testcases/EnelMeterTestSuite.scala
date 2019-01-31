package it.enel.testcases

import it.enel.enelframework.EnelMeter
import org.scalatest.{BeforeAndAfter, FunSuite, Tag}

class EnelMeterTestSuite extends FunSuite with BeforeAndAfter {

  var enelMeter : EnelMeter = _

  /** A before is executed each time before the call of each test case **/
  before {
    enelMeter = new EnelMeter
  }

  test("EnelMeter should run OK and return 'DATA_COMPUTED' ") {
    assert(enelMeter != null)
    assert(enelMeter.enelElucidator(10) === "DATA_COMPUTED")
  }

  test("EnelMeter should run KO and should not return 'DATA_COMPUTED' ") {

    assert(enelMeter != null)
    assert(enelMeter.enelElucidator(20) === "DATA_NOT_COMPUTED")
  }

  /** Use tagging to include and exclude tests **/
  test("EnelMeter should run KO for id 300 and should not return 'DATA_COMPUTED' ", MeterTestsOnly) {

    assert(enelMeter != null)

    assertResult("DATA_NOT_COMPUTED"){
      enelMeter.enelElucidator(300)
    }
  }

  /** A test case is marked pending, when it has to be implemented in future **/
  test("EnelMeter should run OK for all")(pending)


  /** You can mark a test as ignored if you do not want it to be executed
    *
    * This is to temporarily disable the test
    */
  ignore("EnelMeter should run KO for id 1000 ") {
    assert(enelMeter != null)
    assert(enelMeter.enelElucidator(1000) === "DATA_NOT_COMPUTED")

  }

  test("EnelMeter should fail if id is 555") {

    assert(enelMeter != null)

    fail("The id should never be 555")

    /** Cancel a test with a message **/
    cancel("")
    /** An assertion type error is output **/
    //assertTypeError("val a: String = 1")
  }

  test("EnelMeter should throw exception") {

    assertThrows[IndexOutOfBoundsException] {
      enelMeter.enelReckoner()
    }
  }

  /** A after is executed each time after the call of each test case **/
  after{
    enelMeter.enelDataServiceCalls
  }
}

object MeterTestsOnly extends Tag("MeterTest")