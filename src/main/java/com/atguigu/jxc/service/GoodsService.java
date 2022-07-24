package com.atguigu.jxc.service;

import com.atguigu.jxc.domain.ServiceVO;
import com.atguigu.jxc.entity.Goods;
import com.atguigu.jxc.vo.GoodsListInventoryVo;

import java.util.List;

/**
 * @PackageName: com.atguigu.jxc.service
 * @ClassName: GoodsService
 * @Description:
 * @author: sdl
 * @date: 2022/7/24/11:05
 */
public interface GoodsService {

    /**
     * 获取当前库存信息
     *
     * @return
     */
    public List<Goods> queryGoodsListInventory();
}
