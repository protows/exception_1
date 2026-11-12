//Объединение исключений с одинаковым выводом
//Часто требуется совместить два типа исключений, если инструкции для них являются
//одинаковыми. Сделать это можно в блоке catch с помощью символа | (называется
//"вертикальная черта" или "пайп").
package exception;
import java.util.ArrayList;
import java.lang.UnsupportedOperationException;
public class Exception3 {
public static void main(String[] args) {
    try {
        new ArrayList<String>().add("1");
    } catch (UnsupportedOperationException | IllegalArgumentException exception) {
        System.out.println("Возникла ошибка, свяжитесь с нами!");
    }
}
}
