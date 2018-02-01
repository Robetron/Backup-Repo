package com.psl.tests;

import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

import org.junit.BeforeClass;
import org.junit.Test;

import com.psl.dao.TrainingDetailsDao;
import com.psl.entity.TrainingDetails;

public class TrainingDetailsTest extends TestCase{
	private static TrainingDetailsDao trainingDetailsDao = null;
	private static TrainingDetails trainingDetails1 = null,
			trainingDetails2 = null;

	@BeforeClass
	public void setUp() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		trainingDetailsDao = mock(TrainingDetailsDao.class);
		trainingDetails1 = new TrainingDetails(82, 2, 11,
				sdf.parse("2014-12-02"), sdf.parse("2014-12-02"), "ELTP",
				"9:00", "12:00", "Ganesh", "cep");
		trainingDetails2 = new TrainingDetails(83, 2, 11,
				sdf.parse("2014-12-02"), sdf.parse("2014-12-02"), "ELTP",
				"9:00", "12:00", "Ganesh", "cep");

		when(trainingDetailsDao.getTrainingDetails(82)).thenReturn(Arrays.asList(trainingDetails1, trainingDetails2));
		doNothing().when(trainingDetailsDao).deleteTrainingDetails((isA(Long.class)));
		trainingDetailsDao.deleteTrainingDetails(0);
		verify(trainingDetailsDao, times(1)).deleteTrainingDetails(0);

		when(trainingDetailsDao.showTrainingid(sdf.parse("2014-12-02"),"9:00", 11)).thenReturn((long) 82);
		doNothing().when(trainingDetailsDao).insertTrainingDetails((isA(TrainingDetails.class)));
		
		trainingDetailsDao.insertTrainingDetails(trainingDetails1);
		verify(trainingDetailsDao, times(1)).insertTrainingDetails(trainingDetails1);

		when(trainingDetailsDao.isRoomAvailable(11,sdf.parse("2014-12-02"), sdf.parse("2014-12-02"),"9:00", "12:00")).thenReturn(true);

	}
	@Test
	public void testIsRoomAvailable() throws ParseException{		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		assertEquals(true, trainingDetailsDao.isRoomAvailable(11,sdf.parse("2014-12-02"), sdf.parse("2014-12-02"),"9:00", "12:00"));
	}
	
	
	@Test
	public void testShowTrainingid() throws ParseException {	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		assertEquals(82, trainingDetailsDao.showTrainingid(sdf.parse("2014-12-02"),"9:00", 11));
		
	}
	
	@Test
	public void testGetTrainingDetails() {
		// TODO Auto-generated method stub
		
		List<TrainingDetails> trainingDetailsList = null;
		trainingDetailsList = trainingDetailsDao.getTrainingDetails(82);
		assertNotNull(trainingDetailsList);
		assertEquals((long)trainingDetails1.getTrainingID(), (long)trainingDetailsList.get(0).getTrainingID());
		assertEquals((long)trainingDetails2.getTrainingID(), (long)trainingDetailsList.get(1).getTrainingID());

	}
	
	
	

	

}
