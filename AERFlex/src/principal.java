
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author saray
 */
public class principal {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File archivo = new File("./miPrograma.txt");
        FileReader fr = new FileReader(archivo);
        Yylex verificar = new Yylex(fr);
        verificar.next_token();
    }

}
