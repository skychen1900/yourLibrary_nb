package sample.test;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class NormalListener implements ActionListener {

	@Override
	public void processAction(ActionEvent event) throws AbortProcessingException {
		String buttonId = event.getComponent().getClientId();
		System.out.println(buttonId);
	}

}
