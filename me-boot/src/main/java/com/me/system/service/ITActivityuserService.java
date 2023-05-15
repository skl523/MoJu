package com.me.system.service;

import java.util.List;
import com.me.system.domain.TActivityuser;

/**
 * 加入得活动Service接口
 * 
 * @author me
 * @date 2022-06-09
 */
public interface ITActivityuserService 
{
    /**
     * 查询加入得活动
     * 
     * @param id 加入得活动主键
     * @return 加入得活动
     */
    public TActivityuser selectTActivityuserById(Long id);

    /**
     * 查询加入得活动列表
     * 
     * @param tActivityuser 加入得活动
     * @return 加入得活动集合
     */
    public List<TActivityuser> selectTActivityuserList(TActivityuser tActivityuser);

    /**
     * 新增加入得活动
     * 
     * @param tActivityuser 加入得活动
     * @return 结果
     */
    public int insertTActivityuser(TActivityuser tActivityuser);

    /**
     * 修改加入得活动
     * 
     * @param tActivityuser 加入得活动
     * @return 结果
     */
    public int updateTActivityuser(TActivityuser tActivityuser);

    /**
     * 批量删除加入得活动
     * 
     * @param ids 需要删除的加入得活动主键集合
     * @return 结果
     */
    public int deleteTActivityuserByIds(Long[] ids);

    /**
     * 删除加入得活动信息
     * 
     * @param id 加入得活动主键
     * @return 结果
     */
    public int deleteTActivityuserById(Long id);
}
