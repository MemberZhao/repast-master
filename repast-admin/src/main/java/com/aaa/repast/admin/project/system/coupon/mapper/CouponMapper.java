package com.aaa.repast.admin.project.system.coupon.mapper;

import com.aaa.repast.admin.project.system.coupon.domain.Coupon;
import java.util.List;	

/**
 * 优惠卷 数据层
 * 
 * @author Seven Lee
 * @date 2019-12-05
 */
public interface CouponMapper 
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
     * 优惠卷自动生效
     * 
     * @param coupon 优惠卷信息
     * @return 结果
     */
	public boolean autoEnableCouponEvent(Coupon coupon);

	/**
	 * 优惠卷自动失效
	 *
	 * @param coupon 优惠卷信息
	 * @return 结果
	 */
	public boolean autoDisableCouponEvent(Coupon coupon);
	
	/**
     * 创建优惠卷
     *
     * @param coupon 优惠卷信息
     * @return 结果
     */
	public int createCoupon(Coupon coupon);
	
	/**
     * 删除优惠卷
     * 
     * @param id 优惠卷ID
     * @return 结果
     */
	public int deleteCouponById(String id);
	
	/**
     * 批量删除优惠卷
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteCouponByIds(String[] ids);

	/**
	 * 移除优惠券自动失效事件
	 *
	 * @param id 需要删除的数据ID
	 * @return
	 */
	public boolean dropautoDisableEvent(Coupon coupon);

	/**
	 * 移除优惠券自动生效事件
	 *
	 * @param id 需要删除的数据ID
	 * @return
	 */
	public boolean dropautoEnableEvent(Coupon coupon);


}