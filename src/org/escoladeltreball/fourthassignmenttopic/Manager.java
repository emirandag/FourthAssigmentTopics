package org.escoladeltreball.fourthassignmenttopic;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

public interface Manager {

	public abstract Itv getNext() throws Exception;
	
	public abstract List<Itv> sort(Comparator<Itv> comparator) throws Exception;
	
	public abstract List<Itv> from(String lugar) throws Exception;
	
	/**
	 * This method returns a list of Itvs ranging from to fin
	 * @param ini Initial date
	 * @param fin Final date
	 * @return A list with Itv's in the range
	 * @throws Exception when empty
	 */
	public abstract List<Itv> from(LocalDateTime ini, LocalDateTime fin) throws Exception;
}
