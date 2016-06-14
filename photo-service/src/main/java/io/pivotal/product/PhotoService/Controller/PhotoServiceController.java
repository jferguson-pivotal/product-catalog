package io.pivotal.product.PhotoService.Controller;

import java.util.List;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import io.pivotal.product.PhotoService.Model.PhotoService;
import io.pivotal.product.PhotoService.Stub.PhotoServiceStub;

@RestController
@RequestMapping("api/v1")
public class PhotoServiceController {
	
	@RequestMapping("/")
	public String Info(){
		return "Photo Service Version 1.0";
	}
	
	@RequestMapping(value = "/getphotos", method = RequestMethod.GET)
	@ResponseBody
	public List<PhotoService> list()
	{
		return PhotoServiceStub.list();
	}
	
	@RequestMapping(value = "/postphotourl", method = RequestMethod.POST)
	public PhotoService create(@RequestBody  PhotoService photo)
	{
		return PhotoServiceStub.create(photo);
		
		/* Sample POST JSON 
		 * @@@ Enable "Content-type : application/json" @@@
		 * {
		  "id": 4,
		  "name": "doggiewithball",
		  "desc": "doggie with Ball",
		  "url": "http://shareamazingpictures.com/wp-content/uploads/2012/12/Doggie-with-ball.jpg",
		   "urlversion": "1.0"
		}
		 */
	}
	
	
	@RequestMapping(value ="getphotourl/{id}",method = RequestMethod.GET)
	public PhotoService get(@PathVariable long id)	
	{
		return PhotoServiceStub.get(id);
	}
	
	@RequestMapping(value ="updatephotourl/{id}",method = RequestMethod.PUT)
	public PhotoService update(@PathVariable long id, @RequestBody PhotoService photoedit)
	{
		return PhotoServiceStub.update(id, photoedit);
	}
	@RequestMapping(value ="photourldelete/{id}",method = RequestMethod.DELETE)
	public PhotoService delete(@PathVariable long id)
	{
		return PhotoServiceStub.delete(id);
	}

}
