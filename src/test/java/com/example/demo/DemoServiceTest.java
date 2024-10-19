package com.example.demo;

//import com.example.sdk.SdkService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoServiceTest {
//    @Mock SdkService sdkService;
    @InjectMocks DemoService demoService;
    @Test
    void test() {

    }
}