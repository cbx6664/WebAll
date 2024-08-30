package com.cbx.schedule.dao.impl;

import com.cbx.schedule.dao.BaseDao;
import com.cbx.schedule.dao.SysScheduleDao;
import com.cbx.schedule.pojo.SysSchedule;

import java.util.List;

/**
 * ClassName: SysScheduleDaoImpl
 * Package: com.cbx.schedule.dao.impl
 * Description:
 *
 * @Author CBX
 * @Create 29/8/24 17:13
 * @Version 1.0
 */
public class SysScheduleDaoImpl extends BaseDao implements SysScheduleDao {
    @Override
    public int addSchedule(SysSchedule schedule) {
        String sql = "insert into sys_schedule values(DEFAULT,?,?,?)";
        int rows = baseUpdate(sql, schedule.getUid(), schedule.getTitle(), schedule.getCompleted());
        System.out.println(rows);

        return rows;
    }

    @Override
    public List<SysSchedule> findAllSchedule() {
        String sql = "select sid,uid,title,completed from sys_schedule";
        List<SysSchedule> sysScheduleList = baseQuery(SysSchedule.class, sql);
        System.out.println(sysScheduleList);
        return sysScheduleList;
    }
}
