package controlefficiency.serval;

import controlefficiency.serval.bond.BondFactory;

public abstract class AbstractServalFactory {
	
	protected ServalReportPrepareData prepData;
	protected ServalReportFilterData filterData;
	protected ServalReportOutputData outputData;

	public static AbstractServalFactory getFactory(ServalReportProductEnum product){
		AbstractServalFactory servalFactory =null;
		switch(product){
			case Bond:
				servalFactory = new BondFactory();
		}
		return servalFactory;
	}

	public ServalReportPrepareData getPrepData() {
		return prepData;
	}

	public ServalReportFilterData getFilterData() {
		return filterData;
	}

	public ServalReportOutputData getOutputData() {
		return outputData;
	}
}
