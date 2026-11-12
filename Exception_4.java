//Добавьте в код предупреждение о проверяемом исключении в методе
//convertStringToUrl().
package exception;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;
public class Exception_4 {
public static void main(String[] args) throws MalformedURLException {
    try{
            System.out.println(convertStringToUrl("https://google.com"));

    }catch(Exception e){
        System.out.println("Некорректный URL: " + e.getMessage());

    }
}
public static URL convertStringToUrl(final String input) throws MalformedURLException, URISyntaxException {
    try{
    return new URI(input).toURL();
    }catch(URISyntaxException exp){
        throw new MalformedURLException(exp.getMessage());
    }
    
}
}
