package helper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LogHelper {

    /**
     * Преобразует параметр переменной длины в список.
     * @param logArgs - аргументы для передачи в лог
     * @return
     */
    public static List<Object> getArray(Object... logArgs) {
        return new ArrayList<>(Arrays.asList(logArgs));
    }

    /**
     * Метод подстановки значений в переданную строку в месте вхождений указанного символа.
     * @param log - форматируемая строка
     * @param symbol - заменяемый символ
     * @param logArgs - аргументы (значения) замены
     * @return
     */
    public static String getLog(String log, String symbol, Object... logArgs) {
        for (Object arg : logArgs) {
            log = log.replaceFirst(symbol, arg.toString());
        }
        return log;
    }

    /**
     * Метод подстановки значений параметров запроса в строку sql-запроса.
     * Заменяет символы "?" в строке sql-запроса переданными значениями согласно порядку следования.
     * @param log - строка sql-запроса
     * @param logArgs - значения запроса
     * @return
     */
    public static String getSqlLog(String log, Object... logArgs) {
        return getLog(log, "\\?", logArgs);
    }

}
