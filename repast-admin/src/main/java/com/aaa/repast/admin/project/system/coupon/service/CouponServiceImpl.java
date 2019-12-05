package com.aaa.repast.admin.project.system.coupon.service;

import com.aaa.repast.common.support.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.aaa.repast.admin.project.system.coupon.mapper.CouponMapper;
import com.aaa.repast.admin.project.system.coupon.domain.Coupon;

/**
 * 优惠卷 服务层实现
 * 
 * @author Seven Lee
 * @date 2019-12-05
 */
@Service
public class CouponServiceImpl implements ICouponService 
{
	@Autowired
	private CouponMapper couponMapper;

	/**
     * 查询优惠卷信息
     * 
     * @param id 优惠卷ID
     * @return 优惠卷信息
     */
    @Override
	public Coupon selectCouponById(Long id)
	{
	    return couponMapper.selectCouponById(id);
	}
	
	/**
     * 查询优惠卷列表
     * 
     * @param coupon 优惠卷信息
     * @return 优惠卷集合
     */
	@Override
	public List<Coupon> selectCouponList(Coupon coupon)
	{
	    return couponMapper.selectCouponList(coupon);
	}
	
    /**
     * 新增优惠卷
     * 
     * @param coupon 优惠卷信息
     * @return 结果
     */
	@Override
	public int insertCoupon(Coupon coupon)
	{
	    return couponMapper.insertCoupon(coupon);
	}
	
	/**
     * 修改优惠卷
     * 
     * @param coupon 优惠卷信息
     * @return 结果
     */
	@Override
	public int updateCoupon(Coupon coupon)
	{
	    return couponMapper.updateCoupon(coupon);
	}

	/**
     * 删除优惠卷对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteCouponByIds(String ids)
	{
		return couponMapper.deleteCouponByIds(Convert.toStrArray(ids));
	}
	
}
