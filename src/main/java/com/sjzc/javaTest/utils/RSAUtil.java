package com.sjzc.javaTest.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

/**
 * RSA加密类
 */
public class RSAUtil {
    /**
     * 指定加密算法为RSA
     */
    public static final String CHAR_ENCODING = "UTF-8";
    public static final String RSA_ALGORITHM = "RSA/ECB/PKCS1Padding";

    public static void main(String[] args) throws Exception {
        //加密文本
        String content = "xxx";

        //测试环境
        String privateKey = "xxx";
        String publicKey = "xxx";
        String result1 = RSAUtil.sign256(content, getPrivateKey(privateKey));
        String result2 = RSAUtil.sign(content,(privateKey));
        System.out.println(result1);
        System.out.println("---------------------");
        System.out.println(result2);
        System.out.println(RSAUtil.checkSign256(content, result1, publicKey));
        System.out.println(RSAUtil.checkSign(content, result2, publicKey));

        System.out.println("===============================================");
        //生产环境
        publicKey = "xxx";
        privateKey = "xxx";
        // String content = "channel_id=maoyan&method=linlang&params={\"user_type\":\"1\",\"user_id\":\"B67B478973DC7E48319F92616681114C\",\"appid\":\"101483052\",\"order_id\":\"test_1\",\"res_id\":\"L2PKG200728lhy\"}&timestamp=1596179297&8B0F66728E41C0A5A8E2968FEAB4F09A6B4A65327425B33D02012DD8837CD417";
        String result3 = RSAUtil.sign256(content, getPrivateKey(privateKey));
        String result4 = RSAUtil.sign(content,(privateKey));
        System.out.println(result1);
        System.out.println("---------------------");
        System.out.println(result2);
        System.out.println(RSAUtil.checkSign256(content, result3, publicKey));
        System.out.println(RSAUtil.checkSign(content, result4, publicKey));
    }

    public static String sign256(String plainText, PrivateKey privateKey) throws Exception {
        Signature privateSignature = Signature.getInstance("SHA256withRSA");
        privateSignature.initSign(privateKey);
        privateSignature.update(plainText.getBytes(StandardCharsets.UTF_8));

        byte[] signature = privateSignature.sign();

        return java.util.Base64.getEncoder().encodeToString(signature);
    }

    /**
     * 指定key的大小
     */
    private static int KEY_SIZE = 1024;

    /**
     * 生成密钥对算法
     *
     * @return
     * @throws Exception
     */
    public static Map<String, String> generateKeyPair() throws Exception {
        /** RSA算法要求有一个可信任的随机数源 */
        SecureRandom sr = new SecureRandom();
        /** 为RSA算法创建一个KeyPairGenerator对象 */
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        /** 利用上面的随机数据源初始化这个KeyPairGenerator对象 */
        kpg.initialize(KEY_SIZE, sr);
        /** 生成密匙对 */
        KeyPair kp = kpg.generateKeyPair();
        /** 得到公钥 */
        Key publicKey = kp.getPublic();
        byte[] publicKeyBytes = publicKey.getEncoded();

        String publicKeyBase64 = new BASE64Encoder().encode(publicKeyBytes);
        System.out.println("publicKeyBase64 = " + publicKeyBase64 + "");

        /** 得到私钥 */
        Key privateKey = kp.getPrivate();
        byte[] privateKeyBytes = privateKey.getEncoded();

        String privateKeyBase64 = new BASE64Encoder().encode(privateKeyBytes);
        System.out.println("privateKeyBase64 = " + privateKeyBase64 + "");

        Map<String, String> map = new HashMap<String, String>();
        map.put("publicKey", publicKeyBase64);
        map.put("privateKey", privateKeyBase64);

        return map;
    }

    /**
     * 公钥加密算法--->加密
     *
     * @param source    数据源
     * @param publicKey 公钥
     * @return
     * @throws Exception
     */
    public static String encrypt(String source, String publicKey) throws Exception {
        Key key = getPublicKey(publicKey);
        /** 得到Cipher对象来实现对源数据的RSA加密 */
        Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] b = source.getBytes();
        /** 执行加密操作 */
        byte[] b1 = cipher.doFinal(b);
        return new String(new BASE64Encoder().encode(b1));
    }

    /**
     * 私钥解密算法--->解密
     *
     * @param cryptograph 密文
     * @param privateKey  私钥
     * @return
     * @throws Exception
     */
    public static String decrypt(String cryptograph, String privateKey) throws Exception {
        Key key = getPrivateKey(privateKey);
        /** 得到Cipher对象对已用公钥加密的数据进行RSA解密 */
        Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] b1 = new BASE64Decoder().decodeBuffer(cryptograph);
        /** 执行解密操作 */
        byte[] b = cipher.doFinal(b1);
        return new String(b);
    }

    /**
     * 获取公钥
     *
     * @param key 密钥字符串（经过base64编码）
     * @return
     * @throws Exception
     */
    public static PublicKey getPublicKey(String key) throws Exception {
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(new BASE64Decoder().decodeBuffer(key));
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey publicKey = keyFactory.generatePublic(keySpec);
        return publicKey;
    }

    /**
     * 获取私钥
     *
     * @param key 密钥字符串（经过base64编码）
     * @return
     * @throws Exception
     */
    public static PrivateKey getPrivateKey(String key) throws Exception {
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(new BASE64Decoder().decodeBuffer(key));
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PrivateKey privateKey = keyFactory.generatePrivate(keySpec);
        return privateKey;
    }

    /**
     * 根据私钥进行数据签名
     *
     * @param content
     * @param privateKey
     * @return
     */
    public static String sign(String content, String privateKey) {
        String charset = CHAR_ENCODING;
        try {
            PrivateKey priKey = getPrivateKey(privateKey);

            Signature signature = Signature.getInstance("SHA1WithRSA");

            signature.initSign(priKey);
            signature.update(content.getBytes(charset));

            byte[] signed = signature.sign();

            return new String(new BASE64Encoder().encode(signed));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据公钥进行签名验签 sha1
     *
     * @param content
     * @param sign
     * @param publicKey
     * @return
     */
    public static boolean checkSign(String content, String sign, String publicKey) {
        try {
            PublicKey pubKey = getPublicKey(publicKey);

            Signature signature = Signature.getInstance("SHA1WithRSA");

            signature.initVerify(pubKey);
            signature.update(content.getBytes("UTF-8"));

            boolean bverify = signature.verify(new BASE64Decoder().decodeBuffer(sign));
            return bverify;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 根据公钥进行签名验签 sha256
     *
     * @param content
     * @param sign
     * @param publicKey
     * @return
     */
    public static boolean checkSign256(String content, String sign, String publicKey) {
        try {
            PublicKey pubKey = getPublicKey(publicKey);
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(pubKey);
            signature.update(content.getBytes("UTF-8"));
            boolean bverify = signature.verify(new BASE64Decoder().decodeBuffer(sign));
            return bverify;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
