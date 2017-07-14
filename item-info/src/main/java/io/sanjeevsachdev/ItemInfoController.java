/**
 * 
 */
package io.sanjeevsachdev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sanjeev Sachdev
 *
 */
@RestController
public class ItemInfoController {
	
	@Autowired
	ItemService itemService; 
	
	@RequestMapping(method = RequestMethod.GET, value = "/item")
	public Item greeting(@RequestParam(value = "name", defaultValue = "World") String name) throws InterruptedException {		
		return itemService.getItem(1);
	}

}
