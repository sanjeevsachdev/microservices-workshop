/**
 * 
 */
package io.sanjeevsachdev;

/**
 * @author Sanjeev Sachdev
 *
 */
public interface ItemService {
	
	Item getItem(long id) throws InterruptedException;

}