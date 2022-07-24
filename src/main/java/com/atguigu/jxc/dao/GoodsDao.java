package com.atguigu.jxc.dao;

import com.atguigu.jxc.entity.Goods;

import java.util.List;

/**
 * @PackageName: com.atguigu.jxc.dao
 * @ClassName: GoodsDao
 * @Description:
 * @author: sdl
 * @date: 2022/7/24/11:08
 */
public interface GoodsDao {

    public List<Goods> queryGoodsListInventory();
}
