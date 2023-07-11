package edu.ustb.blog.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * @projectName: sblog
 * @package: edu.ustb.blog.utils
 * @className: PasswordUtil
 * @author: FangLei
 * @description:
 * @date: 2023/7/11 13:00
 * @version: 1.0
 */
public class PasswordUtil {

    /**
     * 执行密码加密
     *
     * @param password 原始密码
     * @param salt     盐值
     * @return 加密后的密文
     */
    private static String getMd5Password(String password, String salt)  {
        /*
         * 加密规则：
         * 使用UUID作为盐值，在原始密码的左右两侧拼接，进行一次MD5加密
         */
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update( (salt+password+salt).getBytes() );
            byte[] bs = messageDigest.digest();
            password = new BigInteger(1,bs).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return password;
    }


//    public static void main(String[] args) {
//        String encodingPwd = PasswordUtil.getMd5Password("123456", "ustb");
//        System.out.println(encodingPwd);
//    }
}
