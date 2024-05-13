package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;
import com.sky.vo.TurnoverReportVO;

import java.time.LocalDate;
import java.util.List;

/**
 * @projectName: super-takeout
 * @package: com.sky.service
 * @className: DishService
 * @author: 749291
 * @description: TODO
 * @date: 4/27/2024 15:36
 * @version: 1.0
 */

public interface ReportService {
    TurnoverReportVO turnOverStatistics(LocalDate begin, LocalDate end);
}