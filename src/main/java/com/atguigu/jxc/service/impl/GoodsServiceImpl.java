package com.atguigu.jxc.service.impl;

import com.atguigu.jxc.dao.GoodsDao;
import com.atguigu.jxc.entity.Goods;
import com.atguigu.jxc.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @PackageName: com.atguigu.jxc.service.impl
 * @ClassName: GoodsServiceImpl
 * @Description:
 * @author: sdl
 * @date: 2022/7/24/11:05
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<Goods> queryGoodsListInventory() {
        return goodsDao.queryGoodsListInventory();

    }

}
