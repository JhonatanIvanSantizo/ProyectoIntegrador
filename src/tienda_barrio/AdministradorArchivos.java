package tienda_barrio;
import exception.CargaDatosException;
import exception.GuardarDatosException;

import java.io.*;

public class AdministradorArchivos {
    public String leerArchivo(String archivo) throws CargaDatosException {
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String line;
            while ((line = reader.readLine()) != null) {
                contenido.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            throw new CargaDatosException(e.getMessage());
        } catch (IOException e) {
            throw new CargaDatosException(e.getMessage());
        }
        return contenido.toString();
    }
    public void escribirArchivo(String archivo, String contenido) throws GuardarDatosException {
        try {
            FileWriter fileWriter = new FileWriter(archivo);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(contenido);
            printWriter.close();
        } catch (IOException e) {
            throw new GuardarDatosException(e.getMessage());
        }
    }
}
