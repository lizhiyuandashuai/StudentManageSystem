// 包路径：必须正确
package com.auggie.student_server.entity;

// 导入 Lombok 注解
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
// MyBatis 别名注解（按需保留）
import org.apache.ibatis.type.Alias;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Alias("Teacher")
public class Teacher {
    // 属性（根据报错推测，可根据你的实际字段调整）
    private Integer tid;
    private String tname; // 假设你有教师姓名字段，无则删除
    private String password;

    // 手动 get/set 方法
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}