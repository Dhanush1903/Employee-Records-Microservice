package com.rec.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rec.entity.Record;
@Service
public class RecordServiceImpl implements IRecordService {

	//dummy list of records
	List<Record> list= List.of(
			new Record(1L,"Tata@gmail.com","Tata Motors",1234L),
			new Record(2L,"Mahindra","Mahindra Motors",1234L),
			new Record(3L,"cts.com","cts ",1235L),
			new Record(4L,"TCS@gmail.com","TCS",1235L),
			new Record(5L,"LT.com","L&T",1236L),
			new Record(6L,"Boat","boat",1237L),
			new Record(7L,"Infosys.com","Infosys",1238L),
			new Record(8L,"HJ@gmail.com","Hj",1239L),
			new Record(9L,"Redbull@gmail.com","Red Bull",1230L),
			new Record(10L,"Mercedes@gmail.com","Mercedes",1231L));
	
	
	
	
	
	
	@Override
	public List<Record> getRecordOfEmployee(Long eId) {
		// TODO Auto-generated method stub
		return list.stream().filter(record-> record.geteId().equals(eId)).collect(Collectors.toList());
	}

}
