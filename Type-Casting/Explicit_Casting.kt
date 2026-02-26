fun main()
{
    //Q1st - Int to Double
    var v1 = 10;
    var v2 = v1.toDouble()
    println("Integer v1                              : $v1")
    println("After Integer to Double                 : $v2\n")

    //Q2nd - Double to Int
    var v3 = 16.18
    var v4 = v3.toInt()
    println("Double v3                               : $v3")
    println("After Double to Integer                 : $v4\n")

    //Q3rd - Float to Long
    var v5 = 20.22f
    var v6 = v5.toLong()
    println("Float v5                                : $v5")
    println("After Float to Long                     : $v6\n")

    //Q4th - Character to Int
    var v7 = 'A'
    var v8 = v7.toInt()
    println("Character v7                            : $v7")
    println("After Character to Int                  : $v8\n")

    //Q5th - String to Int
    var strNum = "100"
    var num = strNum.toInt()
    println("String Number strNum                    : $strNum")
    println("After strNum to num with addition of 50 : ${num + 50}\n")

    //Q6th - Large to Small (Int to Byte)
    var v9 = 130
    var v10 = v9.toByte()
    println("Integer v9                              : $v9")
    println("After Large to Small (Int to Byte)      : $v10\n")

   /* //Q7th - User Input Conversion String_Number to Double Square
    print("Enter String Number                     : ")
    var strNum2 = readln()
    var v11 = strNum2.toDouble()
    println("String_Number to Double Square          : ${v11 * v11}\n") */

    //Q8th - Add two  Diffrence Type
    var v12 = 10
    var v13 = 20.5
    println("Add Two Number                          : ${v12 + v13}\n")

    //9th Safe String Conversion
    var str = "ABC"
    var v14 = str.toIntOrNull();
    println("After String to Number                  : $v14")

  /*  //Q10th
    print("Enter 1st String Number : ")
    var v15 = readln().toDoubleOrNull()
    print("Enter 2nd String Number : ")
    var v16 = readln().toDoubleOrNull()
    if(v15 != null && v16 != null)
    {
    println("Addition       : ${v15 + v16}")
    println("Substraction   : ${v15 - v16}")
    println("Multiplication : ${v15 * v16}")
    println("Division       : ${v15 / v16}")
    }
    else println("Invalid Input or Null") */

    //Q11th Character to Int
    var ch = '5'
    var strch = ch.toString()
    var sum = strch.toInt() + 10
    println("Character 5 + 10 : $sum\n")

    //Q12th Conversion Chain
    var v17 = 10
    var v18 = v17.toDouble()
    var v19 = v18.toString()
    var v20 = v19.toDouble().toInt()
    println("Original Int     : $v17")
    println("Int to Double    : $v18")
    println("Double to String : $v19")
    println("String to Int    : $v20\n")
} 