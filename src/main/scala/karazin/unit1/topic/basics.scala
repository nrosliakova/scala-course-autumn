package karazin.unit1.topic

// This is an object. Object has many purposes but here we use is as singleton namespace
// We do not use curly braces aka { and } as much as possible
// We do use semicolons and tabs instead
object basics:

  // This is an immutable variable with a type Int and a value 42
  val int: Int = 42

  // This is an immutable variable with a value "Hello world", a type is inferred by compiler
  // Scala is strongly typed and statically typed language: no guesses and implicit type conversions,
  // all types must be known on a compilation phase
  val str = "Hello world"

  // This is a method with no arguments an inferred type.
  // The method returns the value of str value
  def method = str

  // This is a method with one argument of type Int and a result type of String
  // We use camel-case notation for methods
  def typedMethod(v: Int): String =
    val n = v + 1

    // We don't use a return keyword
    // The last line of the code is a return
    n.toString

  // This is an immutable boolean value
  val bool: Boolean = true

  val conditionalResult: Int =
    // Each if-then-else constriction is an expressions an returns some value
    if bool && typedMethod(int) == "42" then 42
    else 0

  val multilineConditionalResult: String =
    if conditionalResult == 42 then
      // It is a very bad idea to test your code with println or log some information
      // If you need to check the code then write a test
      // println is strictly forbidden in a result code for homework
      println("Ups, I'm forbidden, don't forget to remove me")
      // Result of a multiline if-then-else
      str
    else "Hello world"
