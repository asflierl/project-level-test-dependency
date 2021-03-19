package example

import example.SeriousApp._
import example.testing.AdditionalMatchers._
import org.specs2.Specification

class SeriousAppSpec extends Specification { def is = s2"""
  Serious wobbling should be no less than wibbling $e1
"""
  
  def e1 = wobble should wibble
}
