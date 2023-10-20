package lulu02_CodeBased_Week5.Entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "damaged_products")

public class DamagedProducts {

	@Id
	int id;
	String product_name;
	String rtor;//reason to return
	String customer_name;
	public DamagedProducts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DamagedProducts(int id, String product_name, String rtor, String customer_name) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.rtor = rtor;
		this.customer_name = customer_name;
	}
	@Override
	public String toString() {
		return "DamagedProducts [id=" + id + ", product_name=" + product_name + ", rtor=" + rtor + ", customer_name="
				+ customer_name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getRtor() {
		return rtor;
	}
	public void setRtor(String rtor) {
		this.rtor = rtor;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(customer_name, id, product_name, rtor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DamagedProducts other = (DamagedProducts) obj;
		return Objects.equals(customer_name, other.customer_name) && id == other.id
				&& Objects.equals(product_name, other.product_name) && Objects.equals(rtor, other.rtor);
	}
	
}
