package DAY2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetSToTodayEnd {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String nowStr = dateFormat.format(new Date());

        String endStr = nowStr.substring(0,nowStr.indexOf(" ")) + " 23:59:59";

        System.out.println("相差的秒数："+((dateFormat.parse(endStr).getTime() - dateFormat.parse(nowStr).getTime()) / 1000));
    }
}


