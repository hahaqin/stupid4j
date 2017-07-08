package org.stupid4j.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.stupid4j.web.helper.DataBaseHelper;
import org.stupid4j.web.model.Customer;
import java.util.List;
import java.util.Map;

/**
 * 提供客户数据服务
 */
public class CustomerService {

    private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);

    /**
     * 获取客户列表
     * @return
     */
    public List<Customer> getCustomerList(){
        String sql = "SELECT * FROM customer";
        return DataBaseHelper.queryEntityList(Customer.class, sql);
    }

    /**
     * 获取客户
     * @param id
     * @return
     */
    public Customer getCustomer(Long id){
       String sql = "SELECT * FROM customer WHERE id = ?";
        return DataBaseHelper.queryEntity(Customer.class, sql, id);
    }

    /**
     * 创建客户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> fieldMap){
        return DataBaseHelper.insertEntity(Customer.class, fieldMap);
    }

    /**
     * 更新客户
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(Long id, Map<String,Object> fieldMap){
        return DataBaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(Long id){
        return DataBaseHelper.deleteEntity(Customer.class, id);
    }

}
