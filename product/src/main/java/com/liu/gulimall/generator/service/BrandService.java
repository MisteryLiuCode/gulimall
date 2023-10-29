package com.liu.gulimall.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liu.common.utils.PageUtils;
import com.liu.gulimall.generator.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author liushuaibiao
 * @email misteryliu@outlook.com
 * @date 2023-10-29 17:18:04
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

