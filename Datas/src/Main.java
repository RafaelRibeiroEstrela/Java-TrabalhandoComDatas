import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss a");
		
		
		LocalDate data = LocalDate.parse("10/10/1990", dateFormat);
		LocalDateTime hora = LocalDateTime.parse("10:00:00", timeFormat);
		
		
		System.out.println(data);
		System.out.println(hora.getHour());
		

	}

}
