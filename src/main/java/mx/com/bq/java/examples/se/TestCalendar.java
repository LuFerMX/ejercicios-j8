package mx.com.bq.java.examples.se;

import java.util.Date;
import java.text.SimpleDateFormat;

public class TestCalendar {
    
    public static final long MILISECONDS_PER_DAY = 86400000;
    
    public static void main(String[] args) {
        long fechaMaxDedupEnDias = 0L;
        long dias = 0L;
        long diasDif = 0L;
        Date detailAnterior;
        Date detail;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        try {
            // 2018-01-19 09:44:27.0 
            detailAnterior = formatter.parse("13/02/2018 13:15:33");  // Fri Feb 09 14:00:43 CST 2018
            // 2018-02-13 13:15:33.0
            detail = formatter.parse("19/01/2018 09:44:27");  // Thu Jan 18 11:52:41 CST 2018

            fechaMaxDedupEnDias = detailAnterior.getTime() / MILISECONDS_PER_DAY + 1;
            dias = detail.getTime() / MILISECONDS_PER_DAY;
            
            System.out.println("Dia 1 :" + detail.getTime());
            System.out.println("Dia 2 :" + detailAnterior.getTime());
            
            System.out.println("dias: "+ dias +" > fechaMaxDedupEnDias: "+ fechaMaxDedupEnDias +" = "+ (dias > fechaMaxDedupEnDias ) );
            
            diasDif = (detail.getTime() - detailAnterior.getTime()) / MILISECONDS_PER_DAY;
            
            System.out.println("Diff :" + (detail.getTime() - detailAnterior.getTime())  );
            
            System.out.println("diasdif: "+ diasDif + "=|" + Math.abs(diasDif));
            
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
