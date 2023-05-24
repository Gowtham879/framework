package PageObjects;

import WinCommands.winCommands;

public class ArthematicOperations extends winCommands {
    Calculator calsi = new Calculator();
    public void operators(String operation, String number1, String number2) {
        String functions=operation;
        switch(functions) {
        case "Addition":
            driver.findElementByName("Plus").click();
            break;
        case "Subtraction":
            driver.findElementByName("Minus").click();
            break;
        case "Multiplication":
            driver.findElementByName("Multiply by").click();
            break;
        case "Division":
            driver.findElementByName("Divide by").click();
            break;
        default:System.out.println("Inavalid operations");
    }
    }
    public void arthematicOperation(String number1, String number2, String operation){
        calsi.Digit1(number1);
        this.operators(operation, number1, number2);
        calsi.Digit2(number2);
        calsi.equals();
    }
    public void decimalNumbers(String decimal)
    {
        System.out.println(decimal);
        String[] a = decimal.split("[.]", 0);
        System.out.println(a.length);
        String beforedot = a[0];
        System.out.println(beforedot);
        calsi.value(beforedot);
        String seperator = "Decimal separator";
        this.clickName(seperator);
        String afterdot = a[1];
        System.out.println(afterdot);
        calsi.value(afterdot);
    }
    public void DecimalArithmeticOperation(String number1,String number2,String operation)
    {
        this.decimalNumbers(number1);
        this.operators(operation, number1, number2);
        this.decimalNumbers(number2);
        calsi.equals();
    }
}
