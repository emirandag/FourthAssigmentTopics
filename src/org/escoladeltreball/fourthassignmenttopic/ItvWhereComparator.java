/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopic;

import java.util.Comparator;

/**
 * @author iaw26540084
 *
 */
public class ItvWhereComparator implements Comparator<Itv> {

	/**
	 * 
	 */
	public ItvWhereComparator() {
		// TODO Auto-generated constructor stub
	}
	
	public int compare(Itv itv1, Itv itv2) {
		return itv1.getLugar().compareTo(itv2.getLugar());
		
	}

}
