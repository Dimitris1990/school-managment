package my_Item_classes;

import java.time.LocalDate;

public class Course {
    
    String title;
    String stream;
    String type;
    LocalDate startDate;
    LocalDate endDate;

    public Course() {
    }

    public Course(String title, String stream, String type, LocalDate startDate, LocalDate endDate) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
    StringBuilder x = new StringBuilder("\b\b• Course:\n");

        x.append("Title      - ").append(title).append("\n");
        x.append("Stream     - ").append(stream).append("\n");
        x.append("Type       - ").append(type).append("\n");
        x.append("Start date - ").append(startDate).append("\n");
        x.append("End date   - ").append(endDate).append("\n");
        x.append("\n");
        
        return x.toString();    }
    
}
