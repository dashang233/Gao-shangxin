package homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        boolean indian = arrayList.add(new News("新冠病例确诊千万，印度信徒赴恒河圣浴引民众担忧"));
        boolean man = arrayList.add(new News("捞鱼放生"));
        for (int i = arrayList.size()-1; i >= 0 ; i--) {
            News news = (News)arrayList.get(i);
            System.out.println(subTitle(news.getTitle()));
        }

    }
    public static String subTitle(String title){
        if (title == null){
            return "";
        }
        if(title.length()>15){
            return title.substring(0,15) + "...";
        }
        return title;
    }
}
class News{
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        if(title.length() > 15){
            return "title=" + title.substring(0,15) + "..."; //前闭后开
        }
        return "title=" + title ;
    }
}