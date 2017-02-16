package com.example.alroo7.codetest;

/**
 * Created by alroo7 on 2/16/17.
 */

public class ListItem {
    private String head;
    private String citys;
    private String desc;
    /**
     * نعرف هنا كل شي ابيه في الكارد.
     */

    public ListItem(String head, String citys, String desc ) {
        this.head = head;
        this.citys = citys;
        this.desc = desc;
/**
 * بالترتيب حسب مو ظاهر عندي
 */

    }

    public String getHead() {
        return head;
    }
    public String getCitys() { return citys; }



    public String getDesc() {
        return desc;
    }


}
