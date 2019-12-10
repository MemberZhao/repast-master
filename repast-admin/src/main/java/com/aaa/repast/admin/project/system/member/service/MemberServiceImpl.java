package com.aaa.repast.admin.project.system.member.service;

import com.aaa.repast.common.support.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.aaa.repast.admin.project.system.member.mapper.MemberMapper;
import com.aaa.repast.admin.project.system.member.domain.Member;

/**
 * 会员 服务层实现
 * 
 * @author Seven Lee
 * @date 2019-12-05
 */
@Service
public class MemberServiceImpl implements IMemberService 
{
	@Autowired
	private MemberMapper memberMapper;

	/**
     * 查询会员信息
     * 
     * @param id 会员ID
     * @return 会员信息
     */
    @Override
	public Member selectMemberById(Long id)
	{
	    return memberMapper.selectMemberById(id);
	}
	
	/**
     * 查询会员列表
     * 
     * @param member 会员信息
     * @return 会员集合
     */
	@Override
	public List<Member> selectMemberList(Member member)
	{
	    return memberMapper.selectMemberList(member);
	}
	
    /**
     * 新增会员
     * 
     * @param member 会员信息
     * @return 结果
     */
	@Override
	public int insertMember(Member member)
	{
	    return memberMapper.insertMember(member);
	}
	
	/**
     * 修改会员
     * 
     * @param member 会员信息
     * @return 结果
     */
	@Override
	public int updateMember(Member member)
	{
	    return memberMapper.updateMember(member);
	}

	/**
     * 删除会员对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteMemberByIds(String ids)
	{
		return memberMapper.deleteMemberByIds(Convert.toStrArray(ids));
	}
	
}
