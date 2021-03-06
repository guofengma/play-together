package com.cser.play.common.model;

import java.math.BigDecimal;
import java.sql.Date;

import com.cser.play.common.model.base.BaseOrderList;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class OrderList extends BaseOrderList<OrderList> {
	private BigDecimal totalPrice;
	private Integer total;
	private Date createDate;

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}
