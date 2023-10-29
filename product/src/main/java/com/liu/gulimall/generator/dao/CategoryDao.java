package com.liu.gulimall.generator.dao;

import com.liu.gulimall.generator.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author liushuaibiao
 * @email misteryliu@outlook.com
 * @date 2023-10-29 17:18:04
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
