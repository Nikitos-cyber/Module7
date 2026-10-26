package Exception;

import org.module.essence.Read;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String [] args){
        Record record = new Record(RecordType.INCOME, 12000,"Аванс", LocalDate.of(2026,8,23));
        System.out.println(record.getRecord());
    }
}

 class Record {
    private double amount;
    private String category;
    private LocalDate localDate;
    private RecordType type;
    public Record(RecordType type, double amount, String category, LocalDate localDate){
        this.type = type;
        this.amount = amount;
        this.category = category;
        this.localDate = localDate;
    }

    public String getRecord(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        StringBuilder str = new StringBuilder();
        str.append(type == RecordType.INCOME ? "Доход" : "Расход").append(" ")
                .append(amount).append(" ").append(category).append(" ")
                .append(localDate.format(formatter));
        return str.toString();
    }

}

enum RecordType {
    INCOME,EXPENSE
}
