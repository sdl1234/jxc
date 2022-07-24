package com.atguigu.jxc.controller;

import com.atguigu.jxc.entity.Goods;
import com.atguigu.jxc.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @PackageName: com.atguigu.jxc.controller
 * @ClassName: GoodsController
 * @Description:
 * @author: sdl
 * @date: 2022/7/24/10:37
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/listInventory")
    public List<Goods> queryGoodsListInventory() {

        return goodsService.queryGoodsListInventory();
    }


}
