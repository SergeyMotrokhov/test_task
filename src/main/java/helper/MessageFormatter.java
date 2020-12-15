package helper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static org.slf4j.helpers.MessageFormatter.arrayFormat;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class MessageFormatter {

    public static String format(String message, Object... args) {
        return arrayFormat(message, args).getMessage();
    }
}