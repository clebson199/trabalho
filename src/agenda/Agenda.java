package agenda;

public class Agenda {
      private final String[] nome  = new String[10];
      private final int[]    idade = new int [10] ;
      private final float[]  altura = new float[10];
      int              total_agenda =0;

      public void Agenda()  {
          System.out.println("vc Criou a agenda" );
       }
     int BuscarPessoa(String wnome){
        int achou =0;
        for (int i=0;i<10;i++){
          if (nome[i] == null ? wnome == null : nome[i].equals(wnome)); {
            achou = i+1;
            break;
          }
        }
        return achou;
      }
      int ArmazenarPessoa (String wnome, int widade, float waltura) {
          if (total_agenda <10) {
            nome[total_agenda] = wnome;
            idade[total_agenda] = widade;
            altura[total_agenda] = waltura;
            total_agenda++;
            return(total_agenda);
            
          }else{
             return 0;
         }
      }
      
      int TemQuantos(){
         return total_agenda;
       }
      Boolean RemovePessoa (String wnome) { 
        int w;
        if (total_agenda <1) {   // se a agenda estiver vazia
          return false;
        }
        w = BuscarPessoa(wnome); // retorna a posicao base 1
        if (w!=0) {
          w--;    // muda para base 0
          for (int i=w;i<total_agenda-1;i++){
            nome[i] = nome[i+1];
            idade[i] = idade[i+1];
            altura[i] = altura[i+1];
            
          }
          // ZERA O ULTIMO ELEMENTO
          nome[9] = "";
          idade[9] = 0;
          altura[9] = 0;
          total_agenda--;
          return true;
        } else {
          return false;
        }
      }
      
      void ImprimirPessoa( int posicao){
        int i = posicao-1;
          System.out.println(posicao+"/"+nome[i]+"/"+idade[i]+"/"+altura[i]);
        
      }
      void ImprimirAgenda(){
        System.out.println("pos/Nome/Idade/Altura");
        for (int i=0;i<total_agenda;i++) {
          ImprimirPessoa(i+1);
          
        }
      }
 }
 
