package com.lvmen.p2p.model;

import java.util.Date;

public class LoanInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_loan_info.id
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_loan_info.product_name
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    private String productName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_loan_info.rate
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    private Double rate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_loan_info.cycle
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    private Integer cycle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_loan_info.release_time
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    private Date releaseTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_loan_info.product_type
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    private Integer productType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_loan_info.product_no
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    private String productNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_loan_info.product_money
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    private Double productMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_loan_info.left_product_money
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    private Double leftProductMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_loan_info.bid_min_limit
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    private Double bidMinLimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_loan_info.bid_max_limit
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    private Double bidMaxLimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_loan_info.product_status
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    private Integer productStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_loan_info.product_full_time
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    private Date productFullTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_loan_info.version
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    private Integer version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_loan_info.product_desc
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    private String productDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_loan_info.id
     *
     * @return the value of b_loan_info.id
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_loan_info.id
     *
     * @param id the value for b_loan_info.id
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_loan_info.product_name
     *
     * @return the value of b_loan_info.product_name
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_loan_info.product_name
     *
     * @param productName the value for b_loan_info.product_name
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_loan_info.rate
     *
     * @return the value of b_loan_info.rate
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public Double getRate() {
        return rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_loan_info.rate
     *
     * @param rate the value for b_loan_info.rate
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public void setRate(Double rate) {
        this.rate = rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_loan_info.cycle
     *
     * @return the value of b_loan_info.cycle
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public Integer getCycle() {
        return cycle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_loan_info.cycle
     *
     * @param cycle the value for b_loan_info.cycle
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_loan_info.release_time
     *
     * @return the value of b_loan_info.release_time
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public Date getReleaseTime() {
        return releaseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_loan_info.release_time
     *
     * @param releaseTime the value for b_loan_info.release_time
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_loan_info.product_type
     *
     * @return the value of b_loan_info.product_type
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_loan_info.product_type
     *
     * @param productType the value for b_loan_info.product_type
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_loan_info.product_no
     *
     * @return the value of b_loan_info.product_no
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public String getProductNo() {
        return productNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_loan_info.product_no
     *
     * @param productNo the value for b_loan_info.product_no
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public void setProductNo(String productNo) {
        this.productNo = productNo == null ? null : productNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_loan_info.product_money
     *
     * @return the value of b_loan_info.product_money
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public Double getProductMoney() {
        return productMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_loan_info.product_money
     *
     * @param productMoney the value for b_loan_info.product_money
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public void setProductMoney(Double productMoney) {
        this.productMoney = productMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_loan_info.left_product_money
     *
     * @return the value of b_loan_info.left_product_money
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public Double getLeftProductMoney() {
        return leftProductMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_loan_info.left_product_money
     *
     * @param leftProductMoney the value for b_loan_info.left_product_money
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public void setLeftProductMoney(Double leftProductMoney) {
        this.leftProductMoney = leftProductMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_loan_info.bid_min_limit
     *
     * @return the value of b_loan_info.bid_min_limit
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public Double getBidMinLimit() {
        return bidMinLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_loan_info.bid_min_limit
     *
     * @param bidMinLimit the value for b_loan_info.bid_min_limit
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public void setBidMinLimit(Double bidMinLimit) {
        this.bidMinLimit = bidMinLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_loan_info.bid_max_limit
     *
     * @return the value of b_loan_info.bid_max_limit
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public Double getBidMaxLimit() {
        return bidMaxLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_loan_info.bid_max_limit
     *
     * @param bidMaxLimit the value for b_loan_info.bid_max_limit
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public void setBidMaxLimit(Double bidMaxLimit) {
        this.bidMaxLimit = bidMaxLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_loan_info.product_status
     *
     * @return the value of b_loan_info.product_status
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public Integer getProductStatus() {
        return productStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_loan_info.product_status
     *
     * @param productStatus the value for b_loan_info.product_status
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_loan_info.product_full_time
     *
     * @return the value of b_loan_info.product_full_time
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public Date getProductFullTime() {
        return productFullTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_loan_info.product_full_time
     *
     * @param productFullTime the value for b_loan_info.product_full_time
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public void setProductFullTime(Date productFullTime) {
        this.productFullTime = productFullTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_loan_info.version
     *
     * @return the value of b_loan_info.version
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_loan_info.version
     *
     * @param version the value for b_loan_info.version
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_loan_info.product_desc
     *
     * @return the value of b_loan_info.product_desc
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_loan_info.product_desc
     *
     * @param productDesc the value for b_loan_info.product_desc
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc == null ? null : productDesc.trim();
    }
}