package cn.hutool.extra.qrcode;

import org.junit.Test;

import java.io.File;

/**
 * @Author 何润强
 * @Date 2019/10/18 15:53
 * @Description TODO
 **/
public class QrCodeUtilTest {
    /**
     * @Author 何润强
     * @Date 2019/10/18 15:54
     * @Param []
     * @return void
     * @Description 二维码测试
     **/
    @Test
    public void qrCodeTest(){
        QrCodeUtil.generate("生成二维码测试",400,400,new File("C:\\Users\\bytter\\Desktop\\code.jpg"));
    }
}
