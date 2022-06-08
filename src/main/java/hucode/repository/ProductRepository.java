package hucode.repository;

import hucode.entity.Products;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;

import static hucode.config.WebMvcConfig.jdbcTemplate;

public class ProductRepository implements Repository<Products,Integer>{



    @Override
    public int create(Products products) {
        jdbcTemplate.update("insert into products (name,) set");
        return  1;
    }

    @Override
    public List<Products> readAll() {
       return jdbcTemplate.query("select * from products", BeanPropertyRowMapper.newInstance(Products.class));
    }

    @Override
    public int update(Products products) {
        return 0;
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }

    @Override
    public List<Products> findById(Integer id) {
        return null;
    }
}
