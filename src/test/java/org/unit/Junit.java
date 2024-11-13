package org.unit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Junit {

	@BeforeClass
	public static void beforeclass() {
		System.out.println("beforeclass");
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("afterclass");
	}
	@Before
	public void before() {
		System.out.println("before");
	}
	@After
	public void after() {
		System.out.println("after");
	}
	@Test
	public void test() {
		System.out.println("test");

	}
	
}
