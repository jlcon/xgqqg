package com.superman.dal.mybatis.maps;

import com.superman.dal.mybatis.model.ClSetting;
import com.superman.dal.mybatis.model.ClSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ClSettingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_setting
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    int countByExample(ClSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_setting
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    int deleteByExample(ClSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_setting
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    int deleteByPrimaryKey(String settingId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_setting
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    int insert(ClSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_setting
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    int insertSelective(ClSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_setting
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    List<ClSetting> selectByExampleWithRowbounds(ClSettingExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_setting
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    List<ClSetting> selectByExample(ClSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_setting
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    ClSetting selectByPrimaryKey(String settingId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_setting
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    int updateByExampleSelective(@Param("record") ClSetting record, @Param("example") ClSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_setting
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    int updateByExample(@Param("record") ClSetting record, @Param("example") ClSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_setting
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    int updateByPrimaryKeySelective(ClSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_setting
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    int updateByPrimaryKey(ClSetting record);
}