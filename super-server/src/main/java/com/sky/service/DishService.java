package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.vo.DishVO;
import com.sky.result.PageResult;

/**
 * @projectName: super-takeout
 * @package: com.sky.service
 * @className: DishService
 * @author: 749291
 * @description: TODO
 * @date: 4/27/2024 15:36
 * @version: 1.0
 */

public interface DishService {
    public void saveWithFlavor(DishDTO dishDTo);
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    void deleteBatch(Long[] ids);

    DishVO findById(Long id);

    void updateWithFlavor(DishDTO dishDTO);
}
