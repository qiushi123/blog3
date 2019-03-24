package com.qcl.blog3.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Data;


/**
 * Created by qcl on 2018/7/10.
 * ES相关
 */
@Document(indexName = "user", type = "docs", shards = 1, replicas = 0)
@Data
public class UserES {

    //主键自增长
    @Id
    private Long id;//主键

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String userName;
    private String userPhone;

    public UserES() {
    }

    public UserES(Long id, String userName, String userPhone) {
        this.id = id;
        this.userName = userName;
        this.userPhone = userPhone;
    }

    @Override
    public String toString() {
        return "UserES{" +
                "userId=" + id +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                '}';
    }
}
