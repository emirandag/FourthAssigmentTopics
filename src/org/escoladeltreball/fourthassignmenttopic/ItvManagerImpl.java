/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopic;

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
		
		return null;
	}


	
}
