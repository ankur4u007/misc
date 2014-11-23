package controlefficiency.serval;

import controlefficiency.serval.bond.BondServalReportData;

public enum ServalReportProductEnum {
	
	Bond {
		@Override
		public Class getInputDataLists() {
			return BondServalReportData.class;
		}
	};
	
	public abstract Class getInputDataLists();
}
