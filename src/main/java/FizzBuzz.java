public class FizzBuzz {
  public String fizzBuzzString(String str) {

      // if (str.startsWith("f"))  return "Fizz";
      // if (str.endsWith("b")) return "Buzz";

      if (str.isEmpty()) {
          return null;
      }

      if (str.startsWith("f") && str.endsWith("b")) {
          return "FizzBuzz";
      } else if (str.startsWith("f")) {
          return "Fizz";
      } else if (str.endsWith("b")) {
          return "Buzz";
      }
      return str;
  }

}