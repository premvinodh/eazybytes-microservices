package com.eazybytes.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    /**
     * For the resourceName like accounts we can't find the fieldName mobileNumber with the fieldValue say 9052417300
     * We are displaying a detailed error message -
     *      that we are trying to fetch account details based on the
     *      mobileNumber field and
     *      the actual mobile number value, and we are not able to find it.
     *
     * @param resourceName - like accounts or customer
     * @param fieldName - like mobileNumber field
     * @param fieldValue - mobileNumber value or the actual mobile number
     */
    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
        super(String.format("%s not found with the given input data %s : '%s'", resourceName, fieldName, fieldValue));
    }
}
