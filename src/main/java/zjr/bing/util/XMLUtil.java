package zjr.bing.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import zjr.bing.entity.ImageEntity;

import java.net.MalformedURLException;
import java.net.URL;

public class XMLUtil {

    public static Document parse(String xmlUrl) {
        Document document = null;
        try {
            URL url = new URL(xmlUrl);
            SAXReader reader = new SAXReader();
            document = reader.read(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return document;
    }

    public static ImageEntity getImageEntity(Document document) {
        ImageEntity imageEntity = new ImageEntity();
        Node urlNode = document.selectSingleNode("/images/image/url");
        String url =urlNode.getText();
        Node copyrightNode = document.selectSingleNode("/images/image/copyright");
        imageEntity.setImageCopyright(copyrightNode.getText());
        imageEntity.setImageName(url.substring(11,url.indexOf(".jpg")));
        imageEntity.setImageUrl("http://s.cn.bing.net"+url);
        return imageEntity;
    }

}
