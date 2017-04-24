package Module_8;

import java.util.UUID;

/**
 * Created by Z570 on 24.04.2017.
 */
public final class IdGenerator {
    private IdGenerator() {
    }
    // Generate of ID
    public static String generateID () {
        UUID uniqueKey = UUID.randomUUID();
        return uniqueKey.toString();
    }
}
