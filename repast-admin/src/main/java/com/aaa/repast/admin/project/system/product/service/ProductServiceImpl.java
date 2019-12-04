package com.aaa.repast.admin.project.system.product.service;

import com.aaa.repast.common.support.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.aaa.repast.admin.project.system.product.mapper.ProductMapper;
import com.aaa.repast.admin.project.system.product.domain.Product;

/**
 * 商品 服务层实现
 * 
 * @author Seven Lee
 * @date 2019-12-04
 */
@Service
public class ProductServiceImpl implements IProductService 
{
	@Autowired
	private ProductMapper productMapper;

	/**
     * 查询商品信息
     * 
     * @param id 商品ID
     * @return 商品信息
     */
    @Override
	public Product selectProductById(Long id)
	{
	    return productMapper.selectProductById(id);
	}
	
	/**
     * 查询商品列表
     * 
     * @param product 商品信息
     * @return 商品集合
     */
	@Override
	public List<Product> selectProductList(Product product)
	{
	    return productMapper.selectProductList(product);
	}
	
    /**
     * 新增商品
     * 
     * @param product 商品信息
     * @return 结果
     */
	@Override
	public int insertProduct(Product product)
	{
	    return productMapper.insertProduct(product);
	}
	
	/**
     * 修改商品
     * 
     * @param product 商品信息
     * @return 结果
     */
	@Override
	public int updateProduct(Product product)
	{
	    return productMapper.updateProduct(product);
	}

	/**
     * 删除商品对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteProductByIds(String ids)
	{
		return productMapper.deleteProductByIds(Convert.toStrArray(ids));
	}
	
}
