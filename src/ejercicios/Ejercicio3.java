package ejercicios;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		Path ruta = Paths.get("C:\\temp\\Nombres.txt");
		Files.write(ruta, "Florencia\nOlivia\nJoaqu�n\nMat�as\nPedro\nChristian\nBel�n\nCecilia\nDelfina\nLuciano\nMart�n".getBytes());	

		List < String > ContenidoArchivo = Files.readAllLines(ruta, StandardCharsets.UTF_8);
		ContenidoArchivo.forEach(line -> System.out.println(line));
	}
}
