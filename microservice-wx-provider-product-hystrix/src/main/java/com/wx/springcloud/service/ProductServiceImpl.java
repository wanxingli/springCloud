package com.wx.springcloud.service;

import com.wx.springcloud.entities.Product;
import com.wx.springcloud.mapper.ProductMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Createc by lwx0y01 on 2020/1/10
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public Product findOne(Long pid) {
        return productMapper.findOne(pid);
    }

    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }

    @Override
    public boolean addProduct(Product product) {
        return productMapper.addProduct(product) == 1 ? true : false;
    }
}
