package controlefficiency.main;

import controlefficiency.serval.ServalReportProductEnum;
import controlefficiency.serval.ServalReportService;
import controlefficiency.serval.bond.BondServalReportData;

public class Main {

	private ServalReportService service = new ServalReportService();
	
	private void doSOmethhing() throws InstantiationException, IllegalAccessException{
		service.initLists(ServalReportProductEnum.Bond);
		BondServalReportData datalist = (BondServalReportData)service.getInputDataLists();
		datalist.getDataList1().set(0,"asd");
		service.process();
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException{
		Main m = new Main();
		m.doSOmethhing();
	}
}
