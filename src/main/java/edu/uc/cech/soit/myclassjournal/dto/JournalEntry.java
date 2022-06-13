package edu.uc.cech.soit.myclassjournal.dto;
import lombok.Data;

@Data
public class JournalEntry {
    String jNotes;
    String jDate;
    public void setNotes(String notes) {
        jNotes = notes;
    }

    public void setDate(String date) {
        jDate = date;
    }

    public String getNotes() {
        return jNotes;
    }

    public String getDate() {
        return jDate;
    }
}
