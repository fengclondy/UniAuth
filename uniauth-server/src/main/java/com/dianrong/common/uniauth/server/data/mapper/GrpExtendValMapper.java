package com.dianrong.common.uniauth.server.data.mapper;

import com.dianrong.common.uniauth.server.data.entity.GrpExtendVal;
import com.dianrong.common.uniauth.server.data.entity.GrpExtendValExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface GrpExtendValMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  int countByExample(GrpExtendValExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  int deleteByExample(GrpExtendValExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  int deleteByPrimaryKey(Long id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  int insert(GrpExtendVal record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  int insertSelective(GrpExtendVal record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  List<GrpExtendVal> selectByExample(GrpExtendValExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  GrpExtendVal selectByPrimaryKey(Long id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  int updateByExampleSelective(@Param("record") GrpExtendVal record,
      @Param("example") GrpExtendValExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  int updateByExample(@Param("record") GrpExtendVal record,
      @Param("example") GrpExtendValExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  int updateByPrimaryKeySelective(GrpExtendVal record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  int updateByPrimaryKey(GrpExtendVal record);

  int updateSystemDefineGrpAttribute(Map<String, Object> params);

  int updateValue(@Param("grpId") Integer grpId, @Param("extendId") Long extendId,
      @Param("value") String value);
}
