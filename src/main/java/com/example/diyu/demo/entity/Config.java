package com.example.diyu.demo.entity;

import javax.persistence.*;

/*网站实体配置*/
@Entity
@Table(name="t_config")
public class Config {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Integer id;
    @Column(length=50)
    private String webName;  //网站名称

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWebName() {
        return webName;
    }

    public void setWebName(String webName) {
        this.webName = webName;
    }




}
