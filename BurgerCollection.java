
package BurgerPackage;

    public class BurgerCollection {
                Burger[] burgerArray = new Burger[0];
    public String generateBurgerId(){
        if(burgerArray.length<=0){
            return "O001";
        }
        String LastBurgerId = burgerArray[burgerArray.length-1].getOrderId();
        int lastBurgerId = Integer.parseInt(LastBurgerId.substring(1));
        return String.format("O%03d", lastBurgerId+1);
    }  
    public String getTotal(int OrderQty){
        double total =  (OrderQty*Burger.burgerPrice);
        String Total =  String.format("%.2f", total);
      return Total;
    }
    public boolean addBurger(Burger burger){
        extendBurgerArray();
        burgerArray[burgerArray.length-1]=burger;
        return true;
    }
    public void extendBurgerArray(){
        Burger[] tempBurgerArray = new Burger[burgerArray.length+1];
        for (int i = 0; i < burgerArray.length; i++) {
            tempBurgerArray[i]=burgerArray[i];
        }
        burgerArray=tempBurgerArray;
    }
    public String searchCustomerId(String customerId){
        for (Burger burger : burgerArray) {
            if(burger.getCustomerId().equalsIgnoreCase(customerId)){
                return burger.getCustomerName();
            }
        }
        return null;
    }
    public Burger searchBurger(String order_id){
        for (Burger burger : burgerArray) {
            if(burger.getOrderId().equalsIgnoreCase(order_id)){
                return burger;
            }
        }
        return null;
    }
    public Burger[] searchCustomer(String customerId){
        Burger[] customer = new Burger[0];
        for (Burger burger : burgerArray) {
            if(burger.getCustomerId().equalsIgnoreCase(customerId)){
                Burger[] newArray = new Burger[customer.length+1];
            for (int i = 0; i < customer.length; i++) {
                newArray[i]=customer[i];
            }
            newArray[customer.length]=burger;
            customer=newArray;
        }
        }
            return customer;
    }
    public Burger[] toArray(){
        Burger[] tempBurgerArray = new Burger[burgerArray.length];
        for (int i = 0; i < burgerArray.length; i++) {
            tempBurgerArray[i]=burgerArray[i];
        }
        return tempBurgerArray;
    }
    public Burger[] checkStatus(int statusId){
        Burger[] status = new Burger[0];
        for (Burger burger : burgerArray) {
            if(burger.getOrderStatus()==statusId){
                Burger[] newArray = new Burger[status.length+1];
            for (int i = 0; i < status.length; i++) {
                newArray[i]=status[i];
            }
            newArray[status.length]=burger;
            status=newArray;
        }
        }
            return status;
    }
    public boolean updateBurger(Burger burger){
        int index =indexOf(burger);
        burgerArray[index]=burger;
        return true;
        
    }
    public int indexOf(Burger burger){
        for (int i = 0; i < burgerArray.length; i++) {
            if(burgerArray[i].getOrderId().equalsIgnoreCase(burger.getOrderId())){
                return i;
            }
        }
        return -1;
    }
    
    public boolean search(Burger[] ar,String id){
		for (int i = 0; i <ar.length ; i++){
			if(ar[i].getCustomerId().equalsIgnoreCase(id)){
				return true;
			}
		}
		return false;
		
    }
    public Burger[] findBestCustomer() {
    Burger[] dra = new Burger[0];
    
    for (int i = 0; i < burgerArray.length; i++) {
        if (!search(dra, burgerArray[i].getCustomerId())) {
            Burger[] tempBurgerArray = new Burger[dra.length + 1];
            for (int j = 0; j < dra.length; j++) {
                tempBurgerArray[j] = dra[j];
            }
            Burger newBurger = new Burger(
                burgerArray[i].getCustomerId(),
                burgerArray[i].getCustomerName(),
                0 
            );
            tempBurgerArray[dra.length] = newBurger;
            dra = tempBurgerArray;
        }
    }
    
  
    for (int i = 0; i < dra.length; i++) {
        int totalQuantity = 0;
        for (int j = 0; j < burgerArray.length; j++) {
            if (dra[i].getCustomerId().equalsIgnoreCase(burgerArray[j].getCustomerId())) {
                totalQuantity += burgerArray[j].getOrderQty();
            }
        }
        dra[i].setOrderQty(totalQuantity); 
    }

  
    for (int i = 0; i < dra.length - 1; i++) {
        for (int j = 0; j < dra.length - i - 1; j++) {
            if (dra[j].getOrderQty() < dra[j + 1].getOrderQty()) { 
                Burger tempBurger = dra[j];
                dra[j] = dra[j + 1];
                dra[j + 1] = tempBurger;
            }
        }
    }
     
    return dra;
    }
    
}
