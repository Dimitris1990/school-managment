package my_Item_classes;

import java.time.LocalDate;

public class Assignment {
    
    String title;
    String description;
    LocalDate subDateTime;
    int totalMark;

    public Assignment() {
    }

    public Assignment(String title, String description, LocalDate subDateTime, int totalMark) {
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
        this.totalMark = totalMark;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(LocalDate subDateTime) {
        this.subDateTime = subDateTime;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        StringBuilder x = new StringBuilder("\b\b• Assignment:\n");

        x.append("Ttle           - ").append(title).append("\n");
        x.append("Description    - ").append(description).append("\n");
        x.append("Submition date - ").append(subDateTime).append("\n");
        x.append("Total mark     - ").append(totalMark).append("\n");
        x.append("\n");
        
        return x.toString();
    }
   
}
