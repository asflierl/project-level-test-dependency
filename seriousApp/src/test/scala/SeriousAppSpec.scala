package example

import example.testing.TestHelpers._
import org.specs2.Specification

class SeriousAppSpec extends Specification { def is = s2"""
  Wobble should wibble $e1
"""
  
  def e1 = new SeriousApp().wobble should wibble
}
