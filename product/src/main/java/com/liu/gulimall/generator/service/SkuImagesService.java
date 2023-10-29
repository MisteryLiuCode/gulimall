package com.liu.gulimall.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liu.common.utils.PageUtils;
import com.liu.gulimall.generator.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author liushuaibiao
 * @email misteryliu@outlook.com
 * @date 2023-10-29 17:18:02
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

