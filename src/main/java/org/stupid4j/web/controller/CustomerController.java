package org.stupid4j.web.controller;

import org.stupid4j.web.model.Customer;
import org.stupid4j.web.service.CustomerService;

import java.util.List;
import java.util.Map;


/**
 * 处理客户管理相关请求
 * Created by yangsiqin on 2017/7/9.
 */
@Controller
public class CustomerController {

    @Inject
    private CustomerService customerService;

    /**
     * 进入客户列表界面
     * @param param
     * @return
     */
    @Action("get:/customer")
    public View inde(Param param){
        List<Customer> customerList = customerService.getCustomerList();
        return new View("customer.jsp").addMondel("customerList", customerList);
    }

    /**
     * 显示客户基本信息
     * @param param
     * @return
     */
    @Action("get:/customer_show")
    public View show(Param param){
        Long id = param.getLong("id");
        Customer customer = customerService.getCustomer(id);
        return new View("customer_show.jsp").addModel("customer",customer);
    }

    /**
     * 进入 创建客户 页面
     * @param param
     * @return
     */
    @Action("get:/customer_create")
    public View create(Param param){
        return new View("customer_create.jsp");
    }

    /**
     * 处理 创建客户 请求
     * @param param
     * @return
     */
    @Action("post:/customer_create")
    public Data createSubmit(Param param){
        Map<String,Object> fieldMap = param.getMap();
        boolean result = customerService.createCustomer(fieldMap);
        return new Data(result);
    }

    /**
     * 进入 编辑客户 页面
     * @param param
     * @return
     */
    @Action("get:/customer_edit")
    public View edit(Param param){
        Long id = param.getLong("id");
        Customer customer = customerService.getCustomer(id);
        return  new View("customer_edit.jsp").addModel("customer",customer);
    }

    /**
     * 处理 编辑客户 请求
     * @param param
     * @return
     */
    @Action("put:/customer_edit")
    public Data editSubmit(Param param){
        Long id = param.getLong("id");
        Map<String, Object> fieldMap = param.getMap();
        boolean result = customerService.updateCustomer(id, fieldMap);
        return new Data(result);
    }

    /**
     * 处理 删除客户 请求
     * @param param
     * @return
     */
    @Action("delete:/customer_edit")
    public Data delete(Param param){
        Long id = param.getLong("id");
        boolean result = customerService.deleteCustomer(id);
        return new Data(result);
    }
}
