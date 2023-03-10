package demo.microservices.customers.models;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {

	private UUID id;
	private String name;
	private String lastname;
	private String address;
	
}
