package mx.com.bq.java.examples.e11.rx;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;

public class RxApp{
        
    private List<Integer> lista1;
    private List<Integer> lista2;
    
    public RxApp() {
        lista1 = new ArrayList<>();
        lista2 = new ArrayList<>();
        this.llenarListas();
    }
    
    public void llenarListas() {
        for(int i = 0; i < 1000; i++){
            lista1.add(i);
            lista2.add(i);
        }        
    }
    
    public void buscar() {
        Observable<Integer> obs1 = Observable.from(lista1);
        Observable<Integer> obs2 = Observable.from(lista2);
        
        /*
        Observable.merge(obs1, obs2).subscribe(new Action1<Integer>() {
            @Override
            public void call(Integer num){
                if(num == 100){
                    System.out.println(num);
                }
            }
            
        });
        */
        
        Observable.merge(obs1,obs2).filter(x->x==100).subscribe(System.out::println);
    }
    
    public static void main(String[] args) {
        /**
        List<String> lista = new ArrayList<>();
        lista.add("Juan");
        lista.add("Eduardo");
        lista.add("Ramiro");
        lista.add("Pedro");
        lista.add("Edeuterio");
        lista.add("Cornelio Reyna");
        
        Observable<String> obs = Observable.from(lista);
        obs.subscribe(new Action1<String>() {

		  @Override 
		  public void call(String elemento) {
		      System.out.println(elemento);
		  }
		  
        });
        */
        RxApp app = new RxApp();
        app.buscar();
    }
        
}