package com.cbx.schedule.test;

import com.cbx.schedule.util.MD5Util;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * ClassName: MD5Test
 * Package: com.cbx.schedule.test
 * Description:
 *
 * @Author CBX
 * @Create 31/8/24 13:55
 * @Version 1.0
 */
public class MD5Test {
    @Test
    public void testMD5() {
        String src = "chenbingxu666";
        String encryptedSrc = MD5Util.encrypt(src);
        System.out.println(encryptedSrc);

    }
}
