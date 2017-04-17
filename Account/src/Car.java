
public  class Car implements Valuable{
	private String name;
	private double price;
	private int month;
	public Car(String name,double price){
		this.name=name;
		this.price=price;
	}
	
	public double EstimateValue(int month){
		if(this.month==1){
			price=price/(0.8*0.99);
		}
		price=price*0.8;
		for(int i=0;i<month;i++){
			price=price*0.99;
		}
		return price;
	}
	public double EstimateValue(){
		month=1;
		price=price*0.8*0.99;
		return price;
	}
	
	public String toString(){
		return String.format("car name: "+name+"\n initial price"+price+"\n");
	}



	

	
}
