package com.project.paintshop.morya.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AllCategoriesInfo {
//	create view allCategoriesInfo as select company.companyId, companyName, productType,productTypeId from company, productType
//	where company.companyId = productType.companyId;
	@Id
	private String productTypeId;
	private String productType;
	private String companyName;
	private String companyId;
	
	public String getProductTypeId() {
		return productTypeId;
	}
	public void setProductTypeId(String productTypeId) {
		this.productTypeId = productTypeId;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	
	@Override
	public String toString() {
		return "AllCatagoriesInfo [productTypeId=" + productTypeId + ", productType=" + productType + ", companyName="
				+ companyName + ", companyId=" + companyId + "]";
	}
}
