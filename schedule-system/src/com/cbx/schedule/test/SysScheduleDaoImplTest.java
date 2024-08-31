package com.cbx.schedule.test;

import com.cbx.schedule.dao.impl.SysScheduleDaoImpl;
import com.cbx.schedule.pojo.SysSchedule;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * ClassName: SysScheduleDaoImplTest
 * Package: com.cbx.schedule.test
 * Description:
 *
 * @Author CBX
 * @Create 30/8/24 22:30
 * @Version 1.0
 */
public class SysScheduleDaoImplTest {
    private static SysScheduleDaoImpl sysScheduleDao;

    @BeforeClass
    public static void initSysScheduleDaoImpl() {
        sysScheduleDao = new SysScheduleDaoImpl();
    }

    @Test
    public void testAddSchedule() {
        sysScheduleDao.addSchedule(new SysSchedule(null, 1, "Software Engineering", 0));
    }

    @Test
    public void testFindAllSchedule(){
        sysScheduleDao.findAllSchedule();
    }
}