package com.example.diyu.demo.entity;

import com.example.diyu.demo.util.CustomDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/*后台用户实体*/
@Entity  //告诉JPA这是一个实体类（和数据表映射的类）
@Table(name = "t_a_user")  //@Table来指定和哪个数据表对应；如果省略，默认表名就是该类名的小写：user
public class User {
    @Id  //表示这个属性是数据表中的主键
    @GeneratedValue(strategy = GenerationType.IDENTITY ) //还是一个自增的主键
    private Integer id;

    @NotNull(message="用户名不能为空！")
    @Column(length = 30) //这是和数据表对应的一个列,可以定义其在数据表中的名字及长度
    private String name;  //用户名

    @ManyToOne
    @JoinColumn(name = "roleId")
    private Role role; //角色

    @Column(length = 200) //省略的情况，默认列名就是属性名
    private String pwd;

   @NotNull(message="真实姓名不能为空")
    private String trueName; //真实姓名

    @Column(length=200)
    private String remark;

    @NotNull(message="排序号不能为空")
    @Column(length=10)
    Integer orderNo; //排序号
    //创建时间
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;
    //修改时间
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;

    private String imageUrl;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    @JsonSerialize(using = CustomDateTimeSerializer.class)
    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }
    
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    public Date getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
