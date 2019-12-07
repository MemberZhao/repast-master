package com.aaa.repast.admin.project.system.coupon.service;

import com.aaa.repast.admin.project.system.coupon.domain.Coupon;
import java.util.List;

/**
 * 优惠卷 服务层
 * 
 * @author Seven Lee
 * @date 2019-12-05
 */
public interface ICouponService 
{
	/**
     * 查询优惠卷信息
     * 
     * @param id 优惠卷ID
     * @return 优惠卷信息
     */
	public Coupon selectCouponById(Long id);
	
	/**
     * 查询优惠卷列表
     * 
     * @param coupon 优惠卷信息
     * @return 优惠卷集合
     */
	public List<Coupon> selectCouponList(Coupon coupon);
	
	/**
     * 新增优惠卷
     * 
     * @param coupon 优惠卷信息
     * @return 结果
     */
	public int insertCoupon(Coupon coupon);

		
	/**
     * 删除优惠卷信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteCouponByIds(String ids);
	
}
