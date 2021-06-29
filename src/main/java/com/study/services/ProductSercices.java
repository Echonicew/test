package com.study.services;

import com.study.model.dao.ProductDao;
import com.study.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductSercices {
    @Autowired
    private ProductDao dao;

    public Integer deInsert(Product product){
        product = dao.save(product);
        return product.getId();
    }
    public Integer doDelete(Integer pid){
        dao.deleteById(pid);
        return 1;
    }
}
