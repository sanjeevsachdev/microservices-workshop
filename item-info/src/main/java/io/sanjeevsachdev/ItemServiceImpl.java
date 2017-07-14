/**
 * 
 */
package io.sanjeevsachdev;

import org.springframework.stereotype.Service;

import com.netflix.ribbon.proxy.annotation.Hystrix;

/**
 * @author Sanjeev Sachdev
 *
 */
@Service
public class ItemServiceImpl implements ItemService {
	
	@Override
	public Item getItem(long id) throws InterruptedException {
		Thread.sleep(1000);
		if (true) {
			throw new RuntimeException();
		}
		return null;
	}

}