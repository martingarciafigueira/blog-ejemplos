/**
 * This class is generated by jOOQ
 */
package io.github.picodotdev.blogbitix.multidatabase.jooq.purchases.tables.interfaces;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IPurchase extends Serializable {

	/**
	 * Setter for <code>PURCHASES.PURCHASE.ID</code>.
	 */
	public void setId(Long value);

	/**
	 * Getter for <code>PURCHASES.PURCHASE.ID</code>.
	 */
	@NotNull
	public Long getId();

	/**
	 * Setter for <code>PURCHASES.PURCHASE.CREATIONDATE</code>.
	 */
	public void setCreationdate(DateTime value);

	/**
	 * Getter for <code>PURCHASES.PURCHASE.CREATIONDATE</code>.
	 */
	public DateTime getCreationdate();

	/**
	 * Setter for <code>PURCHASES.PURCHASE.QUANTITY</code>.
	 */
	public void setQuantity(Long value);

	/**
	 * Getter for <code>PURCHASES.PURCHASE.QUANTITY</code>.
	 */
	public Long getQuantity();

	/**
	 * Setter for <code>PURCHASES.PURCHASE.PRICE</code>.
	 */
	public void setPrice(BigDecimal value);

	/**
	 * Getter for <code>PURCHASES.PURCHASE.PRICE</code>.
	 */
	public BigDecimal getPrice();

	/**
	 * Setter for <code>PURCHASES.PURCHASE.ITEM_ID</code>.
	 */
	public void setItemId(Long value);

	/**
	 * Getter for <code>PURCHASES.PURCHASE.ITEM_ID</code>.
	 */
	public Long getItemId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IPurchase
	 */
	public void from(io.github.picodotdev.blogbitix.multidatabase.jooq.purchases.tables.interfaces.IPurchase from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IPurchase
	 */
	public <E extends io.github.picodotdev.blogbitix.multidatabase.jooq.purchases.tables.interfaces.IPurchase> E into(E into);
}
