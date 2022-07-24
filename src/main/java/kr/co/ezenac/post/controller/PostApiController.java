package kr.co.ezenac.post.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ezenac.post.dto.PostRequestDto;

@RestController
@RequestMapping("/api")
public class PostApiController {

	@PostMapping("/post")
	public void post(@RequestBody Map<String, Object> requestData) {
		
		requestData.entrySet().forEach(t -> {
			System.out.println("key : " +t.getKey());
			System.out.println("value : " +t.getValue());
		});
		
	}
	
	@PostMapping("/post2")
	public void post2(@RequestBody PostRequestDto requestData) {
		
		System.out.println(requestData);
		
	}
}
