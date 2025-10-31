// 包路径：必须正确
package com.auggie.student_server.entity;

// 导入 Lombok 注解
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentCourseTeacher {
    // 属性（根据报错推测，对应 setSid()/setCid() 等方法）
    private Integer sid;    // 学生ID
    private Integer cid;    // 课程ID
    private Integer tid;    // 教师ID
    private String term;    // 学期（如"2024-2025学年第一学期"）

    // 手动 get/set 方法
    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }
}