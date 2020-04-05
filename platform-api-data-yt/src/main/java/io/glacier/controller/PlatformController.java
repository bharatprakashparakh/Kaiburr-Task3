package io.glacier.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.glacier.exception.ServiceException;
import io.glacier.model.*;
import io.glacier.repository.PlatformRepository;
import io.glacier.exception.*;

@RestController
public class PlatformController {
    @Autowired
   	private PlatformRepository platformRepository;

	//@RequestMapping("/platforms")
    @GetMapping("/platforms")
    public List<Platform> getAllPlatforms()
    {
    	return platformRepository.findAll();
    }
    
	
	
	//@RequestMapping("/platforms/{id}")
    @GetMapping("/platforms/{id}")

    public Platform getTopic(@PathVariable int id) throws ServiceException
	{
	
    
	     Platform p=null;
    	 try {
             Optional<Platform> optinalEntity =  platformRepository.findById(id);
        	   p = optinalEntity.get();
 
    	 }
    	 catch(Exception e) {
    		throw new ServiceException("platform not found"); 
    	 }
    	 
    	 return p;
    	 
    	/* if(p.equals(null))
    		 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	 else
     	    return new ResponseEntity<>(p,HttpStatus.OK);*/

	}
    
    
    //when name in path
   
    
    
    
    //@RequestMapping(method = RequestMethod.POST,value = "/platforms")
    @PostMapping("/platforms")
    public String addPlatform(@RequestBody Platform platform)
    {
    	platformRepository.save(platform);
    	return "Created Platform id: "+ platform.getId();
    }
    
    //@RequestMapping(method = RequestMethod.DELETE,value = "/platforms/{id}")
    @DeleteMapping("/platforms/{id}")
    public String deletePlatform(@PathVariable int id)
  	{
  	
       platformRepository.deleteById(id);
       return "Book deleted having id: "+ id;
  	}
    //@RequestMapping(method = RequestMethod.PUT,value = "/platforms/{id}")
    @PutMapping("/platforms/{id}")
    public void updatePlatform(@RequestBody Platform platform,@PathVariable int id)
	{
		platformRepository.save(platform);
		
	}


}
