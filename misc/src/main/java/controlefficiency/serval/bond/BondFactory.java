package controlefficiency.serval.bond;

import controlefficiency.serval.AbstractServalFactory;
import controlefficiency.serval.ServalReportFilterData;
import controlefficiency.serval.ServalReportOutputData;
import controlefficiency.serval.ServalReportPrepareData;

public class BondFactory extends AbstractServalFactory {

	public BondFactory() {
		prepData = this.getPrepareDataBean();
		filterData = getFilterDataBean();
		outputData = getOutputDataBean();
	}

	private ServalReportPrepareData getPrepareDataBean() {
		return new BondServalReportPrepareData();
	}

	private ServalReportFilterData getFilterDataBean() {
		return new BondServalReportFilterData();
	}

	private ServalReportOutputData getOutputDataBean() {
		return new BondServalReportOutputData();
	}
}
