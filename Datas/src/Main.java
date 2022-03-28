import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		
		
		LocalDate data = LocalDate.parse("10/10/1990", dateFormat);
		LocalTime hora = LocalTime.parse("08:10:10", timeFormat);
		LocalDateTime dataHora = LocalDateTime.parse("10/10/1990 10:00:00", dateTimeFormat);
		
		
		long diferencaEmAnos = ChronoUnit.YEARS.between(data, LocalDate.now());
		
		
		System.out.println(data);
		System.out.println(hora);
		System.out.println(dataHora);
		
		System.out.println(diferencaEmAnos);
		

	}

}
