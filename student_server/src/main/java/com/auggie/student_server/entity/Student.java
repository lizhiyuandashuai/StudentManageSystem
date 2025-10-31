// 包路径：必须和目录结构一致（对应 entity 目录）
package com.auggie.student_server.entity;

// 导入 Lombok 注解（即使手动写了 get/set，保留注解不影响，后续可直接用 Lombok）
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
// MyBatis 别名注解（如果用了 MyBatis 需保留，没用可删除）
import org.apache.ibatis.type.Alias;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Alias("Student")
public class Student {
    // 属性（和你之前定义的一致）
    private Integer sid;
    private String sname;
    private String password;

    // 手动 get/set 方法（解决编译报错核心）
    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}