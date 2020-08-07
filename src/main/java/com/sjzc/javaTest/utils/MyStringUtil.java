package com.sjzc.javaTest.utils;

import org.apache.commons.lang3.StringUtils;

import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 自定义的字符串公共函数
 *
 * @author libin
 * @created 2020/4/13 11:13 AM
 */
public class MyStringUtil {

    /**
     * ipv4标记符号
     */
    public static final String IPV4_SYMBOL = ".";

    /**
     * ipv6标记符号
     */
    public static final String IPV6_SYMBOL = ":";

    private static Pattern URL_DIR_PATTERN = Pattern.compile("^(http://|https://)(.*?)/((.*)/)?(.*)\\.(.*)$");

    /**
     * 获取url PATH除去文件名的那部分路径
     * ex: http://example.vod2.myqcloud.com/dir1/dir2/myVideo.mp4，则路径为/dir1/dir2/
     */
    public static String getDirFromUrl(String url) {
        if (StringUtils.isBlank(url)) {
            return StringUtils.EMPTY;
        }
        Matcher matcher = URL_DIR_PATTERN.matcher(url);
        if (matcher.find()) {
            String dir = matcher.group(4);
            dir = (null == dir) ? StringUtils.EMPTY : dir;
            return new StringBuilder().append("/").append(dir).append("/").toString();
        }
        return StringUtils.EMPTY;
    }

    /**
     * url编码
     *
     * @param content 编码内容
     * @return 编码后字符串
     */
    public static String utf8UrlEncode(String content) {
        if (StringUtils.isBlank(content)) {
            return StringUtils.EMPTY;
        }
        String result = StringUtils.EMPTY;
        try {
            return URLEncoder.encode(content, "UTF-8");
        } catch (Exception e) {
            return result;
        }
    }

    /**
     * @param str 需要判断的字符串
     * @return boolean
     * 返回类型
     * @throws
     * @Title: isNumeric
     * @Description: (判断字符串是否为数字)
     */
    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    // /**
    //  * 利用java原生的类实现SHA256加密
    //  *
    //  * @param str
    //  * @return
    //  */
    // public static String getSHA256(String str) {
    //     MessageDigest messageDigest;
    //     String encodestr = "";
    //     try {
    //         messageDigest = MessageDigest.getInstance("SHA-256");
    //         messageDigest.update(str.getBytes("UTF-8"));
    //         encodestr = byte2Hex(messageDigest.digest());
    //     } catch (NoSuchAlgorithmException e) {
    //         e.printStackTrace();
    //     } catch (UnsupportedEncodingException e) {
    //         e.printStackTrace();
    //     }
    //     return encodestr;
    // }
    //
    //
    // /**
    //  * 签名
    //  *
    //  * @return pkcs1格式私钥签名后经过base64处理的字符串
    //  * @throws Exception
    //  */
    // public static String sign(String str, String privateKey) {
    //     String base64Sign = "";
    //     PrivateKey priKey = null;
    //     try {
    //         priKey = getPrivateKey(privateKey);
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    //     // 签名
    //     try {
    //         Signature sign = Signature.getInstance("SHA1withRSA");
    //         sign.initSign(priKey);
    //         byte[] bysData = str.getBytes("UTF-8");
    //         sign.update(bysData);
    //         byte[] signByte = sign.sign();
    //         BASE64Encoder encoder = new BASE64Encoder();
    //         base64Sign = encoder.encode(signByte);
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    //
    //     return base64Sign;
    // }
    //
    // /**
    //  * RSA公钥加密
    //  *
    //  * @param str       加密字符串
    //  * @param publicKey 公钥
    //  * @return 密文
    //  * @throws Exception 加密过程中的异常信息
    //  */
    // public static String encrypt(String str, String publicKey) throws Exception {
    //     //base64编码的公钥
    //     byte[] decoded = Base64.decodeBase64(publicKey);
    //     RSAPublicKey pubKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decoded));
    //     //RSA加密
    //     Cipher cipher = Cipher.getInstance("RSA");
    //     cipher.init(Cipher.ENCRYPT_MODE, pubKey);
    //     String outStr = Base64.encodeBase64String(cipher.doFinal(str.getBytes("UTF-8")));
    //     return outStr;
    // }
    //
    // /**
    //  * RSA私钥加密
    //  *
    //  * @param str        加密字符串
    //  * @param privateKey 私钥
    //  * @return 密文
    //  * @throws Exception 加密过程中的异常信息
    //  */
    // public static String encryptByRri(String str, String privateKey) throws Exception {
    //     // pkcs1->pkcs8
    //     // privateKey = RsaPkcsTransformer.formatPkcs1ToPkcs8(privateKey);
    //     //base64编码的私钥
    //     byte[] decoded = Base64.decodeBase64(privateKey);
    //     RSAPrivateKey priKey = (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(decoded));
    //     //RSA加密
    //     Cipher cipher = Cipher.getInstance("RSA");
    //     cipher.init(Cipher.ENCRYPT_MODE, priKey);
    //     String outStr = Base64.encodeBase64String(cipher.doFinal(str.getBytes("UTF-8")));
    //     return outStr;
    // }
    //
    // //加密
    // /*
    //  * 公钥加密
    //  * @Param str : 加密字符串
    //  * @Param publicKey : 公钥
    //  * return : 密文
    //  */
    // public static String encryptByPri444(String str , String privateKey) throws Exception {
    //     PrivateKey priKey = getPrivateKey333(privateKey);
    //     //RSA加密
    //     Cipher cipher = Cipher.getInstance("RSA");
    //     cipher.init(Cipher.ENCRYPT_MODE, priKey);
    //     String outStr = new BASE64Encoder().encode(cipher.doFinal(str.getBytes("UTF-8")));
    //     return outStr;
    //
    // }
    //
    //
    // /**
    //  * RSA私钥加密
    //  *
    //  * @param str        加密字符串
    //  * @param privateKey 私钥
    //  * @return 密文
    //  * @throws Exception 加密过程中的异常信息
    //  */
    // public static String encryptByRri2(String str, String privateKey) throws Exception {
    //     PrivateKey priKey = getPrivateKey222(privateKey);
    //     //RSA加密
    //     Cipher cipher = Cipher.getInstance("RSA");
    //     cipher.init(Cipher.ENCRYPT_MODE, priKey);
    //     String outStr = Base64.encodeBase64String(cipher.doFinal(str.getBytes("UTF-8")));
    //     return outStr;
    // }
    //
    // /**
    //  * RSA私钥加密
    //  *
    //  * @param str        加密字符串
    //  * @param privateKey 私钥
    //  * @return 密文
    //  * @throws Exception 加密过程中的异常信息
    //  */
    // public static String encryptByRri3(String str, String privateKey) throws Exception {
    //     PrivateKey priKey = getPrivateKey333(privateKey);
    //     //RSA加密
    //     Cipher cipher = Cipher.getInstance("RSA");
    //     cipher.init(Cipher.ENCRYPT_MODE, priKey);
    //     String outStr = Base64.encodeBase64String(cipher.doFinal(str.getBytes("UTF-8")));
    //     return outStr;
    // }
    //
    // private static PrivateKey getPrivateKey11(String privateKey) throws Exception {
    //     Reader privateKeyReader = new StringReader(privateKey);
    //     PEMParser privatePemParser = new PEMParser(privateKeyReader);
    //     Object privateObject = privatePemParser.readObject();
    //     if (privateObject instanceof PEMKeyPair) {
    //         PEMKeyPair pemKeyPair = (PEMKeyPair) privateObject;
    //         JcaPEMKeyConverter converter = new JcaPEMKeyConverter().setProvider("BC");
    //         PrivateKey privKey = converter.getPrivateKey(pemKeyPair.getPrivateKeyInfo());
    //         return privKey;
    //     }
    //     return null;
    // }
    //
    // public static PrivateKey getPrivateKey222(String priKeyData) throws Exception {
    //     /*
    //      * n:512 e:512 d:512 p:256 q:256 dmp1:256 dmq1:256 iqmp:256
    //      */
    //     BigInteger modulus = new BigInteger(priKeyData.substring(8, 512 + 8),
    //             16);
    //     BigInteger publicExponent = new BigInteger(priKeyData.substring(
    //             512 + 8, 512 + 8 + 512), 16);
    //     BigInteger privateExponent = new BigInteger(priKeyData.substring(
    //             512 + 8 + 512, 512 + 8 + 512 + 512), 16);
    //     BigInteger primeP = new BigInteger(priKeyData.substring(
    //             512 + 8 + 512 + 512, 512 + 8 + 512 + 512 + 256), 16);
    //     BigInteger primeQ = new BigInteger(priKeyData.substring(512 + 8 + 512
    //             + 512 + 256, 512 + 8 + 512 + 512 + 256 + 256), 16);
    //     BigInteger primeExponentP = new BigInteger(
    //             priKeyData.substring(512 + 8 + 512 + 512 + 256 + 256, 512 + 8
    //                     + 512 + 512 + 256 + 256 + 256), 16);
    //     BigInteger primeExponentQ = new BigInteger(priKeyData.substring(512 + 8
    //             + 512 + 512 + 256 + 256 + 256, 512 + 8 + 512 + 512 + 256 + 256
    //             + 256 + 256), 16);
    //     BigInteger crtCoefficient = new BigInteger(priKeyData.substring(512 + 8
    //             + 512 + 512 + 256 + 256 + 256 + 256, 512 + 8 + 512 + 512 + 256
    //             + 256 + 256 + 256 + 256), 16);
    //     KeyFactory keyFactory = KeyFactory.getInstance("RSA");
    //     RSAPrivateCrtKeySpec rsaPrivateKeySpec = new RSAPrivateCrtKeySpec(
    //             modulus, publicExponent, privateExponent, primeP, primeQ,
    //             primeExponentP, primeExponentQ, crtCoefficient);
    //     return keyFactory.generatePrivate(rsaPrivateKeySpec);
    // }
    //
    // public static PrivateKey getPrivateKey333(String privKeyPEM) throws Exception{
    //
    //     String privKeyPEMnew = privKeyPEM.replaceAll("\\n", "").replace("-----BEGIN RSA PRIVATE KEY-----", "").replace("-----END RSA PRIVATE KEY-----", "");
    //     byte[] bytes = java.util.Base64.getDecoder().decode(privKeyPEMnew);
    //
    //     DerInputStream derReader = new DerInputStream(bytes);
    //     DerValue[] seq = derReader.getSequence(0);
    //     BigInteger modulus = seq[1].getBigInteger();
    //     BigInteger publicExp = seq[2].getBigInteger();
    //     BigInteger privateExp = seq[3].getBigInteger();
    //     BigInteger prime1 = seq[4].getBigInteger();
    //     BigInteger prime2 = seq[5].getBigInteger();
    //     BigInteger exp1 = seq[6].getBigInteger();
    //     BigInteger exp2 = seq[7].getBigInteger();
    //     BigInteger crtCoef = seq[8].getBigInteger();
    //
    //     RSAPrivateCrtKeySpec keySpec = new RSAPrivateCrtKeySpec(modulus, publicExp, privateExp, prime1, prime2, exp1, exp2, crtCoef);
    //     KeyFactory keyFactory = KeyFactory.getInstance("RSA");
    //     PrivateKey privateKey = keyFactory.generatePrivate(keySpec);
    //     return privateKey;
    // }
    //
    // /**
    //  * RSA私钥解密
    //  *
    //  * @param str        加密字符串
    //  * @param privateKey 私钥
    //  * @return 铭文
    //  * @throws Exception 解密过程中的异常信息
    //  */
    // public static String decrypt(String str, String privateKey) throws Exception {
    //     //64位解码加密后的字符串
    //     byte[] inputByte = Base64.decodeBase64(str.getBytes("UTF-8"));
    //     //base64编码的私钥
    //     byte[] decoded = Base64.decodeBase64(privateKey);
    //     RSAPrivateKey priKey = (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(decoded));
    //     //RSA解密
    //     Cipher cipher = Cipher.getInstance("RSA");
    //     cipher.init(Cipher.DECRYPT_MODE, priKey);
    //     String outStr = new String(cipher.doFinal(inputByte));
    //     return outStr;
    // }
    //
    // /**
    //  * 将byte转为16进制
    //  *
    //  * @param bytes
    //  * @return
    //  */
    // private static String byte2Hex(byte[] bytes) {
    //     StringBuffer stringBuffer = new StringBuffer();
    //     String temp = null;
    //     for (int i = 0; i < bytes.length; i++) {
    //         temp = Integer.toHexString(bytes[i] & 0xFF);
    //         if (temp.length() == 1) {
    //             //1得到一位的进行补0操作
    //             stringBuffer.append("0");
    //         }
    //         stringBuffer.append(temp);
    //     }
    //     return stringBuffer.toString();
    // }
    //
    // // /**
    // //  * 实例化私钥
    // //  *
    // //  * @return
    // //  */
    // // private static PrivateKey getPrivateKey() {
    // //     PrivateKey privateKey = null;
    // //     String priKey = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAJVGIOQQpfL8oFN75SaQD596rXMZYiAHGSBvPtoEkZvn54woqiINGgQfOUad3AUqbiZBY1+24w581yiDNikYpIR8Luyp8E8MewY9mLExbMvcnXTOQxNajowMhcoqowbU+B6rXAQ18mNxhJT96dhJmSDesVM5oFIUh36us+M+jtjjAgMBAAECgYABtnxKIabF0wBD9Pf8KUsEmXPEDlaB55LyPFSMS+Ef2NlfUlgha+UQhwsxND6CEKqS5c0uG/se/2+4l0jXz+CTYBEh+USYB3gxcMKEo5XDFOGaM2Ncbc7FAKJIkYYN2DHmr4voSM5YkVibw5Lerw0kKdYyr0Xd0kmqTok3JLiLgQJBAOGZ1ao9oqWUzCKnpuTmXre8pZLmpWPhm6S1FU0vHjI0pZh/jusc8UXSRPnx1gLsgXq0ux30j968x/DmkESwxX8CQQCpY1+2p1aX2EzYO3UoTbBUTg7lCsopVNVf41xriek7XF1YyXOwEOSokp2SDQcRoKJ2PyPc2FJ/f54pigdsW0adAkAM8JTnydc9ZhZ7WmBhOrFuGnzoux/7ZaJWxSguoCg8OvbQk2hwJd3U4mWgbHWY/1XB4wHkivWBkhRpxd+6gOUjAkBH9qscS52zZzbGiwQsOk1Wk88qKdpXku4QDeUe3vmSuZwC85tNyu+KWrfM6/H74DYFbK/MzK7H8iz80uJye5jVAkAEqEB/LwlpXljFAxTID/SLZBb+bCIoV/kvg+2145F+CSSUjEWRhG/+OH0cQfqomfg36WrvHl0g/Xw06fg31HgK";
    // //     PKCS8EncodedKeySpec priPKCS8;
    // //     try {
    // //         priPKCS8 = new PKCS8EncodedKeySpec(new BASE64Decoder().decodeBuffer(priKey));
    // //         KeyFactory keyf = KeyFactory.getInstance("RSA");
    // //         privateKey = keyf.generatePrivate(priPKCS8);
    // //     } catch (IOException e) {
    // //         e.printStackTrace();
    // //     } catch (NoSuchAlgorithmException e) {
    // //         e.printStackTrace();
    // //     } catch (InvalidKeySpecException e) {
    // //         e.printStackTrace();
    // //     }
    // //     return privateKey;
    // // }
    //
    // /**
    //  * 得到私钥
    //  *
    //  * @param key 密钥字符串（经过base64编码）
    //  * @throws Exception
    //  */
    // public static PrivateKey getPrivateKey(String key) throws Exception {
    //     byte[] keyBytes;
    //     keyBytes = (new BASE64Decoder()).decodeBuffer(key);
    //     PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
    //     KeyFactory keyFactory = KeyFactory.getInstance("RSA");
    //     PrivateKey privateKey = keyFactory.generatePrivate(keySpec);
    //     return privateKey;
    // }
}
