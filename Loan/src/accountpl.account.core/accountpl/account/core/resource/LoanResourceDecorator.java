// @generated from Loan.bpmn2

package accountpl.account.core.resource;

import java.util.*;
import id.ac.ui.cs.prices.winvmj.core.Route;
import id.ac.ui.cs.prices.winvmj.core.VMJExchange;

public abstract class LoanResourceDecorator extends LoanResourceComponent {
	protected LoanResourceComponent record;
	
	public LoanResourceDecorator(LoanResourceComponent record) {
        this.record = record;
    }

    public Map<String, Object> transfer(VMJExchange vmjExchange) {
		return record.transfer(vmjExchange);
	}
}
