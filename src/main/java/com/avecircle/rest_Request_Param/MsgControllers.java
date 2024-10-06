package com.avecircle.rest_Request_Param;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgControllers {
	
	@GetMapping("/greets")
	public String getMsg(@RequestParam("name") String name)
	{
		String msg=name+", Good morning..!!!";
		
		return msg;
	}

}
