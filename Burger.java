/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BurgerPackage;

/**
 *
 * @author USER
 */
public class Burger {
    public static final double burgerPrice= 500;
     
    public static final int PREPARING=0; 
    public static final int DELIVERED=1; 
    public static final int CANCEL=2; 
    
    private String OrderId;
    private String customerId;
    private String CustomerName;
    private int orderQty;
    private int orderStatus;

    public Burger() {
    }
    public Burger(String customerId,String customerName,int orderQty ) {
        this.customerId=customerId;
        this.CustomerName=customerName;
        this.orderQty=orderQty;
    }

    public Burger(String OrderId, String customerId, String CustomerName, int orderQty) {
        this.OrderId = OrderId;
        this.customerId = customerId;
        this.CustomerName = CustomerName;
        this.orderQty = orderQty;
        this.orderStatus = PREPARING;
    }
    public Burger(String OrderId, String customerId, String CustomerName, int orderQty, int orderStatus) {
        this.OrderId = OrderId;
        this.customerId = customerId;
        this.CustomerName = CustomerName;
        this.orderQty = orderQty;
        this.orderStatus = orderStatus;
    }

    /**
     * @return the OrderId
     */
    public String getOrderId() {
        return OrderId;
    }

    /**
     * @param OrderId the OrderId to set
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the CustomerName
     */
    public String getCustomerName() {
        return CustomerName;
    }

    /**
     * @param CustomerName the CustomerName to set
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * @return the orderQty
     */
    public int getOrderQty() {
        return orderQty;
    }

    /**
     * @param orderQty the orderQty to set
     */
    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    /**
     * @return the orderStatus
     */
    public int getOrderStatus() {
        return orderStatus;
    }

    /**
     * @param orderStatus the orderStatus to set
     */
    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    boolean equalsIgnoreCase(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    

   
    
    
    
   
}
