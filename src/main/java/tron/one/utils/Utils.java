package tron.one.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Utils {

    public String formatDate(Date date, Locale locale) {
        if (date == null) {
            return null;
        }

        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        if (locale != null && !Locale.GERMAN.getLanguage().equals(locale.getLanguage())) {
            df = new SimpleDateFormat("MM/dd/yyyy");
        }
        return df.format(date);
    }
}
