// @generated from LoanSelling.bpmn2

package accountpl.account.core.resource;

import java.util.*;
import id.ac.ui.cs.prices.winvmj.core.Route;
import id.ac.ui.cs.prices.winvmj.core.VMJExchange;

public abstract class LoanSellingResourceDecorator extends LoanSellingResourceComponent {
	protected LoanSellingResourceComponent record;
	
	public LoanSellingResourceDecorator(LoanSellingResourceComponent record) {
        this.record = record;
    }

    public Map<String, Object> transfer(VMJExchange vmjExchange) {
		return record.transfer(vmjExchange);
	}
}
