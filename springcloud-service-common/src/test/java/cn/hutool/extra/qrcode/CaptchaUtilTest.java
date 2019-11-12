package cn.hutool.extra.qrcode;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.ShearCaptcha;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author 何润强
 * @Date 2019/10/18 16:15
 * @Description TODO
 **/
public class CaptchaUtilTest {
    @Test
    public void CaptchaTest() throws IOException {
        ShearCaptcha shearCaptcha = CaptchaUtil.createShearCaptcha(200, 100, 4, 4);
        String code = shearCaptcha.getCode();

        System.out.println(code);
        FileOutputStream out = new FileOutputStream(new File("C:\\Users\\bytter\\Desktop\\captcha.jpg"));
        shearCaptcha.write(out);
        
        out.close();
    }

}
