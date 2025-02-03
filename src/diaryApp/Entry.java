package diaryApp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Entry {
    private int id;
    private String title;
    private String content;
    private Date date;

    public Entry(int id,String title, String content, String dateStr) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("title cannot be null or empty");
        }
        if (id < 0) {
            throw new IllegalArgumentException("id cannot be negative");
        }
        if ( dateStr == null || dateStr.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = parseDate(dateStr);
    }

    private Date parseDate(String dateStr) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try {
            return dateFormat.parse(dateStr);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Date format is invalid. Expected format: dd/MM/yyyy");
        }
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getDate() {
        return date;
    }
}
