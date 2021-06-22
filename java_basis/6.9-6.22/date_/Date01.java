package date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        Date date1 = new Date(12333);
        System.out.println(date1);
        //创建SimpleDateFormat对象并指定格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String s1 = simpleDateFormat.format(date);
        System.out.println(s1);

        String s2 = "2021年06月18日 11:57:20 星期五";
        Date d2 = simpleDateFormat.parse(s2);
        System.out.println(simpleDateFormat.format(d2));
    }
}
