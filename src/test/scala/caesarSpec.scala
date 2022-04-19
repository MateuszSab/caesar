import caesar.caesar
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
class caesarSpec extends AnyFlatSpec with should.Matchers{

  it should "return dailyprogrammer for (\"jgorevxumxgsskx\", 20)" in {
    caesar("jgorevxumxgsskx", 20) shouldBe "dailyprogrammer"
  }

}
