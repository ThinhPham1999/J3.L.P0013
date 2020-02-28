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
public class Menu {
    private String AdminId;
    private String MenuId;
    private String MenuTitle;
    private String MenuContent;
    private String MenuPrice;

    public Menu() {
    }

    public Menu(String AdminId, String MenuId, String MenuTitle, String MenuContent, String MenuPrice) {
        this.AdminId = AdminId;
        this.MenuId = MenuId;
        this.MenuTitle = MenuTitle;
        this.MenuContent = MenuContent;
        this.MenuPrice = MenuPrice;
    }
    
    
    public String getAdminId() {
        return AdminId;
    }

    public void setAdminId(String AdminId) {
        this.AdminId = AdminId;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String MenuId) {
        this.MenuId = MenuId;
    }

    public String getMenuTitle() {
        return MenuTitle;
    }

    public void setMenuTitle(String MenuTitle) {
        this.MenuTitle = MenuTitle;
    }

    public String getMenuContent() {
        return MenuContent;
    }

    public void setMenuContent(String MenuContent) {
        this.MenuContent = MenuContent;
    }

    public String getMenuPrice() {
        return MenuPrice;
    }

    public void setMenuPrice(String MenuPrice) {
        this.MenuPrice = MenuPrice;
    }

    @Override
    public String toString() {
        return "Menu{" + "AdminId=" + AdminId + ", MenuId=" + MenuId + ", MenuTitle=" + MenuTitle + ", MenuContent=" + MenuContent + ", MenuPrice=" + MenuPrice + '}';
    }
    
    
}
