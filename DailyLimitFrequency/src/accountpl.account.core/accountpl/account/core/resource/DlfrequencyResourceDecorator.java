// @generated from Dlfrequency.bpmn2

package accountpl.account.core.resource;

import java.util.*;
import id.ac.ui.cs.prices.winvmj.core.Route;
import id.ac.ui.cs.prices.winvmj.core.VMJExchange;

public abstract class DlfrequencyResourceDecorator extends DlfrequencyResourceComponent {
	protected DlfrequencyResourceComponent record;
	
	public DlfrequencyResourceDecorator(DlfrequencyResourceComponent record) {
        this.record = record;
    }

    public Map<String, Object> transfer(VMJExchange vmjExchange) {
		return record.transfer(vmjExchange);
	}
}
