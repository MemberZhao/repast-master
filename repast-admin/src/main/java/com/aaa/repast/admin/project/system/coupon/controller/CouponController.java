package com.aaa.repast.admin.project.system.coupon.controller;

import java.util.List;
import com.aaa.repast.admin.framework.aspectj.lang.annotation.Log;
import com.aaa.repast.admin.framework.aspectj.lang.enums.BusinessType;
import com.aaa.repast.admin.framework.poi.ExcelUtil;
import com.aaa.repast.admin.framework.web.controller.BaseController;
import com.aaa.repast.admin.framework.web.domain.AjaxResult;
import com.aaa.repast.admin.framework.web.page.TableDataInfo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.repast.admin.project.system.coupon.domain.Coupon;
import com.aaa.repast.admin.project.system.coupon.service.ICouponService;

/**
 * 优惠卷 信息操作处理
 * 
 * @author Seven Lee
 * @date 2019-12-05
 */
@Controller
@RequestMapping("/system/coupon")
public class CouponController extends BaseController
{
    private String prefix = "system/coupon";
	
	@Autowired
	private ICouponService couponService;
	
	@RequiresPermissions("system:coupon:view")
	@GetMapping()
	public String coupon()
	{
	    return prefix + "/coupon";
	}
	
	/**
	 * 查询优惠卷列表
	 */
	@RequiresPermissions("system:coupon:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Coupon coupon)
	{
		startPage();
        List<Coupon> list = couponService.selectCouponList(coupon);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出优惠卷列表
	 */
	@RequiresPermissions("system:coupon:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Coupon coupon)
    {
    	List<Coupon> list = couponService.selectCouponList(coupon);
        ExcelUtil<Coupon> util = new ExcelUtil<Coupon>(Coupon.class);
        return util.exportExcel(list, "coupon");
    }
	
	/**
	 * 新增优惠卷
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存优惠卷
	 */
	@RequiresPermissions("system:coupon:add")
	@Log(title = "优惠卷", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Coupon coupon)
	{		
		return toAjax(couponService.insertCoupon(coupon));
	}

	/**
	 * 修改优惠卷
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		Coupon coupon = couponService.selectCouponById(id);
		mmap.put("coupon", coupon);
	    return prefix + "/edit";
	}

	
	/**
	 * 删除优惠卷
	 */
	@RequiresPermissions("system:coupon:remove")
	@Log(title = "优惠卷", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(couponService.deleteCouponByIds(ids));
	}
	
}
