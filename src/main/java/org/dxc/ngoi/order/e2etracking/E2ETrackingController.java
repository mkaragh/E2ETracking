package org.dxc.ngoi.order.e2etracking;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController    // This means that this class is a Controller
@RequestMapping(path="/") 
public class E2ETrackingController {
	
	@Autowired
	private E2ETrackingRepository e2eTrackingRepository;

	
	@PostMapping(path="/MsgAction") // Map ONLY POST Requests
	public ResponseEntity<Object> addNewMsgAction (@RequestBody MsgAction msgAction) {	
	
		MsgAction msgActionUpdated= e2eTrackingRepository.save(msgAction);
		return ResponseEntity.created(null).build();
	}
	
	

}
