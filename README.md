# java-temperature-converter
A Temperature Converter in java

## calculations

it gets user input and does the equation to converter it to the other temperature system.

```java
  public static void ConvertToF() {
    System.out.print("Enter °C: ");
    String cTemp = input.nextLine();
    
    int fTemp = Integer.parseInt(cTemp) / 5 * 9 + 32;
    System.out.println("°F: " + fTemp);
  }
  
  // same thing with ConvertToC but a slight change in the equation
  // instead the equation is this
  
  int cTemp = (Integer.parseInt(fTemp) - 32) * 5 / 9;
  
  
  // main asks the user if they want to convert from C to F or the other way around. Then using switch statements, runs the function.
  public static void main(String[] args) {
    System.out.print("°C to °F or °F to °C (1 or 2): ");
    String corf = input.nextLine();
    
    switch (corf) {
      case "1":
        ConvertToF();
        break;
        
      case "2":
        ConvertToC();
        break;
        
      default:
        System.out.println("That is not an option");
    }
  }
```
