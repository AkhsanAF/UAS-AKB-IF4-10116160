package com.akhsanaf.uasakb4.view.viewPager;
/* Tanggal Pengerjaan
 *  13 Agustus 2019
 *
 * Akhsan Andara F
 *  10116160
 *  IF-4
 *  */

public class ScreenItem {
    private String Title;
    private String Description;
    private int ScreenImg;

    public ScreenItem(String title, String description, int screenImg){
        Title = title;
        Description = description;
        ScreenImg = screenImg;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }
}
