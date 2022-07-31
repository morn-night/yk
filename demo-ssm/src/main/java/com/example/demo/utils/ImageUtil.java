package com.example.demo.utils;

import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import java.io.IOException;
import java.util.Base64;


/**
 * @Author: HAPPY
 * @Project_name: project
 * @Package_name: priv.happy.hospitaldrugmanagementsystem.util
 * @Date: 2021/11/14 10:34
 * @Description：此工具类用于将文件转为二进制和Base64格式的编码以及解码 base64格式可以起到图像压缩的作用
 * 二进制格式不能起到压缩作用
 */
public class ImageUtil {
    static BASE64Encoder miscEncoder = new sun.misc.BASE64Encoder();
    static BASE64Decoder miscDecoder = new sun.misc.BASE64Decoder();
    static Base64.Encoder utilEncoder = Base64.getEncoder();
    static Base64.Decoder utilDecoder = Base64.getDecoder();



    /**
     * 将springboot前端上传的文件编码为base64格式字符串
     *
     * @param file 上传的文件
     * @return 编码后的字符串
     */
    public static String generateBase64(MultipartFile file) {
        if (file == null || file.isEmpty()) {
            return "图片不能为空！";
        }
        byte[] imageBytes = null;
        String base64EncoderImg = "";
        try {
            imageBytes = file.getBytes();
            base64EncoderImg = utilEncoder.encodeToString(imageBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return base64EncoderImg;
    }

    /**
     * 将base64字符串解码为二进制流
     *
     * @param base64String 要解码的字符串
     * @return 返回解码后的
     */
    public static byte[] decodeBase64Str(String base64String) {

        return utilDecoder.decode(base64String);
    }


}
