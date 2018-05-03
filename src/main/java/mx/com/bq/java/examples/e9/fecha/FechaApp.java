package mx.com.bq.java.examples.e9.fecha;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class FechaApp {
    
    public void verificar(int version) {
        if(version == 7) {
            Calendar fecha1 = Calendar.getInstance();
            Calendar fecha2 = Calendar.getInstance();
            fecha1.set(1991, 0, 21);
            
            System.out.println( "Fecha: " + fecha1.after(fecha2) );
        } else if (version == 8){
            LocalDate fecha1 = LocalDate.of(1991, 01, 21);
            LocalDate fecha2 = LocalDate.now();
            
            System.out.println("After Date: " + fecha1.isAfter(fecha2));
            System.out.println("Before Date: " + fecha1.isBefore(fecha2));
            
            LocalTime tiempo1 = LocalTime.of(22, 30, 50);
            LocalTime tiempo2 = LocalTime.now();
            
            System.out.println("After Time: " + tiempo1.isAfter(tiempo2));
            System.out.println("Before Time: " + tiempo1.isBefore(tiempo2));
            
            LocalDateTime fechaTiempo1 = LocalDateTime.of(1991, 1, 21, 22, 30, 50);
            LocalDateTime fechaTiempo2 = LocalDateTime.now();
            
            System.out.println("After Date Time: " + fechaTiempo1.isAfter(fechaTiempo2));
            System.out.println("Before Date Time: " + fechaTiempo1.isBefore(fechaTiempo2));
        }
    }
    
    public void medirTiempo(int version) throws InterruptedException {
        if ( version == 7 ){
            long ini = System.currentTimeMillis();
            Thread.sleep(5000);
            long fin = System.currentTimeMillis();
            System.out.println("Tiempo trancurrido : "+ (fin - ini));
        } else if ( version == 8 ) {
            Instant ini = Instant.now();
            Thread.sleep(2500);
            Instant fin = Instant.now();
            System.out.println( Duration.between(ini, fin) );
            System.out.println( Duration.between(ini, fin).toMillis() );
            
        }
    }
    
    public void periodoEntreFechas(int version) {
        if( version == 7 ) {
            Calendar nacimiento = Calendar.getInstance();
            Calendar actual = Calendar.getInstance();
            
            nacimiento.set(1983, 2, 12);
            actual.set(2018, 2, 12);
            
            int anios = 0;
            
            while (nacimiento.before(actual)) {
                nacimiento.add(Calendar.YEAR, 1);
                if ( nacimiento.before(actual) ) {
                    anios++;
                }
            }
            System.out.println( "Años transcurridos: "+ anios );
            
        } else if ( version == 8 ) {
            LocalDate nacimiento = LocalDate.of(1983, 3, 12);
            LocalDate actual = LocalDate.now();
            
            Period periodo = Period.between(nacimiento, actual);
            
            System.out.println("Han transcurrido "+ periodo.getYears() + " años, "+
                periodo.getMonths() +" meses y "+ periodo.getDays() +" días desde "+ nacimiento +" hasta "+ actual );
        }
    }
    
    public void convertir( int version ) throws ParseException {
        if ( version == 7 ){
            String fecha = "1983-03-12";
            DateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaConvertida = formateador.parse(fecha);
            System.out.println(" String to Date: "+ fechaConvertida);
            
            Date fechaActual = Calendar.getInstance().getTime();
            formateador = new SimpleDateFormat("dd/MM/yyy hh:mm:ss a");
            String fechaString = formateador.format(fechaActual);
            System.out.println(" Date to String: "+ fechaString);
            
        } else if ( version == 8 ){
            String fecha = "1983/03/12";
            DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyy/MM/dd");
            LocalDate fechaLocal = LocalDate.parse(fecha, formateador);
            
            System.out.println(fechaLocal);
            System.out.println(formateador.format(fechaLocal));
        }
    }
    
    public static void main(String[] args) {
        FechaApp app = new FechaApp();
        
        try {
//            app.verificar(8);
//            app.medirTiempo(8);
//            app.periodoEntreFechas(8);
            app.convertir(8);
        } catch (Exception e) {
           System.out.println("Error : "+ e.getMessage());
        }
    }
}
