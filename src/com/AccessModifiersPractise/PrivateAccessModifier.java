package com.AccessModifiersPractise;

public class PrivateAccessModifier {
 private String Fortune() {
	 String everdayFortune="This is your lucky Day!";
	 return everdayFortune;
 }
 
 public String FortuneWithluckyNumber()
 {
	 DefaultAccessModifier dm =new DefaultAccessModifier();
	 String luckyfortune= Fortune()+" and your lucky number is :"+dm.NotifyNumber();
	 return luckyfortune;
	 
 }
}
