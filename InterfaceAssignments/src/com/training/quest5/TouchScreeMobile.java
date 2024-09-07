package com.training.quest5;

public class TouchScreeMobile extends BasicMobile implements ISmartPhone {

	@Override
	public void showApps() {
		System.out.println("Whatsapp,Gmail");
	}

	@Override
	public void cameraTypes() {
		System.out.println("Selfie,rear camera");
	}

}
