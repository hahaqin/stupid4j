package org.stupid4j.web.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.stupid4j.web.helper.DataBaseHelper;
import org.stupid4j.web.model.Customer;
import org.stupid4j.web.service.CustomerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CustomerService单元测试
 * Created by yangsiqin on 2017/7/3.
 */
public class CustomerServiceTest {

    private final CustomerService customerService;

    public CustomerServiceTest(){
        customerService = new CustomerService();
    }

    @Before
    public void init() throws Exception{
        String file = "sql/customer_init.sql";
        DataBaseHelper.executeSqlFile(file);
    }

    @Test
    public void getCustomerListTest(){
        List<Customer> list = customerService.getCustomerList();
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void getCustomerTest(){
        Long id =1L;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomerTest(){
        Map<String,Object> fieldMap = new HashMap<String,Object>();
        fieldMap.put("name","hahaqin");
        fieldMap.put("contact","customer3");
        fieldMap.put("telephone","18612345678");
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomerTest(){
        Long id = 1L;
        Map<String,Object> fieldMap = new HashMap<String,Object>();
        fieldMap.put("name","xiaoruan");
        boolean result = customerService.updateCustomer(id,fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest(){
        Long id = 1L;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }
}
