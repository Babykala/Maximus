package com.training.quest5;

public class Customer {

	public static void main(String[] args) {
		IFeaturePhone basicPhone=new BasicMobile();
		basicPhone.call();
		basicPhone.messaging();
		
		basicPhone=new TouchScreeMobile();
		basicPhone.call();
		basicPhone.messaging();
		
		ISmartPhone touchPhone=(TouchScreeMobile)basicPhone;
		touchPhone.cameraTypes();
		touchPhone.showApps();
	}

}
