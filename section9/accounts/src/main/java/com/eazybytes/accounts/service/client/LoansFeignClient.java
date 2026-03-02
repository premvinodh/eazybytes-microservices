package com.eazybytes.accounts.service.client;

import com.eazybytes.accounts.dto.LoansDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <pre>
 * The "loans" parameter within the @FeignClient
 *      is the same name, we used to we have used to register with the Eureka Server.
 *      The feign client will connect with the Eureka server at runtime and
 *          it will try to get all the instance details with the logical name "loans"
 * </pre>
 */
@FeignClient("loans")
public interface LoansFeignClient {

    /**
     * This method signature has to match with the actual REST API method that we have defined inside the loans microservice.
     * If you go to the loans microservice, inside the LoansController, we have a method
     *      @GetMapping("/api/fetch")
     *     public ResponseEntity<LoansDto> fetchLoanDetails(@RequestParam
     *                                                      @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
     *                                                      String mobileNumber) {
     * So I need to create the very similar method inside my LOansFeignClient interface here
     *    Just copy the same signature here
     *          Remove the validation code - because the validations will be performed at the REST API level but not here
     */
    @GetMapping(value = "/api/fetch",consumes = "application/json")
    public ResponseEntity<LoansDto> fetchLoanDetails(@RequestParam String mobileNumber);
}
