package com.superman.dal.mybatis.maps;

import com.superman.dal.mybatis.model.ClOrderInfo;
import com.superman.dal.mybatis.model.ClOrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ClOrderInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_order_info
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    int countByExample(ClOrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_order_info
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    int deleteByExample(ClOrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_order_info
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_order_info
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    int insert(ClOrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_order_info
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    int insertSelective(ClOrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_order_info
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    List<ClOrderInfo> selectByExampleWithRowbounds(ClOrderInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_order_info
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    List<ClOrderInfo> selectByExample(ClOrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_order_info
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    ClOrderInfo selectByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_order_info
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    int updateByExampleSelective(@Param("record") ClOrderInfo record, @Param("example") ClOrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_order_info
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    int updateByExample(@Param("record") ClOrderInfo record, @Param("example") ClOrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_order_info
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    int updateByPrimaryKeySelective(ClOrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_order_info
     *
     * @mbggenerated Fri Dec 02 11:13:40 CST 2016
     */
    int updateByPrimaryKey(ClOrderInfo record);
}