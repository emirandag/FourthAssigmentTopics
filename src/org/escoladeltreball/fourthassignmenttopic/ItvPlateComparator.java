/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopic;

import java.util.Comparator;

/**
 * @author iaw26540084
 *
 */
public class ItvPlateComparator implements Comparator<Itv> {

	/**
	 * 
	 */
	public ItvPlateComparator() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Itv itv1, Itv itv2) {
		return itv1.getMatricula().compareTo(itv2.getMatricula());
	}

}
