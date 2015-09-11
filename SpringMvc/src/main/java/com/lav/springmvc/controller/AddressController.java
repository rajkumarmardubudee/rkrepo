package com.lav.springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lav.springmvc.dto.AddressDTO;

@Controller
@RequestMapping("/services")
// We can use @RequestMapping as well for base
public class AddressController {

	// POST method
	// access this url http://localhost:8080/springmvc/services/address
	// and pass address object as json from firefox rest client
	// and choose method as POST
	// and header as Content_type = application/json
	@RequestMapping(value = "/address", method = RequestMethod.POST)
	@ResponseBody
	public HttpStatus create(@RequestBody AddressDTO addressDTO) {

		System.out.println(addressDTO);

		// Call Address service here

		return HttpStatus.OK;
	}

	// PUT method
	// access this url
	// http://localhost:8080/springmvc/services/address/123455/lavanya
	// and pass address object as json from firefox rest client
	// and choose method as PUT
	// and header as Content_type = application/json
	@RequestMapping(value = "/address/{id}/{name}", method = RequestMethod.PUT)
	@ResponseBody
	public HttpStatus update(@PathVariable String id, @PathVariable String name) {
		System.out.println(id);
		System.out.println(name);
		// Call Address service here
		if (name.equals("lavanya")) {
			return HttpStatus.OK;
		}

		return HttpStatus.BAD_REQUEST;
	}

	// GET method
	// access this url http://localhost:8080/springmvc/services/address/lavanya
	// and pass address object as json from firefox rest client
	// and choose method as GET
	// and header as Content_type = application/json
	@RequestMapping(value = "/address/{name}", method = RequestMethod.GET)
	@ResponseBody
	public AddressDTO get(@PathVariable String name) {
		System.out.println(name);
		// Call Address service here
		if (name.equals("lavanya")) {

			AddressDTO address = new AddressDTO();
			address.setName("Lavanya");
			address.setCity("Silam");
			address.setVillage("Rasipuram");
			address.setCountry("India");

			return address;
		}
		return null;
	}

	// GET method
	// access this url http://localhost:8080/springmvc/services/address/rasipuram?name=lavanya
	// and pass address object as json from firefox rest client
	// and choose method as GET
	// and header as Content_type = application/json
	@RequestMapping(value = "/address/{town}/{village}", method = RequestMethod.GET)
	@ResponseBody
	public AddressDTO getByUsingRequestParam(@PathVariable String town, @PathVariable String village, @RequestParam String name) {
		System.out.println("getByUsingRequestParam()    "+village);
		System.out.println("getByUsingRequestParam()    "+town);
		System.out.println("getByUsingRequestParam()    "+name);
		// Call Address service here
		if (name.equals("lavanya")) {

			AddressDTO address = new AddressDTO();
			address.setName("Lavanya");
			address.setCity("Silam");
			address.setVillage("Rasipuram");
			address.setCountry("India");

			return address;
		}
		return null;
	}

	// DELETE method
	// access this url http://localhost:8080/springmvc/services/address/123456
	// and pass address object as json from firefox rest client
	// and choose method as DELETE
	// and header as Content_type = application/json
	/**
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "address/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public HttpStatus remove(@PathVariable String id) {
		System.out.println(id);
		// Call Address service here
		if (id.equals("123456")) {
			return HttpStatus.OK;
		}
		return HttpStatus.BAD_REQUEST;
	}

}
