package com.pys.crm.workbench.mapper;

import com.pys.crm.workbench.domain.CustomerRemark;

import java.util.List;

public interface CustomerRemarkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_customer_remark
     *
     * @mbggenerated Thu Apr 07 19:51:39 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_customer_remark
     *
     * @mbggenerated Thu Apr 07 19:51:39 CST 2022
     */
    int insert(CustomerRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_customer_remark
     *
     * @mbggenerated Thu Apr 07 19:51:39 CST 2022
     */
    int insertSelective(CustomerRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_customer_remark
     *
     * @mbggenerated Thu Apr 07 19:51:39 CST 2022
     */
    CustomerRemark selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_customer_remark
     *
     * @mbggenerated Thu Apr 07 19:51:39 CST 2022
     */
    int updateByPrimaryKeySelective(CustomerRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_customer_remark
     *
     * @mbggenerated Thu Apr 07 19:51:39 CST 2022
     */
    int updateByPrimaryKey(CustomerRemark record);


    /**
     * 批量保存客户备注
     * @param list
     * @return
     */
    int insertCustomerRemarkByList(List<CustomerRemark> list);
}