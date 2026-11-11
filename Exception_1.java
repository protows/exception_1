package exception;
//Добавьте обработку исключений при преобразовании строки в URL в метод
//parseStringToURI(). При ошибке возвращайте значение null.
import java.net.URI;
import java.net.URISyntaxException;
public class Exception_1 {
public static void main(String[] args) {
System.out.println(parseStringToURI2(null));
System.out.println(parseStringToURI("https://google.com"));
System.out.println(parseStringToURI("\\\\"));
System.out.println(parseStringToURI(null));

}
public static URI parseStringToURI(final String input) {
        try{
            return new URI(input);
        }catch(Throwable exception){
              System.out.println("exception: " + exception);
              return null;
        }
}


public static URI parseStringToURI2(final String input) {
        try{
            return new URI(input);
        }catch(NullPointerException | URISyntaxException exception){
           System.out.println("exception: " + exception);
           return null;
       }
}
}
        


