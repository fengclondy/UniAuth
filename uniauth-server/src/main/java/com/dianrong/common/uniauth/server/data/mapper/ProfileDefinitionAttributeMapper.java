package com.dianrong.common.uniauth.server.data.mapper;

import com.dianrong.common.uniauth.server.data.entity.ProfileDefinitionAttribute;
import com.dianrong.common.uniauth.server.data.entity.ProfileDefinitionAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfileDefinitionAttributeMapper {
  /**
   * This method was generated by MyBatis Generator.
   * This method corresponds to the database table profile_definition_attribute
   *
   * @mbggenerated Tue Jun 27 20:23:32 CST 2017
   */
  int countByExample(ProfileDefinitionAttributeExample example);

  /**
   * This method was generated by MyBatis Generator.
   * This method corresponds to the database table profile_definition_attribute
   *
   * @mbggenerated Tue Jun 27 20:23:32 CST 2017
   */
  int deleteByExample(ProfileDefinitionAttributeExample example);

  /**
   * This method was generated by MyBatis Generator.
   * This method corresponds to the database table profile_definition_attribute
   *
   * @mbggenerated Tue Jun 27 20:23:32 CST 2017
   */
  int insert(ProfileDefinitionAttribute record);

  /**
   * This method was generated by MyBatis Generator.
   * This method corresponds to the database table profile_definition_attribute
   *
   * @mbggenerated Tue Jun 27 20:23:32 CST 2017
   */
  int insertSelective(ProfileDefinitionAttribute record);

  /**
   * This method was generated by MyBatis Generator.
   * This method corresponds to the database table profile_definition_attribute
   *
   * @mbggenerated Tue Jun 27 20:23:32 CST 2017
   */
  List<ProfileDefinitionAttribute> selectByExample(ProfileDefinitionAttributeExample example);

  /**
   * This method was generated by MyBatis Generator.
   * This method corresponds to the database table profile_definition_attribute
   *
   * @mbggenerated Tue Jun 27 20:23:32 CST 2017
   */
  int updateByExampleSelective(@Param("record") ProfileDefinitionAttribute record, @Param("example") ProfileDefinitionAttributeExample example);

  /**
   * This method was generated by MyBatis Generator.
   * This method corresponds to the database table profile_definition_attribute
   *
   * @mbggenerated Tue Jun 27 20:23:32 CST 2017
   */
  int updateByExample(@Param("record") ProfileDefinitionAttribute record, @Param("example") ProfileDefinitionAttributeExample example);
    
    /**
     * 批量插入数据.
     */
    int batchInsert(List<ProfileDefinitionAttribute> list);
}