package online.gaoshuai.test;

import com.ipi.ers.dessdk.ErsDesForSdkExcetpion;
import com.ipi.ers.dessdk.ErsDesForSdkTool;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
测试紧急救援加解密
 */
public class EmergencyRescue {
    public static void main(String[] args) {
        //请求接口中的，返回值，测试接口是否通
        String miwen="EGeXHmDjNi22Ra33BUrCG3swgP7vHg_r6ZWhmDs7qa3Ataz7_itRJZc1cXUsUmJvzSPn_XnuYIvq qD02ijEVBYW92HCOe0epGKtvJkSRRIz0ziBr7ZeqGQ-lkXqeen1C6hVM4EfbVos=";
        String yearMonth=new SimpleDateFormat("yyyyMM").format(new Date());
        ErsDesForSdkTool ps = new ErsDesForSdkTool(yearMonth);
        // 加密后密文进行解密，解密后的明文
        String jiemihoumingwen = null;
        try {
            jiemihoumingwen = ps.decrypt(miwen);
        } catch (ErsDesForSdkExcetpion ersDesForSdkExcetpion) {
            ersDesForSdkExcetpion.printStackTrace();
        }
        System.out.println("jiemihoumingwen=" + jiemihoumingwen);

    }
}
