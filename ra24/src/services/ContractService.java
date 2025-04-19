package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	private OnlinePaymentService paymentService;
	
	public ContractService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void processContract(Contract c, Integer months) {

		double instAmount = c.getTotalValue() / months;
		for (int count = 1; count <= months; count++) {
			LocalDate instDate = c.getDate().plusMonths(count);
			
			double interest = paymentService.interest(instAmount, count);
			//double fee = paymentService.paymentFee(instAmount + interest);
			 double fee = paymentService.paymentFee(interest);
			//double totalAmount = instAmount + interest + fee;
			 double totalAmount = interest + fee;
			
			c.getListInstallments().add(new Installment(instDate, totalAmount));
		}
		
	}

}
