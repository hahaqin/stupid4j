package org.stupid4j.web.model;

/**
 * 客户
 */
public class Customer {
    private Long id;//id
    private String name;//客户名称
    private String contact;//联系人
    private String telephone;//电话号码
    private String email;//邮箱地址
    private String remark;//备注
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getRemark() {
        return remark;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
