package com.cbx.schedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

/**
 * ClassName: Sys_Schedule
 * Package: com.cbx.schedule.pojo
 * Description:
 *
 * @Author CBX
 * @Create 29/8/24 15:58
 * @Version 1.0
 */
public class SysSchedule implements Serializable {
    private Integer sid;
    private Integer uid;
    private String title;
    private Integer completed;

    @Override
    public String toString() {
        return "SysSchedule{" +
                "sid=" + sid +
                ", uid=" + uid +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysSchedule that = (SysSchedule) o;
        return Objects.equals(sid, that.sid) && Objects.equals(uid, that.uid) && Objects.equals(title, that.title) && Objects.equals(completed, that.completed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, uid, title, completed);
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCompleted() {
        return completed;
    }

    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    public SysSchedule() {
    }

    public SysSchedule(Integer sid, Integer uid, String title, Integer completed) {

        this.sid = sid;
        this.uid = uid;
        this.title = title;
        this.completed = completed;
    }
}
