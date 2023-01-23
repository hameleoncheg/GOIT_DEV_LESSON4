import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.stream.Collectors;

public class DatabaseInitService {
    public static void main(String[] args) throws SQLException {

        String filePath = "sql/init_db.sql";

        String content = null;
        try {
            content = readFile(filePath, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Database database = Database.getInstance();
        database.executeUpdate(content);
        database.close();
    }


    public static String readFile(String path, Charset encoding) throws IOException {
        String content = Files.lines(Paths.get(path), encoding)
                .collect(Collectors.joining(System.lineSeparator()));
        return content;
    }
}

