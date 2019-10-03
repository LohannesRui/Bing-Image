package zjr.bing;

import org.dom4j.Document;
import zjr.bing.entity.ImageEntity;
import zjr.bing.util.HttpUtil;
import zjr.bing.util.XMLUtil;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
            System.getProperty("user.dir")：获取当前项目路径，例：D:\Projects\SoftwareProducts\Bing-Image

            File.separator：获取当前系统目录的分隔符

            例：D:\Projects\SoftwareProducts\Bing-Image\images\
         */
        String folder = System.getProperty("user.dir")+File.separator+"images"+File.separator;
        File file = new File(folder);
        if (!file.exists()) {
            file.mkdir();
        }

        Document document = XMLUtil.parse("https://cn.bing.com/HPImageArchive.aspx?format=xml&idx=0&n=1");
        ImageEntity imageEntity = XMLUtil.getImageEntity(document);
        imageEntity.setImageFileAddress(folder + imageEntity.getImageName() + ".jpg");
        HttpUtil.download(imageEntity);
    }
}
