package Day612_Cryption;

import java.io.*;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Random;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

import org.apache.commons.codec.binary.Base64;

public class FileEncAndDec {
    private static String ALGORITHM = "DES";//DES
    private static byte[] keyBytes="01234567".getBytes();

    private static String ALGORITHM_PBE = "PBEWITHMD5andDES";//PBE
    private static String password="sacdfsbgdbg";
    static Key key;
    static byte[] salt;

    public static void main(String[] args) throws Exception {

//		File srcFile = new File("src/doc/软件版本管控系统需求文档20180106.doc"); // 初始文件（单个文件）
//		File encFile = new File("src/doc/tmp"); // 加密文件
//		File decFile = new File("src/doc/软件版本管控系统需求文档.doc"); // 解密文件

        File srcFile = new File("src/doc/CCSC.zip"); // 初始文件(压缩文件)
        File encFile = new File("src/doc/tmp"); // 加密文件
        File decFile = new File("src/doc/CCSC1.zip"); // 解密文件

        key=toKey();
        salt=initSalt();

        try {
            EncFile(srcFile, encFile); // 加密操作
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            DecFile(encFile, decFile); // 加密操作
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //文件加密
    private static void EncFile(File srcFile, File encFile) throws Exception {
        Long filelength = srcFile.length();  //文件长度
        byte[] filecontent = new byte[filelength.intValue()]; //文件内容

        if (!srcFile.exists()) {
            System.out.println("source file not exixt");
            return;
        }
        if (!encFile.exists()) {
            System.out.println("encrypt file created");
            encFile.createNewFile();
        }
        InputStream fis = new FileInputStream(srcFile);
        OutputStream fos = new FileOutputStream(encFile);

        fis.read(filecontent);

//		fos.write(EncoderByBase64(filecontent));//Base64

//		fos.write(EncoderByDES(filecontent));//DES		

        fos.write(EncoderByPBE(filecontent,key, salt));

        fis.close();
        fos.flush();
        fos.close();
    }

    //文件解密
    private static void DecFile(File encFile, File decFile) throws Exception {
        Long filelength = encFile.length();  //文件长度
        byte[] filecontent = new byte[filelength.intValue()]; //文件内容

        if(!encFile.exists()){
            System.out.println("encrypt file not exixt");
            return;
        }
        if(!decFile.exists()){
            System.out.println("decrypt file created");
            decFile.createNewFile();
        }

        InputStream fis  = new FileInputStream(encFile);
        OutputStream fos = new FileOutputStream(decFile);

        fis.read(filecontent);

//		fos.write(DecoderByBase64(filecontent));//Base64

//		fos.write(DecoderByDES(filecontent));//DES

        fos.write(DecoderByPBE(filecontent,key, salt));

        fis.close();
        fos.flush();
        fos.close();
    }

    ///////////////////////////////////////////////////////////////////
    /*                             Base64                            */
    ///////////////////////////////////////////////////////////////////

    //Base64加密算法
    public static byte[] EncoderByBase64(byte[] base64Byte) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        byte[] base64=Base64.encodeBase64(base64Byte);//加密算法
        return base64;
    }
    //Base64解密算法
    public static byte[] DecoderByBase64(byte[] base64Byte) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        byte[] base64=Base64.decodeBase64(base64Byte);//解密算法
        return base64;
    }

    //DES加密算法
    public static byte[] EncoderByDES(byte[] DESByte)
            throws InvalidKeyException, NoSuchAlgorithmException, InvalidKeySpecException,
            NoSuchPaddingException, InvalidAlgorithmParameterException,
            IllegalBlockSizeException, BadPaddingException{
        DESKeySpec keySpec=new DESKeySpec(keyBytes);  //加密算法
        SecretKeyFactory keyFactory=SecretKeyFactory.getInstance(ALGORITHM);
        SecretKey key=keyFactory.generateSecret(keySpec);   //产生密钥      

        Cipher cipher=Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(keySpec.getKey()));
        byte[] result=cipher.doFinal(DESByte);
        return result;
    }
    //DES解密算法
    public static byte[] DecoderByDES(byte[] DESByte)
            throws NoSuchAlgorithmException, UnsupportedEncodingException,
            InvalidKeyException, InvalidKeySpecException, NoSuchPaddingException,
            InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException{
        DESKeySpec keySpec=new DESKeySpec(keyBytes);
        SecretKeyFactory keyFactory=SecretKeyFactory.getInstance(ALGORITHM);
        SecretKey key=keyFactory.generateSecret(keySpec);  //产生密钥

        Cipher cipher=Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(keyBytes));
        byte[] result=cipher.doFinal(DESByte);
        return result;
    }

    ///////////////////////////////////////////////////////////////////
    /*                             PBE                               */
    ///////////////////////////////////////////////////////////////////

    //PBE salt初始化
    public static byte[] initSalt() throws Exception {
        byte[] salt = new byte[8];
        Random random = new Random();
        random.nextBytes(salt);
        return salt;
    }

    //转换密钥
    private static Key toKey() throws Exception {
        PBEKeySpec keySpec = new PBEKeySpec(password.toCharArray());
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM_PBE);
        SecretKey secretKey = keyFactory.generateSecret(keySpec);
        return secretKey;
    }

    //PBE加密算法
    public static byte[] EncoderByPBE(byte[] PBEByte,Key key, byte[] salt) throws Exception{
        PBEParameterSpec paramSpec = new PBEParameterSpec(salt, 100);
        Cipher cipher = Cipher.getInstance(ALGORITHM_PBE);
        cipher.init(Cipher.ENCRYPT_MODE, key, paramSpec);
        return cipher.doFinal(PBEByte);
    }
    //PBE解密算法
    public static byte[] DecoderByPBE(byte[] PBEByte,Key key,byte[] salt) throws Exception{
        PBEParameterSpec paramSpec = new PBEParameterSpec(salt, 100);
        Cipher cipher = Cipher.getInstance(ALGORITHM_PBE);
        cipher.init(Cipher.DECRYPT_MODE, key, paramSpec);
        return cipher.doFinal(PBEByte);
    }

    ///////////////////////////////////////////////////////////////////
    /*                             MD5                               */
    ///////////////////////////////////////////////////////////////////

    //MD5加密算法
    public static byte[] EncoderByMd5(byte[] md5Byte) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        //确定计算方法
        MessageDigest md5=MessageDigest.getInstance("MD5");//加密算法
        md5.update(md5Byte);
        byte[] newByte = md5.digest();
        return newByte;
    }
}