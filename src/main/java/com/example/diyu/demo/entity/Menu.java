package com.example.diyu.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/*菜单*/
@Entity
@Table(name="t_menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 10)
    private Integer pId;//父菜单 根-1 然后是自己增id
    @Column(length = 50)
    private String name;//菜单名字
    @Column(length = 200)
    private String url;//菜单地址
    @Column(length = 10)
    private Integer state;//菜单节点类型 0根节点close 1根节点 opend
    @Column(length = 100)
    private String icon;//图标
    @Column(length = 100)
    private String permissions; //对应shiro权限  user:add permission也可以是中文D
    @Column(length = 10)
    private Integer type;//默认0-选项卡内打开 1-新窗口打开 2-可以弹出端口打开
    @Column(length = 50)
    private String divId;//layui 菜单id
    @NotNull(message = "排序号不能为空！")
    @Column(length = 10)
    private Integer ordreNo;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDivId() {
        return divId;
    }

    public void setDivId(String divId) {
        this.divId = divId;
    }

    public Integer getOrdreNo() {
        return ordreNo;
    }

    public void setOrdreNo(Integer ordreNo) {
        this.ordreNo = ordreNo;
    }
}





























