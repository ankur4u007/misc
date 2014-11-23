package controlefficiency.serval;

public class ServalReportService {
	
	private Object inputDataLists;
	private ServalReportProductEnum product;
	private AbstractServalFactory abstractServalFactory;
	
	public void initLists(ServalReportProductEnum product) throws InstantiationException, IllegalAccessException{
		this.product = product;
		inputDataLists = product.getInputDataLists().newInstance();
	}
	
	public void process(){
		abstractServalFactory = AbstractServalFactory.getFactory(product);
		abstractServalFactory.getPrepData().prepareData();
		abstractServalFactory.getFilterData().filterData();
	}

	public Object getInputDataLists() {
		return inputDataLists;
	}

	public ServalReportProductEnum getProduct() {
		return product;
	}
	

}
