//                              Data Types
fun main(){
    var name: String = "Muhammad Allah Rakha Raza"
    println("$name")
    
    var name_1: String = "Muhammad Allah Rakha Naich"
    println("The name is $name_1")

    var num_1: Byte = 64
    println("The Byte is $num_1")
    //Output: The Byte is 64

    var num_2: Short = -12345
    println("The Short is $num_2")

    var num_3: Int = 12345
    println("The Integer is $num_3")

    var num_4: Long = 9999 // Here long is 4_bits
    println("The Long is $num_4")

    var num_5: Double = 444.556677
    println("The Double is $num_5")

    var num_6: Float = 345.6789F // Here Float (F) is must mention.
    println("The Float is $num_6")

}

fun main(){
    var name: String

    name = "AAAA STARK"
    println("The Name is $name")

    name = "John Don"
    println("The Name is $name")
    
    var name_1: Char

    name_1 = 'A'
    println("The Charactor is $name_1")

    name_1 = 'B'
    println("The Charactor is $name_1")

    var flages: Boolean

    flages = true
    println("The Boolean is $flages")

    flages = false
    println("The Boolean is $flages")
}

//--------------------------------------------------------------------------------------------------//

//                                       Operators
fun main(){
    // Arithmatic Operators

    val num_1: Int = 44
    val num_2: Int = 55

    var num_3: Int

    num_3 = num_1 + num_2
    println("The Addition is $num_3")

    num_3 = num_1 - num_2
    println("The Subtraction is $num_3")

    num_3 = num_1 * num_2
    println("The Multiplication is $num_3")

    num_3 = num_2 / num_1
    println("The Division is $num_3")

    num_3 = num_2 % num_1
    println("The Modulus is $num_3")

    // Concatenation of Strings
    val name_1: String = "Muhammad "
    val name_2: String = "Allah "
    val name_3: String = "Rakha"
    var name: String

    name = name_1 + name_2 + name_3
    println("The Name is $name")
}

fun main(){
    // Assignment Operators

    var num_1: Int = 44
    var num_2: Int = 55
    
    num_1 += num_2
    println("The (a+=b) OR (a=a+b) is $num_1")

    num_2 -= num_1
    println("The (a-=b) OR (a=a-b) is $num_2")

    num_1 *= num_2
    println("The (a*=b) OR (a=a*b) is $num_1")

    num_2 /= num_1
    println("The (a/=b) OR (a=a/b) is $num_2")

    num_2 %= num_2
    println("The (a%=b) OR (a=a%b) is $num_2")

}

fun main(){
    // Unary prefix and Increment or Decrement Operators

    var num_1: Int = 44
    var num_2: Int = -44
    var bool: Boolean = true

    var number: Int
    var flages: Boolean

    number = -num_1
    println("The Unary Plus is $number")

    number = +num_2
    println("The Unary Minus is $number")

    flages = !bool
    println("The Not Operator is $flages")

    ++num_1
    println("The PreFix increment is $num_1")

    num_1++
    println("The PostFix increment is $num_1")

    --num_1
    println("The PreFix decrement is $num_1")

    num_1--
    println("The PostFix decrement is $num_1")
    
}


fun main(){
    // Comparison and Equality Operators

    var num_1: Int = 44
    var num_2: Int = 33

    if(num_1 > num_2){
        println("The $num_1 is greater than $num_2")
    }else{
        println("The $num_1 is not greater than $num_2")
    }

    if(num_1 < num_2){
        println("The $num_1 is less than $num_2")
    }else{
        println("The $num_1 is not less than $num_2")
    }

    if(num_1 >= num_2){
        println("The $num_1 is greater OR equal than $num_2")
    }else{
        println("The $num_1 is not greater OR equal than $num_2")
    }

    if(num_1 <= num_2){
        println("The $num_1 is less OR equal than $num_2")
    }else{
        println("The $num_1 is not less OR equal than $num_2")
    }

    if(num_1 == num_2){
        println("The $num_1 is equalent (equality) than $num_2")
    }else{
        println("The $num_1 is not equalent (equality) than $num_2")
    }

    if(num_1 != num_2){
        println("The $num_1 is not equal than $num_2")
    }else{
        println("The $num_1 is equal than $num_2")
    }
}

fun main(){
    // Logical Operators

    var num_1: Int = 44
    var num_2: Int = 33

    if( (num_1 > num_2) || (num_1 < num_2) ){
        println("The $num_1 is greater than $num_2")
        println("The $num_1 is less than $num_2")
    }else{
        println("The $num_1 is not greater than $num_2")
        println("The $num_1 is not less than $num_2")
    }

    if( (num_1 > num_2) || (num_1 != num_2) ){
        println("The $num_1 is greater than $num_2")
        println("The $num_1 is not equal than $num_2")
    }else{
        println("The $num_1 is not greater than $num_2")
        println("The $num_1 is equal than $num_2")
    }

}

fun main(){
    // IN Operators
    var numbers = intArrayOf(1,2,3,4,5)

    if (3 in numbers){
        println("The 3 is contain of this numbers array.")
    }else{
        println("The 3 is doe's not contain of this numbers array.")
    }

    if (6 !in numbers){
        println("The 6 is doe's not contain of this numbers array.")
    }else{
        println("The 6 is contain of this numbers array.")
    }

}

fun main(){
    // Index access Operators
    var numbers = intArrayOf(1,2,3,4,5)

    println(numbers[0])

    println(numbers[1])

    numbers[0] = 11

    numbers[1] = 22

    println(numbers[0])

    println(numbers[1])
}

fun main(){
    // Index access Operators
    val num_1: Int = 10
    val num_2: Int = 20

    var num_3: Int

    num_3 = num_1 or num_2
    println("The Bitwise (or) Operator is $num_3")

    num_3 = num_1 and num_2
    println("The Bitwise (and) Operator is $num_3")

    num_3 = num_1 xor num_2
    println("The Bitwise (xor) Operator is $num_3")

    num_3 = num_1.inv()
    println("The Bitwise (inversion) Operator is $num_3")

    num_3 = num_1 shl 1
    println("The Bitwise (shl) Shift Logical Left Operator is $num_3")

    num_3 = num_1 shr 2
    println("The Bitwise (shr) Shift Logical Right Operator is $num_3")

    num_3 = num_1 ushr 2
    println("The Bitwise (ushr) Unsigned Shift Logical Right Operator is $num_3")
}

//                              Type Conversion
fun main(){
    // Index access Operators
    val num_1: Int = 104567
    val num_2: Byte = num_1.toByte()
    println("The value of num_1 is $num_1")
    println("The value of byte num_1 is $num_2")


    var name_1: String = "Muhammad Allah Rakha"
    var name_2: Int = name_1.toInt()
    println("The name is $name_1")
    println("The name convert into integer is $name_2")

}

//                              Expression Statements and Blocks, Comments, Input, Output
import java.util.Scanner
fun main(){
    // Expression
    val num_1: Int = 11
    val num_2: Int = 22

    var maximum: Int

    maximum = if(num_1 > num_2) num_1 else num_2
    println("The maximum number is $maximum")
    
    // Statements

    println("Don John ") // This type is called Statement

    // Blocks

    if(num_1 > num_2){
        println("The $num_1 is greater than $num_2")
    }else{
        println("The $num_1 is not greater than $num_2")
    }

    // Comments
    
    //
    /* */

    // Outputs
    println("The name is Muhammad Allah Rakha")
    print("The name is AAAA STARK\n")

    // Inputs

    print("Enter your name :")
    var name: String = readLine()!!
    println("The name is $name")

    var numberread = Scanner(System.`in`)

    print("The enter your number : ")
    var number: Int = numberread.nextInt()

    println("The number is $number")

}


//                 Flow Control             
fun main(){
    // IF and IF_ELSE Statements
    var num_1: Int = 4455
    var num_2: Int = 6663

    if(num_1 > num_2){
        println("The $num_1 is greater than $num_2")
    }else if(num_2 < num_1){
        println("The $num_2 is less than $num_1")
    }else{
        println("The Confuse now.")
    }

    var num = if(num_1 > num_2){
        println("The $num_1 is greater than $num_2")
        println("The return type is $num_1")
        num_1
    }else if(num_2 < num_1){
        println("The $num_2 is less than $num_1")
        println("The return type is $num_2")
        num_2
    }else{
        println("The Confuse now.")
        println("The return type is One : ")
        1
    }

    println("\nThe number is $num")
}

fun main(){
    // When Expression
    var num_1: Int = 4455
    var num_2: Int = 6663

    println("Enter the operator type *,/,+,-,% ")
    var ope = readLine()

    val result = when(ope){
        "*" -> num_1*num_2
        "/" -> num_1/num_2
        "+" -> num_1+num_2
        "-" -> num_1-num_2
        "%" -> num_1%num_2
        else -> "$ope operator is doe's not here."
    }

    println("the result is $result")

    when(num_1){
        in 1..5555 -> println("The number_1 is exsist $num_1")
        in 5555..10000 -> println("The number_2 is exsist $num_2")
    }

    when(ope){
        "*" -> println("num_1*num_2 = ${num_1 + num_2}")
        "/" -> println("num_1/num_2 = ${num_1 + num_2}")
        "+" -> println("num_1+num_2 = ${num_1 + num_2}")
        "-" -> println("num_1-num_2 = ${num_1 + num_2}")
        "%" -> println("num_1%num_2 = ${num_1 + num_2}")
        else -> println("$ope operator is doe's not here.")
    }
}
fun main(){
    // While Loop Expression
    var num_1: Int = 1

    while(num_1 <= 10){
        println("Line is $num_1")
        num_1++
    }

    // While Loop Expression
    var name: String
    do{
        println("Enter your name")
        name = readLine()!!
        println("The name is $name")
    }while(name != "0")

    // For Loop Expression
    for(num in 1..10){
        println("The number is $num")
    }
    // For Loop Expression
    var name_array = arrayOf("Ruby","Ruest","Python","Julia","R")
    for(language in name_array){
        println(language)
    }

    // For Loop Expression Break
    var name_arrays = arrayOf("Ruby","Ruest","Python","Julia","R")
    for(language in name_arrays){
        if(language == "Julia") break
        println(language)
    }

    // For Loop Expression Continue
    var name_arrayes = arrayOf("Ruby","Ruest","Python","Julia","R")
    for(language in name_arrayes){
        if(language == "Julia") continue
        println(language)
    }
}

//                 Functions        
fun don(){
    println("I'm the Don")
}
fun rakha(n1: Double , n2: Double): Int {
    var sum = n1 + n2
    var converter = sum.toInt()
    return converter
}
//                  INFIX Functions
class Structure(){
    infix fun create(rows: Int){
        var k = 0
        for(i in 1..rows){
            for(space in 1..rows-1){
                print(" ")
            }
            while(k != 2*i-1){
                print("* ")
                ++k
            }
            println()
        }
    }
}
//                  Default and Named Arguments
fun hassan(num: Int, name: Char = 'a'){
    println("The number is $num and charactor is $name")
}
fun main(){
    don()
    var num_1: Double = 3.4567
    var num_2: Double = 445.677
    var return_type: Int = rakha(num_1, num_2)
    println("The number is $return_type")

    var infex_function = Structure()
    infex_function.create(4)

    hassan(4)

    hassan(6,'b')
}


//                      Kotlin Class and Objects
class Lamp{
    private var name: Boolean = false

    fun turnOn(){
        name = true
        println("$name is true")

    }

    fun turnOff(){
        name = false
        println("$name is false")
    }

    fun display(names: String){
        if(names == "Don"){
            println("$names is Don")
        }else{
            println("$names is not Don")
        }
    }
}
fun main(){
    var l1 = Lamp()
    l1.turnOn()
    l1.turnOff()

    l1.display("Don")
}

//                               Kotin Constructors
//  	                Way 1
class Person(var name1: String, var num: Int){

}
fun main(){
    var person = Person("Don",22)
    println("Name is ${person.name1}")
    println("Phone is ${person.num}")
}

//  	                Way 2
class Person(name: String,num: Int){
    var names: String
    var nums: Int

    // initializer blocks
    init{
        names = name
        nums = num
        println("The name is $names")
        println("The num is $nums")
    }   
}

class Person_1(name: String, num: Long){
    val names = name
    val nums = num

    var n: String = names
    var nn: Long = num

    init{
        println("The name is $names")
        println("The number is $nums")
        println("The name is $n")
        println("The number is $nn")
    }
}

fun main(){
    Person("Don John",636)
    Person_1("MAR",36)
}

//          Way 3
open class Log{
    var _data: String = ""
    var _numberOfData = 0
    // constructor(ds: String){

    // }
    constructor(ds: String, _numberOfData1: Int){
        _data = ds
        _numberOfData = _numberOfData1
        println("$_data : $_numberOfData times")
    }

}
class AuthoLog: Log{
    constructor(ds: String): this("From AuthoLog ->" + ds, 15){

    }
    constructor(ds: String, _numberOfData1: Int): super(ds,_numberOfData1){

    }
}

fun main(){
    AuthoLog("Bad Password")
}


//                           Kotlin Getters and Setters
class Girl{
    var age: Int = 0
    get() = field
    set(value) {
        field = if(value < 18){
            18
        }else{
            value-3 
        }
    }
    var actualAge: Int = 0
}

fun main(){
    var maria = Girl()
    maria.actualAge = 15
    maria.age = 15
    println("Maria : actual age = ${maria.actualAge}")
    println("Maria : pretended age = ${maria.age}")
}


//                           Kotlin Inheritance

open class Person(name: String,age: Int){
    init{
        println("My name is $name")
        println("My age is $age")
    }
}
class Person_1(name1: String,age1: Int): Person(name1,age1){
    fun don1(){
        println("Don John Rakha")
    }
}
class Person_2(name2: String, age2: Int): Person(name2,age2){
    fun don2(){
        println("Don John Hassan")
    }
}

fun main(){
    var d1 = Person_1("Muhammad Allah Rakha",20)
    d1.don1()

    var d2 = Person_2("MAR",21)
    d2.don2()

}


open class Person(){
    open var ages: Int = 0

    get() = field
    set(value){
        field = value
    }
    open fun display(age: Int){
        println("My age is $age")
    }
}

class Girl: Person(){
    override var ages: Int = 0

    get() = field
    set(value){
        field = value + 55
    }
    override fun display(age: Int){
        println("My fake age is $age")
    }
}

fun main(){
    var girl = Girl()
    girl.display(22)

    girl.ages = 33
    println("The age is ${girl.ages}")
}


open class Person(){
    open fun display_age(age: Int){
        println("The actual age is $age")
    }
}
class Gender: Person(){
    override fun display_age(age: Int){
        // Call the Inheritance function of (open fun display_age)

        super.display_age(age)

        // Call here difined function
        println("The fake age is ${age-5}")
    }
}
fun main(){
    var gender = Gender()
    gender.display_age(20)
}


//                      Kotlin Visibility and Modifiers
open class Person(){
    var n1 = 11
    private var n2 = 22
    public var n3 = 33
    internal var n4 = 44
    init{
        println("The Person class n1 (var) is $n1")
        println("The Person class n2 (private var) is $n2")
        println("The Person class n3 (public var) is $n3")
        println("The Person class n4 (internal var) is $n4")
    }
}
class Gender: Person(){
    init{
        println("The Gender class n1 (var) is $n1")
        println("The Gender class n3 (public var) is $n3")
        println("The Gender class n4 (internal var) is $n4")
    }
}
fun main(){
    var g = Gender()
    println("The Main body n4 (internal var) is ${g.n4}")
}


//                      Kotlin Abstruct Class
abstract class Person(name: String){
    init{
        println("The name is $name")
    }
    // println("The name is $name")   // ERROR SHOW

    fun displaySSN(ssn: Int){
        println("My SSM is $ssn")
    }
    abstract fun displayJob(desc: String)
}

class Teacher(name: String): Person(name){
    override fun displayJob(desc: String){
        println("The disciption is $desc")
    }
}

fun main(){
    var don = Teacher("MAR")
    don.displayJob("Hhore")
    don.displaySSN(235)

}


//                          Kotlin Interface
interface Myname{
    var n1: Int
    fun don(): String
    fun john(){
        println("Don John")
    }
}
class DonJohn: Myname{
    override var n1: Int = 44
    override fun don(): String = "MAR"
    init{
        super.john()
        println("My age is $n1")
        println("Name is ${don()}")
    }
}
fun main(){
    DonJohn()
}

interface A{
    fun callA(){
        println("Hello Don")
    }
}
interface B{
    fun callB(){
        println("Hello John")
    }
}

class Gender: A,B{
    init{
        println("Accesss Work now")
    }
}
fun main(){
    var gender = Gender()
    gender.callA()
    gender.callB()
}


//                          Kotlin Nested and Inner Class
class Don{
    var n1: String = "AAAA STARK"
    init{
        println("Auto Access Class Don")
    }
    fun Name(){
            println("The name is $n1")
        }
    class John {
        var n2: Int = 21
        init{
            println("Auto Access Class John")
        }
        fun Age(){
            println("The age is $n2")
        }
    }
}
fun main(){
    var don = Don()
    don.Name()

    var don_john = Don.John()
    don_john.Age()
}


//                          Kotlin Data Class
data class Person(var name:String, var age:Int)

fun main(){
    var person = Person("MAR",44)
    println("name is ${person.name}")
    println("age is ${person.age}")

}


data class Person(var name:String, var age:Int)

fun main(){
    var person = Person("MAR",44)
    println("name is ${person.name}")
    println("age is ${person.age}")

    // Copy Method
    var person_copy = person.copy(name = "AAAA STARK")
    println("name is ${person_copy.name}")
    println("age is ${person_copy.age}")

    // ToString Method
    println(person.toString())

    // Equals Method
    var same = person.copy()
    var nevers_same = person.copy(name = "Not MAR")

    if(person.equals(same)==true){
        println("The person \n ${person.toString()}")
        println("The same \n ${same.toString()}")
    }else{
        println("The not person \n ${person.toString()}")
        println("The not same \n ${same.toString()}")
    }

    if(person.equals(nevers_same)==true){
        println("The person \n ${person.toString()}")
        println("The same \n ${nevers_same.toString()}")
    }else{
        println("The not person \n ${person.toString()}")
        println("The not same \n ${nevers_same.toString()}")
    }
}


//                          Kotlin Object Declaration and Expressions
object Test{
    private var n1: Int = 1
    var n2: Int = 2
    fun don(): Int {
        n1 = 21
        return n1
    }
}

fun main(){
    var result: Int
    result = Test.don()
    println("The n2 is ${Test.n2}")
    println("The don() is ${result}")
}


//                          Kotlin Companion Objects
class Person{
    fun Don() = println("AAAA STARK")
}
class Gender{
    companion object{
        fun John() = println("MAR")
    }
}
fun main(){
    // Without Companion Object
    var d = Person()
    d.Don()

    // With Companion Object
    Gender.John()
}


//                          Kotlin Extension Function
fun String.removeFirstLastChar(): String = this.substring(1,this.length - 1)
fun main(){
    var name: String = "AAA STAR"
    var result = name.removeFirstLastChar()
    println("First and Last Charactor is remove ${result}")
}
