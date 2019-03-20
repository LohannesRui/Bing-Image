package zjr.bing.entity;

public class ImageEntity {

    /**
     * 图片名称
     */
    private String imageName;

    /**
     * 图片下载地址
     */
    private String imageUrl;

    /**
     * 图片介绍
     */
    private String imageCopyright;

    /**
     * 图片存放地址
     */
    private String imageFileAddress;


    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageCopyright() {
        return imageCopyright;
    }

    public void setImageCopyright(String imageCopyright) {
        this.imageCopyright = imageCopyright;
    }

    public String getImageFileAddress() {
        return imageFileAddress;
    }

    public void setImageFileAddress(String imageFileAddress) {
        this.imageFileAddress = imageFileAddress;
    }

    @Override
    public String toString() {
        return "ImageEntity{" +
                "imageName='" + imageName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", imageCopyright='" + imageCopyright + '\'' +
                ", imageFileAddress='" + imageFileAddress + '\'' +
                '}';
    }
}
