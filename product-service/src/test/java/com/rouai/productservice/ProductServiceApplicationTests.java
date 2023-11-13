//package com.rouai.productservice;
//
//import com.rouai.productservice.dto.ProductRequest;
//import com.rouai.productservice.repository.ProductRepository;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.DynamicPropertyRegistry;
//import org.springframework.test.context.DynamicPropertySource;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.testcontainers.containers.MongoDBContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.math.BigDecimal;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@SpringBootTest
//@Testcontainers
//@AutoConfigureMockMvc
//@ContextConfiguration(classes = TestConfiguration.class)
//class ProductServiceApplicationTests {
//	@Autowired
//	private MockMvc mockMvc;
//	@Autowired
//	private ProductRepository productRepository;
//
//	ObjectMapper objectMapper = new ObjectMapper();
////	@Autowired
////	private ObjectMapper objectMapper;//convert from objrct to json and json to object
//	@Container
//static MongoDBContainer mongoDBContainer = new MongoDBContainer( "mongo:7.0.2");
//	@DynamicPropertySource
//	static  void setProperties (DynamicPropertyRegistry dynamicPropertyRegistry){
////		dynamicPropertyRegistry.add("spring.data.mongodb.uri",mongoDBContainer::getReplicaSetUrl);
//		dynamicPropertyRegistry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
//	}
////	@Test
////	void shouldCreateProduct() throws Exception {
////		ProductRequest productRequest = getProductRequest();
////		String productRequestString = objectMapper.writeValueAsString(productRequest);//convertir l'valeur  en string
////		mockMvc.perform(MockMvcRequestBuilders.post( "/api/product")
////						.contentType(MediaType.APPLICATION_JSON)
////						.content(productRequestString))
////				.andExpect(status().isCreated());
////		Assertions.assertEquals(1, productRepository.findAll().size());
//////we should insert string variable
////	}
////
////	private ProductRequest getProductRequest() {
////		return ProductRequest.builder()
////				.name("iPhone 13")
////				.description("iPhone 13")
////				.price(BigDecimal.valueOf(1200))
////				.build();
////	}
//@Test
//void shouldCreateProduct() throws Exception {
//	ProductRequest productRequest = getProductRequest();
//	String productRequestString = objectMapper.writeValueAsString(productRequest);
//	mockMvc.perform(MockMvcRequestBuilders.post("/api/product")
//					.contentType(MediaType.APPLICATION_JSON)
//					.content(productRequestString))
//			.andExpect(status().isCreated());
//	Assertions.assertEquals(1, productRepository.findAll().size());
//}
//
//	private ProductRequest getProductRequest() {
//		return ProductRequest.builder()
//				.name("iPhone 13")
//				.description("iPhone 13")
//				.price(BigDecimal.valueOf(1200))
//				.build();
//	}
//
//
//
//}
