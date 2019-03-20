package zjr.bing.util;

import zjr.bing.entity.ImageEntity;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class HttpUtil {

    public static void download(final ImageEntity imageEntity) {
        HttpURLConnection httpURLConnection = null;
        FileOutputStream fileOutputStream = null;
        InputStream inputStream = null;
        try {
            fileOutputStream = new FileOutputStream(imageEntity.getImageFileAddress());
            URL url = new URL(imageEntity.getImageUrl());
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(3000);
            httpURLConnection.setReadTimeout(6000);
            httpURLConnection.connect();
            inputStream = httpURLConnection.getInputStream();
            int len = -1;
            byte[] buffer = new byte[1024];
            while ((len = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fileOutputStream) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            httpURLConnection.disconnect();
        }
    }
}
