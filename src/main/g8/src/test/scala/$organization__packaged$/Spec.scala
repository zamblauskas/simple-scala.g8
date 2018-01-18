package $organization$

import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.{FunSpec, Matchers}

class Spec extends FunSpec with Matchers with TypeCheckedTripleEquals {

  describe("Spec") {
    it("should do something") {
      1 should === (1)
    }
  }

}
