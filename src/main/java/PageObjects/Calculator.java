package PageObjects;

import WinCommands.winCommands;

public class Calculator extends winCommands {

public void value(String Digits){
    String id="num"+Digits+"Button";
    this.ClickAutomationID(id);
}
private void multi(){
    String id="multiplyButton";
    this.ClickAutomationID(id);
}
private void divi(){
    String id="divideButton";
    this.ClickAutomationID(id);
}
public void equals(){
    String id="equalButton";
    this.ClickAutomationID(id);
}
public   void standard(){
        String id="Standard";
        this.ClickAutomationID(id);
    }
public   void navigation(){
    String name="Open Navigation";
    this.clickName(name);
}
private  void curr(){
    String id="Currency";
    this.ClickAutomationID(id);
}
private void temp(){
    String id="Temperature";
    this.ClickAutomationID(id);
}
private  void length(){
    String id="Length";
    this.ClickAutomationID(id);
}
private void centi(){
    String name="Centimeters";
    this.clickName(name);
}
private void inches(){
    String name="Inches";
    this.clickName(name);
}
private void usdoller(){
    String name="United States Dollar";
    this.clickName(name);
}
private void indrupe(){
    String  name="India Rupee";
    this.clickName(name);
}
private void outputunit(){
    String name="Output unit";
    this.clickName(name);
}
private  void inputunit(){
    String name="Input unit";
    this.clickName(name);
}
private void kelvin(){
    String name="Kelvin";
    this.clickName(name);
}
private  void fehrenheit(){
    String name="Fehrenheit";
    this.clickName(name);
}
public void Digit1(String number1)
{
    String n = number1;
    char [] ch = n.toCharArray();
    for(char c : ch)
    {
        String str = Character.toString(c);
        this.value(str);
    }
}
public void Digit2(String number2)
    {
        String n = number2;
        char [] ch = n.toCharArray();
        for(char c : ch)
        {
            String str = Character.toString(c);
            this.value(str);
        }
    }
public void mutliplication(String number1,String number2){
    this.navigation();
    this.standard();
    this.Digit1(number1);
    this.multi();
    this.Digit2(number2);
    this.equals();
}
public void division(String number1,String number2){
    this.navigation();
   this.standard();
    this.Digit1(number1);
    this.divi();
    this.Digit2(number2);
    this.equals();
}
public void tempreature(String number1){
    this.navigation();
    this.temp();
    this.Digit1(number1);
    this.outputunit();
    this.kelvin();
}
public  void Length(String number1){
    this.navigation();
    this.length();
    this.inputunit();
    this.centi();
    this.Digit1(number1);
    this.outputunit();
    this.inches();
}
public void Currency(String number1){
    this.navigation();
    this.curr();
    this.inputunit();
    this.delayScript(2);
    this.usdoller();
    this.Digit1(number1);
    this.outputunit();
    this.delayScript(2);
    this.indrupe();
}

}
