package com.example.diyu.demo.entity;

import com.example.diyu.demo.util.CustomDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

//import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "t_book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//    @NotEmpty(message = "图书名称不能为空!")
    @Column(length = 20,nullable = true)
    private String name;//图书名称

    @NotNull(message = "排序号不能为空!")
    @Column(precision = 10, scale = 2)
    private BigDecimal danjia;//单价  银行都在用  fload  double会出现精度问题
//    @NotEmpty(message = "作者不能为空!")
    @Column(length = 20)
    private String author;//作者

//    @NotEmpty(message = "图书编号不能为空!")
    @Column(length = 20)
    private String bianhao;//图书编号
    @NotNull(message = "排序号不能为空!")
    @Column(length = 10)
    private Integer orderNo;//排序号不能为空

    @Column(length = 200)
    private String imageUrl;//图书封面
    @NotNull(message = "图书数量不能为空!")
    @Column(precision = 10, scale = 2)
    private Integer num;//图书数量
    @ManyToOne
    @JoinColumn(name = "bookTypeId")
    private BookType book;//图书类型

    //创建时间
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;
    //修改时间
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;


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

    public BigDecimal getDanjia() {
        return danjia;
    }

    public void setDanjia(BigDecimal danjia) {
        this.danjia = danjia;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBianhao() {
        return bianhao;
    }

    public void setBianhao(String bianhao) {
        this.bianhao = bianhao;
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

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BookType getBook() {
        return book;
    }

    public void setBook(BookType book) {
        this.book = book;
    }
}
