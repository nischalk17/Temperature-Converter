import java.util.Scanner;

public class TemperatureConverter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit and Kelvin");
        System.out.println("2. Fahrenheit to Celsius and Kelvin");
        System.out.println("3. Kelvin to Celsius and Fahrenheit");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                celsiusToFahrenheitAndKelvin();
                break;
            case 2:
                fahrenheitToCelsiusAndKelvin();
                break;
            case 3:
                kelvinToCelsiusAndFahrenheit();
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
    
    public static void celsiusToFahrenheitAndKelvin() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;
        
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        System.out.println("Temperature in Kelvin: " + kelvin);
        
        scanner.close();
    }
    
    public static void fahrenheitToCelsiusAndKelvin() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        double celsius = (fahrenheit - 32) * 5 / 9;
        double kelvin = (fahrenheit + 459.67) * 5 / 9;
        
        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Kelvin: " + kelvin);
        
        scanner.close();
    }
    
    public static void kelvinToCelsiusAndFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Kelvin: ");
        double kelvin = scanner.nextDouble();
        
        double celsius = kelvin - 273.15;
        double fahrenheit = (kelvin * 9 / 5) - 459.67;
        
        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        
        scanner.close();
    }
}

/* 
Normal body temperature: 37C or 98.6F
Boiling Point of water: 373.15K or 100C
Freezing Point of water: 273.15K or 0C
Absolute zero: 0K or -273.15C
Room Temperature as of May9, 2024: 19C
*/
