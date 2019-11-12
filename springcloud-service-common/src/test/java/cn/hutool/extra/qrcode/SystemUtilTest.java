package cn.hutool.extra.qrcode;

import cn.hutool.system.HostInfo;
import cn.hutool.system.SystemUtil;
import org.junit.Test;

/**
 * @Author 何润强
 * @Date 2019/10/18 17:45
 * @Description TODO
 **/
public class SystemUtilTest {
    @Test
    public void test (){
        HostInfo hostInfo = SystemUtil.getHostInfo();
        System.out.println(hostInfo.getAddress());
        System.out.println(hostInfo.getName());
        System.out.println(hostInfo);
    }
}
