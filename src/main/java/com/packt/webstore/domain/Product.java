package com.packt.webstore.domain;
import org.springframework.web.multipart.MultipartFile;
import java.math.BigDecimal;
import java.io.Serializable;
import javax.xml.bind.annotation. XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnore;
import javax.xml.bind.annotation.XmlTransient; 
import javax.validation.constraints.*;
import com.packt.webstore.validator.ProductId;
@XmlRootElement
public class Product implements Serializable{

	private static final long serialVersionUID = 3678107792576131001L;
	
	@JsonIgnore
	private MultipartFile productImage;
	

	@Pattern(regexp="P[1-9]+", message="{Pattern.Product.productId.validation}")
	@ProductId
	private String productId;
	@Size(min=4, max=50, message="{Size.Product.name.validation}")
	private String name; 
	@Min(value=0, message="{Min.Product.unitPrice.validation}")
	@Digits(integer=8,fraction=2, message="{Digits.Product.unitPrice.validation}")
	@NotNull(message="{NotNull.Product.unitPrice.validation}")
	private BigDecimal unitPrice; 
	private String description; 
	private String manufacturer; 
	private String category; 
	private long unitsInStock; 
	private long unitsInOrder; 
	private boolean discontinued; 
	private String condition;

	public Product(){
		super();

	}

	public Product(String productId, String name, BigDecimal unitPrice){
		this.productId = productId;
		this.name = name;
		this.unitPrice = unitPrice;
	}

// add setters and gettters for all the fields here

	@Override
	public boolean equals(Object obj){

		if (this==obj)
			return true;		
		if (obj==null)
			return false;	
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if(productId == null){
			if(other.productId != null)
				return false;
		}else if (!productId.equals(other.productId))
				return false;
   		return true;
}
	@XmlTransient
	public MultipartFile getProductImage(){
		return this.productImage;
	}
	public void setProductImage(MultipartFile image){
		this.productImage = image;
	}
	public String getProductId(){
		return this.productId;
	}
	public void setProductId(String id){
		this.productId = id;
	}
	public void setCategory(String cate){
		this.category = cate;
	}

	public String getCategory(){
		return this.category;
	}
	public void setManufacturer(String manu){
		this.manufacturer = manu;
	}
	public String getManufacturer(){
		return this.manufacturer;
	}
	public void setUnitsInStock(long quantiy){
		this.unitsInStock = quantiy;
	}

	public long getUnitsInStock(){

		return this.unitsInStock;
	}

	public void setName(String name){
   		this.name = name;
   }
   public String getName(){
   		return this.name;
   }

   public void setDescription(String des){
   	 this.description = des;

   }

   public String getDescription(){

   	return this.description;
   }


  
   public BigDecimal getUnitPrice(){
   	
   	return this.unitPrice;
   }

 	public void setUnitPrice(BigDecimal price){

 		this.unitPrice = price;
 		
 }

   public long getUnitsInOrder(){
   	   return this.unitsInOrder;
   }

   public void setUnitsInOrder(long orderquan){

   	    this.unitsInOrder = orderquan;
   }


   public boolean getDiscontinued(){
 	   return this.discontinued;
 }

   public void setDiscontinued(boolean flag){

 	    this.discontinued = flag;
 }

  public String getCondition(){
  	   return this.condition;
  }
  public void setCondition(String condition){

  	this.condition = condition;
  }

    @Override
    public int hashCode(){

    	final int prime = 31;
    	int result = 1;
    	result = prime * result + ((productId == null) ? 0 : productId.hashCode());
    	return result; 

    }

}