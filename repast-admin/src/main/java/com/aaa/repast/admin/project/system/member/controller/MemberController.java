package com.aaa.repast.admin.project.system.member.controller;

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

import com.aaa.repast.admin.project.system.member.domain.Member;
import com.aaa.repast.admin.project.system.member.service.IMemberService;

/**
 * 会员 信息操作处理
 * 
 * @author Seven Lee
 * @date 2019-12-05
 */
@Controller
@RequestMapping("/system/member")
public class MemberController extends BaseController
{
    private String prefix = "system/member";
	
	@Autowired
	private IMemberService memberService;
	
	@RequiresPermissions("system:member:view")
	@GetMapping()
	public String member()
	{
	    return prefix + "/member";
	}
	
	/**
	 * 查询会员列表
	 */
	@RequiresPermissions("system:member:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Member member)
	{
		startPage();
        List<Member> list = memberService.selectMemberList(member);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出会员列表
	 */
	@RequiresPermissions("system:member:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Member member)
    {
    	List<Member> list = memberService.selectMemberList(member);
        ExcelUtil<Member> util = new ExcelUtil<Member>(Member.class);
        return util.exportExcel(list, "member");
    }
	
	/**
	 * 新增会员
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存会员
	 */
	@RequiresPermissions("system:member:add")
	@Log(title = "会员", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Member member)
	{		
		return toAjax(memberService.insertMember(member));
	}

	/**
	 * 修改会员
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		Member member = memberService.selectMemberById(id);
		mmap.put("member", member);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存会员
	 */
	@RequiresPermissions("system:member:edit")
	@Log(title = "会员", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Member member)
	{		
		return toAjax(memberService.updateMember(member));
	}
	
	/**
	 * 删除会员
	 */
	@RequiresPermissions("system:member:remove")
	@Log(title = "会员", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(memberService.deleteMemberByIds(ids));
	}
	
}
