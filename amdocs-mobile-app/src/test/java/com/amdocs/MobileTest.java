package com.amdocs;

import static org.junit.Assert.*;
import org.mockito.Mockito;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MobileTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStartPhotoAppWhenCameraOnFunctionsNormally() {
		//fail("Not yet implemented");
		
		//mocking 
		Camera mockedCamera= Mockito.mock(Camera.class);
		
		//sutubbing - hardcoding the response of dependent method
		Mockito.when(mockedCamera.on()).thenReturn(true);
		
		Mobile mobile =new Mobile(mockedCamera);
		boolean actualResponse= mobile.startphotoApp();
		boolean expectedResponse =true;
		assertEquals(expectedResponse, actualResponse);
		//verify the camera
		Mockito.verify(mockedCamera ,Mockito.times(1)).on();
	}

}
