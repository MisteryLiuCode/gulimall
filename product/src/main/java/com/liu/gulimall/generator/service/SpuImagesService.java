package com.liu.gulimall.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liu.common.utils.PageUtils;
import com.liu.gulimall.generator.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author liushuaibiao
 * @email misteryliu@outlook.com
 * @date 2023-10-29 17:18:02
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

