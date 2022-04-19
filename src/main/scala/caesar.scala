object caesar {

  def decipher(c: Char, n: Int): Char = {
    val charNum = c.toInt + n % 26
    if (charNum > 122) (charNum - 26).toChar
    else charNum.toChar
  }


  def caesar(s: String, n: Int): String = {
    s.toList.foldLeft(List.empty[Char]) { (result, c) =>
      result :+ decipher(c, n)
    }.mkString
  }

}
