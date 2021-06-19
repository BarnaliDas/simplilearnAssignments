package com.AccessModifiersPractise;

import com.TypeCastingPractise.*;

public class AccessModifierAssigmentMain extends ProtectedAccessModifier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultAccessModifier dm= new DefaultAccessModifier();
		PrivateAccessModifier prvm= new PrivateAccessModifier();
		ProtectedAccessModifier prom=new ProtectedAccessModifier();
		AccessModifierAssigmentMain amm=new AccessModifierAssigmentMain();
		//calling all public methods
		System.out.println("Calling all Public methods:");
		System.out.println(prvm.FortuneWithluckyNumber());
		System.out.println(prom.WeatherForecasteToday());
		//calling all protected methods
		System.out.println("Calling all Protected methods:");
		System.out.println(amm.WeatherForecast());
		//calling all default methods
		System.out.println("Calling all Default methods:");
		System.out.println(dm.NotifyNumber());
		//calling all private methods
		System.out.println("Calling all Private methods:");
		//prvm.Fortune();
	}

}
