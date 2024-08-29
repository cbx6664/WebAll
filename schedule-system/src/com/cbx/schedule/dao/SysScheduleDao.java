package com.cbx.schedule.dao;

import com.cbx.schedule.pojo.SysSchedule;

/**
 * ClassName: SysScheduleDao
 * Package: com.cbx.schedule.dao
 * Description:
 *
 * @Author CBX
 * @Create 29/8/24 16:20
 * @Version 1.0
 */
public interface SysScheduleDao {
    /**
     * Add a schedule record to the database.
     * @param schedule Parameters will be like SysSchedule entities.
     * @return Returns the number of influenced records.
     * If added successfully, then return a number >0, else means failed.
     */
    int addSchedule(SysSchedule schedule);
}
