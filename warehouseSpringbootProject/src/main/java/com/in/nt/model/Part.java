package com.in.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="part_tab")
@Data
public class Part {
	
	@Id
	@GeneratedValue
	@Column(name="partId")
	private Integer partId;
	@Column(name="partCode")
	private String partCode;
	@Column(name="partWieght")
	private Float partW;
	@Column(name="partLength")
	private Float partL;
	@Column(name="partHeigth")
	private Float partH;
	@Column(name="part_cost")
	private Double partCost;
	@Column(name="Currency")
	private String partCurrency;
	@Column(name="part_description")
	private String partDesc;
	public Integer getPartId() {
		return partId;
	}
	public void setPartId(Integer partId) {
		this.partId = partId;
	}
	public String getPartCode() {
		return partCode;
	}
	public void setPartCode(String partCode) {
		this.partCode = partCode;
	}
	
	
	public Float getPartW() {
		return partW;
	}
	public void setPartW(Float partW) {
		this.partW = partW;
	}
	public Float getPartL() {
		return partL;
	}
	public void setPartL(Float partL) {
		this.partL = partL;
	}
	public Float getPartH() {
		return partH;
	}
	public void setPartH(Float partH) {
		this.partH = partH;
	}
	public Double getPartCost() {
		return partCost;
	}
	public void setPartCost(Double partCost) {
		this.partCost = partCost;
	}
	public String getPartCurrency() {
		return partCurrency;
	}
	public void setPartCurrency(String partCurrency) {
		this.partCurrency = partCurrency;
	}
	public String getPartDesc() {
		return partDesc;
	}
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	public Part() {
		super();
		
	}
	@Override
	public String toString() {
		return "Part [partId=" + partId + ", partCode=" + partCode + ", partW=" + partW + ", partL=" + partL
				+ ", partH=" + partH + ", partCost=" + partCost + ", partCurrency=" + partCurrency + ", partDesc="
				+ partDesc + "]";
	}

	
}
