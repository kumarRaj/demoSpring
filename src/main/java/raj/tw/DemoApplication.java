package raj.tw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class DemoApplication {

    @RequestMapping(method = RequestMethod.GET, path = "/a")
    @ResponseBody
	String Home(){
		return "My first App";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/b")
	@ResponseBody
	EnumLearnStrings EnumsReturnStrings(){
		return EnumLearnStrings.A;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/c")
	@ResponseBody
	EnumLearnNumbers EnumsReturnNumbers(){
		return EnumLearnNumbers.A;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
