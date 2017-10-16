/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.time.LocalDateTime;

/**
 * @author iaw26540084
 *
 */
public class ItvManagerImpl extends ItvManager {

	/**
	 * @param itvFile
	 * @throws Exception
	 */
	public ItvManagerImpl(String itvFile) throws Exception {
		super(itvFile);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.fourthassignmenttopic.Manager#getNext()
	 */
	@Override
	public Itv getNext() throws Exception {
		LocalDateTime now = LocalDateTime.now();
		List<Itv> itvsSortedByDate = sort(new ItvDateComparator());
		for (Itv itv : itvsSortedByDate) {
			if (now.isBefore(itv.getFecha())) {
				return itv;
			}
		}
		
		return null;
	}

	
	@Override
	public List<Itv> sort(Comparator<Itv> comparator) throws Exception{
		List<Itv> itvsSorted = new ArrayList<>(itvs);
		Collections.sort(itvsSorted, comparator);
		return itvsSorted;
	}

	@Override
	public List<Itv> from(String lugar) throws Exception {
		List<Itv> ret = (List<Itv>) itvs.stream().filter(itv -> itv.getLugar().equals(lugar));
		return ret;
	}

	@Override
	/*public List<Itv> from(LocalDateTime ini, LocalDateTime fin) throws Exception {
		List<Itv> itvDateini = new ArrayList<>(itvs);
		
		return null;
	}*/
	
	public List<Itv> from(LocalDateTime ini, LocalDateTime fin) throws Exception {
		List <Itv> itvsRangeDate = new ArrayList<Itv>();
		List<Itv> itvsSortedByDate = sort(new ItvDateComparator());
		for (Itv itv : itvsSortedByDate) {
			if (itv.getFecha().isAfter(ini) && itv.getFecha().isBefore(fin)) {
				itvsRangeDate.add(itv);
			}
		}
		return itvsRangeDate;
}
	

	
}
