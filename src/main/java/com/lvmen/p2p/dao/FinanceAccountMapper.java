package com.lvmen.p2p.dao;

import com.lvmen.p2p.model.FinanceAccount;

public interface FinanceAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    int insert(FinanceAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    int insertSelective(FinanceAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    FinanceAccount selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    int updateByPrimaryKeySelective(FinanceAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbggenerated Tue Nov 05 11:48:54 CST 2019
     */
    int updateByPrimaryKey(FinanceAccount record);
}