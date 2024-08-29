package com.cbx.schedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: Sys_Schedule
 * Package: com.cbx.schedule.pojo
 * Description:
 *
 * @Author CBX
 * @Create 29/8/24 15:58
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SysSchedule implements Serializable {
    private Integer sid;
    private Integer uid;
    private String title;
    private Integer completed;
}
