package AtividadeCep;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Cep {
  public static void main (String[] args) {
      String cep= "73807615";
      String url="https://viacep.com.br/ws/" +cep+"/json/";
    try {
        HttpClient client = HttpClient.newHttpClient();
        
        HttpRequest request = (HttpRequest) HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
          
HttpResponse<String> response = client.send(
        request,HttpResponse.BodyHandlers.ofString()
        
        );
System.out.println(response.body());

     
    }catch (Exception e){
    System.out.println("Cep invalido!!!"+e.getMessage());    
        
   System.out.printf("Wilgner Mateus silfer - 0025265");        
        
    }
      
  }
}
