package PageObjects;

import WinCommands.winCommands;
import org.testng.Assert;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ExpectedResults extends winCommands {
    private void addresults(String Digits1, String Digits2) {
        int actual;
        String id = "CalculatorResults";
        String txtres=this.gettext(id);
        System.out.println(txtres);
        String[] split = txtres.split("is ");
        if(split[1].length()>3)
        {
            String str2 = split[1].replaceAll(",","");
            actual = Integer.valueOf(str2);
        } else {
            actual = Integer.valueOf(split[1]);
            System.out.println("ActualResults "+"is "+actual);
        }
        int num1 = Integer.parseInt(Digits1);
        int num2 = Integer.parseInt(Digits2);
        int expect = num1+num2;
        System.out.println("ExpectedResults " + "is "+ expect);
        Assert.assertEquals(actual, expect);
    }
    private    void subtractresults(String Digits1, String Digits2) {
        int actual;
        String id = "CalculatorResults";
        String txtres=this.gettext(id);
        System.out.println(txtres);
        String[] split = txtres.split("is ");
        if(split[1].length()>3)
        {
            String str2 = split[1].replaceAll(",","");
            actual = Integer.valueOf(str2);
        } else {
            actual = Integer.valueOf(split[1]);
            System.out.println("ActualResults "+"is "+actual);
        }
        int num1 = Integer.parseInt(Digits1);
        int num2 = Integer.parseInt(Digits2);
        int expect = num1-num2;
        System.out.println("ExpectedResults " + "is "+ expect);
        Assert.assertEquals(actual, expect);
    }
    public void multiplyresults(String Digits1, String Digits2) {
        int actual;
        String id = "CalculatorResults";
        String txtres=this.gettext(id);
        System.out.println(txtres);
        String[] split = txtres.split("is ");
        if(split[1].length()>3)
        {
            String str2 = split[1].replaceAll(",","");
            actual = Integer.valueOf(str2);
        } else {
            actual = Integer.valueOf(split[1]);
            System.out.println("ActualResults "+"is "+actual);
        }
        int num1 = Integer.parseInt(Digits1);
        int num2 = Integer.parseInt(Digits2);
        int expect = num1*num2;
        System.out.println("ExpectedResults " + "is "+ expect);
        Assert.assertEquals(actual, expect);
    }
    public   void divisionesults(String Digits1, String Digits2) {
        String id = "CalculatorResults";
        String txtres = this.gettext(id);
        System.out.println(txtres);
        String split = txtres.split(" ")[2].trim();
        System.out.println(split);
        double d3=Double.parseDouble(split);
        System.out.println(d3);
//        DecimalFormat decfor = new DecimalFormat("0.0");
        int num1 = Integer.parseInt(Digits1);
        int num2 = Integer.parseInt(Digits2);
        Double d1 = new Double(num1);
        Double d2 = new Double(num2);
        double expect = d1 / d2;
//        decfor.setRoundingMode(RoundingMode.DOWN);
//        String value = decfor.format(expect);
        System.out.println(expect);
        System.out.println("ExpectedResults " + "is " + expect);
        Assert.assertEquals(d3,expect);
//        Assert.assertTrue(split.contains());
    }
    public   void tempreresults(String Digits1){
        String id="Value2";
        String txtres=this.gettext(id);
        System.out.println(txtres);
        String split = txtres.split(" ")[2].trim();
        System.out.println(split);
        int num1 = Integer.parseInt(Digits1);
        double Fahrenheit =((num1*9)/5)+32;
        double Kelvin = num1 + 273.15;
        System.out.println(Kelvin);
        System.out.println(Fahrenheit);
        String value=String.valueOf(Kelvin);
//        Assert.assertEquals(split,Kelvin);
        Assert.assertTrue(split.contains(value));
    }
    public   void lengthresults(String Digits1){
        String id="Value2";
        String txtres=this.gettext(id);
        System.out.println(txtres);
        String split = txtres.split(" ")[2].trim();
        System.out.println(split);
        DecimalFormat decfor = new DecimalFormat("0.00");
        int num1 = Integer.parseInt(Digits1);
        Double d3=new Double(num1);
        double inches= 0.3937*num1;
        decfor.setRoundingMode(RoundingMode.DOWN);
        String value = decfor.format(inches);
        System.out.println(value);
        Assert.assertTrue(split.contains(value));
    }
public void verification(String Digits1,String Digits2,String operations){
    String functions=operations;
    switch(functions) {
        case "Addition":
            this.addresults(Digits1,Digits2);
            break;
        case "Subtraction":
           this.subtractresults(Digits1,Digits2);
            break;
        case "Multiplication":
           this.multiplyresults(Digits1,Digits2);
            break;
        case "Division":
            this.divisionesults(Digits1,Digits2);
            break;
        default:System.out.println("Inavalid operations");
    }
}
    }

