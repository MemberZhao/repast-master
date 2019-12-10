package com.aaa.repast.admin.project.system.coupon.service;

import com.aaa.repast.common.support.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

import com.aaa.repast.admin.project.system.coupon.mapper.CouponMapper;
import com.aaa.repast.admin.project.system.coupon.domain.Coupon;
import org.springframework.transaction.annotation.Transactional;

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
	 * 创建优惠券
	 *
	 * @param coupon 优惠卷信息
	 * @return
	 */
	public int createCoupon(Coupon coupon){
		return couponMapper.createCoupon(coupon);
	}

	/**
	 * 优惠券自动生效
	 *
	 * @param coupon 优惠卷信息
	 * @return
	 */
	public boolean autoEnableCouponEvent(Coupon coupon){
		return !couponMapper.autoEnableCouponEvent(coupon);
	}

	/**
	 * 优惠卷自动失效
	 *
	 * @param coupon 优惠卷信息
	 * @return 结果
	 */
	public boolean autoDisableCouponEvent(Coupon coupon){
		return !couponMapper.autoDisableCouponEvent(coupon);
	}
	
    /**
     * 新增优惠卷
     * 
     * @param coupon 优惠卷信息
     * @return 结果
     */
	@Override
	@Transactional
	public int insertCoupon(Coupon coupon)
	{
		int i = createCoupon(coupon);

		if (i > 0) {
			boolean e = autoEnableCouponEvent(coupon);
			boolean d = autoDisableCouponEvent(coupon);
			if (e && d){
				return i;
			}
		}

		return -1;
	}


	/**
	 * 移除优惠券自动失效事件
	 *
	 * @param id 需要删除的数据ID
	 * @return
	 */
	public boolean dropautoDisableEvent(Coupon coupon){
        return !couponMapper.dropautoDisableEvent(coupon);
	}

    /**
     * 移除优惠券自动生效事件
     *
     * @param id 需要删除的数据ID
     * @return
     */
    public boolean dropautoEnableEvent(Coupon coupon){
        return !couponMapper.dropautoEnableEvent(coupon);
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
		String[] str = Convert.toStrArray(ids);
		List<String> idList = Arrays.asList(str);
        Coupon coupon = new Coupon();
        for (String id : idList) {
            coupon.setId(Long.parseLong(id));
            try {
                dropautoEnableEvent(coupon);
            }catch (Exception e){
                e.printStackTrace();
            }
            try {
                dropautoDisableEvent(coupon);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
		return couponMapper.deleteCouponByIds(str);
	}
	
}
