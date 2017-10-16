/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopic;

import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * @author iaw26540084
 *
 */
public abstract class ItvManager implements Manager {

	protected List<Itv> itvs;

	/**
	 * 
	 */
	public ItvManager(String itvFile) throws Exception {
		setup(itvFile);
	}

	private void setup(String itvFile) throws Exception {
		
		List<String> records = Files.readAllLines(Paths.get(itvFile));

		
		List<Itv> itvs =new ArrayList<>();
		
		for (String record: records) {
			String[] fields = record.split(",");
			long id = Long.parseLong(fields[0]);
			Itv itv = new Itv(id, fields[1], LocalDateTime.parse(fields[2], DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), fields[3]);
			itvs.add(itv);
	}
	
	/**
	 * retorna el següent vehicle en funció de la data i hora del sistema
	 * @return
	 * @throws Exception
	 */
	}
	
	

}
