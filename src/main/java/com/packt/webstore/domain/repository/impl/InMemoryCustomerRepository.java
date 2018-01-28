// package com.packt.webstore.domain.repository.impl;

// import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
// import com.packt.webstore.domain.repository.impl.InMemoryOrderRepository;
// import org.springframework.beans.factory.annotation.Autowired;

// @Repository
// public class InMemoryCustomerRepository implements CustomerRepository{

// 	@Autowired
// 	private NamedParameterJdbcTemplate jdbcTemplate;

// 	public long saveCustomer(Customer customer){

// 		@Autowired
// 		InMemoryOrderRepository inMemoryOrderRepository;
// 		long customerId = InMemoryOrderRepository.saveCustomer(customer);

// 		return customerId;
// 	}


// 	public Customer getCustomer(String customerId){

// 		String SQL = "SELECT * FROM CUSTOMER WHERE ID = :id";
// 		Map<String, Object> params = new HashMap<>();
// 		params.put("id", id);

// 		CartMapper cartMapper = new CartMapper(jdbcTemplate, productService);

// 		try{
// 			return jdbcTemplate.queryForObject(SQL, params, cartMapper);
// 		}catch(EmptyResultDataAccessException e){
// 			return null;
// 		}
// 	}


// 	public Boolean isCustomerExist(String customerId){


// 		isCustomerExist(order.customer.customerId


		

// 		if(customerId)







// // 	}



// // 	private static final class CustomerMapper implements RowMapper<Consumer>{
// // 		public Consumer mapRow(ResultSet rs, int rowNum) throws SQLException{
// // 			Customer customer = new Customer();
// // 			customer.setCustomerId(rs.getString("ID"));
// // 			product.setName(rs.getString("NAME"));
// // 			product.setDescription(rs.getString("DESCRIPTION"));
// // 			product.setUnitPrice(rs.getBigDecimal("UNIT_PRICE"));
// // 			product.setManufacturer(rs.getString("MANUFACTURER"));
// // 			product.setCategory(rs.getString("CATEGORY"));
// // 			product.setCondition(rs.getString("CONDITION"));
// // 			product.setUnitsInStock(rs.getLong("UNITS_IN_STOCK"));
// // 			product.setUnitsInOrder(rs.getLong("UNITS_IN_ORDER"));
// // 			product.setDiscontinued(rs.getBoolean("DISCONTINUED"));
// // 			return product;
// // 		}
// // 	}




// // }

