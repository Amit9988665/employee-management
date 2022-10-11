package com.in2it.feigncontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in2it.feignutil.FeignService;
import com.in2it.feignutil.FeignServiceUtil;
import com.in2it.model.Employee;
import com.in2it.model.GetedData;
import com.in2it.model.LeadCapturing;
import com.in2it.model.LeadConfirmed;
import com.in2it.model.LeadPending;
import com.in2it.model.LeadProgressed;

@RestController
public class FeingClientController {

	@Autowired
	FeignServiceUtil feignServiceUtil;

	@Autowired
	FeignService feignService;

	ArrayList<GetedData> getedData = new ArrayList<>();
	GetedData getedData1 = new GetedData();

	String list;
	Integer idList;
	String valueString;

	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmpList() {
		return feignServiceUtil.getEmployeeList();
	}

	@PostMapping("/save")
	public String savEmployee(@RequestBody Employee employee) {
		feignServiceUtil.savEmployee(employee);
		return "Save Sucessfully";
	}

	@GetMapping("/getById/{eid}")
	public Optional<Employee> getByEmployeeId(@PathVariable("eid") int eid) {
		return feignServiceUtil.getEmployeeById(eid);
	}

	@GetMapping("/getdropdown")
	public ResponseEntity<GetedData> getdropdown() {
		ArrayList<ArrayList<Object>> objlist = feignServiceUtil.getDropdown();
		ArrayList<LeadProgressed> leadProgressedList = new ArrayList<>();
		ArrayList<LeadPending> leadPendingList = new ArrayList<>();
		ArrayList<LeadConfirmed> leadConfirmedList = new ArrayList<>();
		ArrayList<LeadCapturing> leadCapturingList = new ArrayList<>();
		LeadProgressed leadProgressed = new LeadProgressed();
		LeadConfirmed leadConfirmed = new LeadConfirmed();
		LeadPending leadPending = new LeadPending();
		LeadCapturing leadCapturing = new LeadCapturing();

		objlist.forEach(e -> {
			list = e.get(0).toString();
			idList = (Integer) e.get(1);
			valueString = e.get(2).toString();

			if (list.equals("Lead progressed")) {
				leadProgressed.setId(idList);
				leadProgressed.setValue(valueString);
				leadProgressedList.add(leadProgressed);
			} else if (list.equals("Lead Pending")) {
				leadPending.setId(idList);
				leadPending.setValue(valueString);
				leadPendingList.add(leadPending);
			} else if (list.equals("Lead Confirmed")) {
				leadConfirmed.setId(idList);
				leadConfirmed.setValue(valueString);
				leadConfirmedList.add(leadConfirmed);
			} else {
				leadCapturing.setId(idList);
				leadCapturing.setValue(valueString);
				leadCapturingList.add(leadCapturing);
			}
		});
		getedData1.setLeadProgressed(leadProgressedList);
		getedData.add(getedData1);
		getedData1.setLeadPending(leadPendingList);
		getedData.add(getedData1);
		getedData1.setLeadConfirmeds(leadConfirmedList);
		getedData.add(getedData1);
		getedData1.setLeadCapturings(leadCapturingList);
		getedData.add(getedData1);
		return ResponseEntity.ok(getedData1);
	}
}
