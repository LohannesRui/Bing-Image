# Bing-Image
Bing每日壁纸下载

## 获取Api

必应壁纸Api：https://cn.bing.com/HPImageArchive.aspx?format=xml&idx=0&n=1&mkt=zh-CN

|参数名称|值含义|
| ---- | ---- |
|format| js：返回json格式；xml：返回xml格式 |
|idx| 0：今天；-1：明天；1：昨天（类推，最多获取到7天前的图片） |
|n| 1-8 返回请求数量，目前最多一次获取8张 |
|mkt| 地区：zh-CN... |

通过Api获取到图片信息
```XML
<images> 
  <image> 
    <startdate>20190319</startdate>  
    <fullstartdate>201903190900</fullstartdate>  
    <enddate>20190320</enddate>  
    <url>/th?id=OHR.EarlyBloomer_ZH-CN1044452089_1920x1080.jpg&rf=NorthMale_1920x1080.jpg&pid=hp</url>  
    <urlBase>/th?id=OHR.EarlyBloomer_ZH-CN1044452089</urlBase>  
    <copyright>番红花 (© Lorianne Ende/Getty Images)</copyright>  
    <copyrightlink>http://www.bing.com/search?q=%E7%95%AA%E7%BA%A2%E8%8A%B1&form=hpcapt&mkt=zh-cn</copyrightlink>  
    <headline/>  
    <drk>1</drk>  
    <top>1</top>  
    <bot>1</bot>  
    <hotspots/> 
  </image>  
  <tooltips> 
    <loadMessage> 
      <message>正在加载...</message> 
    </loadMessage>  
    <previousImage> 
      <text>上一个图像</text> 
    </previousImage>  
    <nextImage> 
      <text>下一个图像</text> 
    </nextImage>  
    <play> 
      <text>播放视频</text> 
    </play>  
    <pause> 
      <text>暂停视频</text> 
    </pause> 
  </tooltips> 
</images>
```
http://s.cn.bing.net 加 url信息就可以获取到图片。

## 运行代码

将源代码打成jar文件之后运行：javaw -jar bingImage.jar

D:\bing文件夹下有下载好的图片。