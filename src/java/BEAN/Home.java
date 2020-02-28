/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;

/**
 *
 * @author Vann
 */
public class Home {
    private String AdminId;
    private String HomeId;
    private String HomeMainPic;
    private String HomeTitle;
    private String HomeContent;
    private String HomePic;

    public Home(String AdminId, String HomeId, String HomeMainPic, String HomeTitle, String HomeContent, String HomePic) {
        this.AdminId = AdminId;
        this.HomeId = HomeId;
        this.HomeMainPic = HomeMainPic;
        this.HomeTitle = HomeTitle;
        this.HomeContent = HomeContent;
        this.HomePic = HomePic;
    }

    public Home() {
    }

    public String getAdminId() {
        return AdminId;
    }

    public void setAdminId(String AdminId) {
        this.AdminId = AdminId;
    }

    public String getHomeId() {
        return HomeId;
    }

    public void setHomeId(String HomeId) {
        this.HomeId = HomeId;
    }

    public String getHomeMainPic() {
        return HomeMainPic;
    }

    public void setHomeMainPic(String HomeMainPic) {
        this.HomeMainPic = HomeMainPic;
    }

    public String getHomeTitle() {
        return HomeTitle;
    }

    public void setHomeTitle(String HomeTitle) {
        this.HomeTitle = HomeTitle;
    }

    public String getHomeContent() {
        return HomeContent;
    }

    public void setHomeContent(String HomeContent) {
        this.HomeContent = HomeContent;
    }

    public String getHomePic() {
        return HomePic;
    }

    public void setHomePic(String HomePic) {
        this.HomePic = HomePic;
    }

    @Override
    public String toString() {
        return "Home{" + "AdminId=" + AdminId + ", HomeId=" + HomeId + ", HomeMainPic=" + HomeMainPic + ", HomeTitle=" + HomeTitle + ", HomeContent=" + HomeContent + ", HomePic=" + HomePic + '}';
    }
    
    
}
