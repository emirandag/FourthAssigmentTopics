/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopic;

import java.util.Comparator;
import java.util.List;

/**
 * @author iaw26540084
 *
 */
public class ItvDateComparator implements Comparator<Itv> {

	
	public int compare(Itv itv1, Itv itv2) {
		return itv1.getFecha().compareTo(itv2.getFecha());
		
	}
	
	

}
