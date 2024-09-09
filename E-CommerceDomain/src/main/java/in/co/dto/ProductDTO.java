package in.co.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import in.co.common.BaseDTO;

@Entity
@Table(name = "PRODUCT")
public class ProductDTO extends BaseDTO {

	@Column(name = "PD_NAME")
	private String name;

	@Column(name = "PD_description")
	private String description;

	@Column(name = "PD_PRICE")
	private long price;

	@Column(name = "PD_DATEOFPURCHASE")
	private Date dateOfPurchase;

	@Column(name = "PD_CATEGORY")
	private String category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getKey() {
		return getId() + "";
	}

	public String getValue() {
		return category;
	}

	@Override
	public int compareTo(BaseDTO next) {
		return getValue().compareTo(next.getValue());
	}

}
