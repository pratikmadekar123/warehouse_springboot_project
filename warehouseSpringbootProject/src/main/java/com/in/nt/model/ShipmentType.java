package com.in.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;
import org.springframework.context.annotation.Primary;

import lombok.Data;

@Entity
@Table(name="shipment_type")
@Data
public class ShipmentType {

	public ShipmentType() {
		super();
	}

	public ShipmentType(Integer shipId) {
		super();
		this.shipId = shipId;
	}

	@Id
	@GeneratedValue
	@Column(name="shipId")
	private Integer shipId;
	@Column(name="shipMode")
	private String shipMode;
	@Column(name="shipCode")
	private String shipCode;
	@Column(name="enbShip")
	private String enbShip;
	@Column(name="shipGrade")
	private String shipGrade;
	@Column(name="shipDesc")
	private String shipDesc;
	public Integer getShipId() {
		return shipId;
	}

	public void setShipId(Integer shipId) {
		this.shipId = shipId;
	}

	public String getShipMode() {
		return shipMode;
	}

	public void setShipMode(String shipMode) {
		this.shipMode = shipMode;
	}

	public String getShipCode() {
		return shipCode;
	}

	public void setShipCode(String shipCode) {
		this.shipCode = shipCode;
	}

	public String getEnbShip() {
		return enbShip;
	}

	public void setEnbShip(String enbShip) {
		this.enbShip = enbShip;
	}

	public String getShipGrade() {
		return shipGrade;
	}

	public void setShipGrade(String shipGrade) {
		this.shipGrade = shipGrade;
	}

	public String getShipDesc() {
		return shipDesc;
	}

	public void setShipDesc(String shipDesc) {
		this.shipDesc = shipDesc;
	}

	@Override
	public String toString() {
		return "ShipmentType [shipId=" + shipId + ", shipMode=" + shipMode + ", shipCode=" + shipCode + ", enbShip="
				+ enbShip + ", shipGrade=" + shipGrade + ", shipDesc=" + shipDesc + "]";
	}


}
