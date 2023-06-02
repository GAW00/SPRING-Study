package com.lgy.spring_15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lgy.spring_15.domain.MemberVO;
import com.lgy.spring_15.domain.SampleVO;
import com.lgy.spring_15.domain.Ticket;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@RestController  // getSample.json 데이터로 다운로드
//@Controller  	   // getSample.jsp 를 찾음
@RequestMapping("/sample")
//@Log4j : 보안이슈 있음
@Slf4j // 로그 가독성, 권한 설정 가능
public class SampleController {
//	getSample.jsp 를 찾아감
	@GetMapping(value = "/getSample", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,
												  MediaType.APPLICATION_XML_VALUE})
	public SampleVO getSample() {
//		{"mno":112,"firstName":"스타","lastName":"로드"}
		return new SampleVO(112, "스타", "로드");
	}
	
	@GetMapping(value = "/getSample2", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,
												  MediaType.APPLICATION_XML_VALUE})
		public SampleVO getSample2() {
			return new SampleVO(113, "로켓", "라쿤");
	}
	
	@GetMapping(value = "/getText", produces = "text/plain; charset=UTF-8")
	public String getText() {
//		MIME TYPE : text/plain
		System.out.println("MIME TYPE : " + MediaType.TEXT_PLAIN_VALUE);
//		INFO : com.lgy.spring_15.SampleController - MIME TYPE : text/plain
		log.info("MIME TYPE : " + MediaType.TEXT_PLAIN_VALUE);
//		log4j.xml 파일의 Application Loggers의 logger -> level의 value 값을 debug로 바꿔야 나옴
//		<level value="debug"/>.value 운영서버에서 info 로 바꾸면 수많은 로그 출력 안됨
//		DEBUG: com.lgy.spring_15.SampleController - MIME TYPE : text/plain
		log.debug("MIME TYPE : " + MediaType.TEXT_PLAIN_VALUE);
//		뷰가 아니고 String 출력
		return "안녕하세요";
	}
	
	@GetMapping(value = "/getList")
	public List<SampleVO> getList(){
//		스트림, 람다식은 프로젝트 설정에서 java compiler 1.8로 변경
		return IntStream.range(1, 10).mapToObj(i->new SampleVO(i, i + "First", i + "Last"))
				.collect(Collectors.toList());
	}
	
	@GetMapping(value = "/getMap")
	public Map<String, SampleVO> getMap(){
		Map<String, SampleVO> map = new HashMap<String, SampleVO>();
		map.put("First", new SampleVO(111, "그루트", "주니어"));
		return map;
	}
	
//	http://localhost:8181/spring_15/sample/check?height=150&weight=40 일때는 정상
//	http://localhost:8181/spring_15/sample/check?height=140&weight=40 일때는 브라우저 콘솔에서 오류
//	ResponseEntity : 데이터 + http 상태코드를 전달
	@GetMapping(value = "/check", params = {"height", "weight"})
	public ResponseEntity<SampleVO> check(Double height, Double weight){
		SampleVO vo = new SampleVO(0, "" + height, "" + weight);
		ResponseEntity<SampleVO> result = null;
		
		if (height < 150) {
//			HttpStatus.BAD_GATEWAY : http 오류 상태
			result = ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(vo);
		} else {
//			HttpStatus.BAD_OK : http 정상 상태
			result = ResponseEntity.status(HttpStatus.OK).body(vo);
		}
		
		return result;
	}
	
//	http://localhost:8181/spring_15/sample/product/bags/1234
	@GetMapping("/product/{cat}/{pid}")
	public String[] getPath(@PathVariable("cat") String cat, @PathVariable("pid") int pid) {
		return new String[] {"category : " + cat, "productid : " + pid};
	}
	
	@PostMapping("/ticket")
//	public Ticket convert(Ticket ticket) {
//	@RequestBody : json 데이터를 받을 수 있음
	public Ticket convert(@RequestBody Ticket ticket) {
		log.debug("@# ticket ===> " + ticket);
		return ticket;
	}
	
	@PostMapping("/info")
	public MemberVO convert(@RequestBody MemberVO vo) {
		log.debug("@# vo ===> " + vo);
		return vo;
	}
	
}
