package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import com.example.sdk.SdkService;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

	private static final String ZOOKEEPER_HOSTS = "ZOOKEEPER_HOSTS";
	private static final String zookeeperHosts;

	@Autowired SdkService sdkService;

	static {
		zookeeperHosts = System.getenv(ZOOKEEPER_HOSTS);
		System.out.println(zookeeperHosts);
	}

	public void process() {
		sdkService.process();
	}
}
