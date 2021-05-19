package eCommerce.business.concretes;

import eCommerce.business.abstracts.EMailService;

public class EMailManager implements EMailService {

	@Override
	public void verify() {
		System.out.println("Mail adresi do�rulanm��t�r.");
		
	}

	@Override
	public void send() {
		
		System.out.println("Do�rulama linki g�nderilmi�tir.");
	}

}
