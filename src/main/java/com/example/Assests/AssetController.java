package com.example.Assests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController 
public class AssetController {
	

 
	
		@Autowired
		private AssestServices assetService;
		
		@GetMapping("/home")
		public String home() {
			return"home";
		}
		//get all the course
		@GetMapping("/assests")
		public List<Assets> getAllAssets(){
			return this.assetService.getAllAssets();
			
		}
		@GetMapping("/assets/{assetsId}")
		public Assets getAssets(@PathVariable String AssetsId) {
			return this.assetService.getAssets(Long.parseLong(AssetsId));
		}
		@PostMapping("/assets")
		public Assets addAssets(@RequestBody Assets assets) {
			return this.assetService.addAssets(assets);
		}
		@PutMapping("/assets")
		public Assets updateAssets(@RequestBody Assets assets) {
			return this.assetService.updateAssets(assets);
		}
		@DeleteMapping("/assets/{assetsId}")
		public  ResponseEntity<HttpStatus> removeAssets( @PathVariable String  AssetsId) {
			try {
				this.assetService.removeAssets(Long.parseLong(AssetsId));
				return new ResponseEntity<>(HttpStatus.OK);
			}
			catch(Exception e){
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
				
			}
			 
		
}



