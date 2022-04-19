import caesar.{caesar, decipher}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
class caesarSpec extends AnyFlatSpec with should.Matchers{

  it should "return dailyprogrammer for (\"jgorevxumxgsskx\", 20)" in {
    caesar("jgorevxumxgsskx", 20) shouldBe "dailyprogrammer"
  }

  it should "return \"bcda\" for (\"abcz\", 1))" in {
    caesar("abcz", 1) shouldBe "bcda"
  }

  it should "return m for (q, 22)" in {
    decipher('q', 22) shouldBe 'm'
  }

}
