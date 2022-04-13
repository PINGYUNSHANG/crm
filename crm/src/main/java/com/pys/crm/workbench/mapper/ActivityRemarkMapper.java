package com.pys.crm.workbench.mapper;

import com.pys.crm.workbench.domain.ActivityRemark;

import java.util.List;

public interface ActivityRemarkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Tue Apr 05 17:30:47 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Tue Apr 05 17:30:47 CST 2022
     */
    int insert(ActivityRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Tue Apr 05 17:30:47 CST 2022
     */
    int insertSelective(ActivityRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Tue Apr 05 17:30:47 CST 2022
     */
    ActivityRemark selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Tue Apr 05 17:30:47 CST 2022
     */
    int updateByPrimaryKeySelective(ActivityRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Tue Apr 05 17:30:47 CST 2022
     */
    int updateByPrimaryKey(ActivityRemark record);

    /**
     * 根据Activity ID 查询市场活动下所有备注的信息
     */
    List<ActivityRemark>  selectActivityRemarkForDetailById(String id);

    /**
     * 保存创建的市场活动
     */
    int insertActivityRemark(ActivityRemark remark);

    /**
     * 根据id删除市场活动备注
     * @param
     * @return
     */
    int deleteActivityRemarkById(String id);

    /**
     * 保存修改的市场活动备注
     * @param remark
     * @return
     */
    int updateActivityRemark(ActivityRemark remark);
}