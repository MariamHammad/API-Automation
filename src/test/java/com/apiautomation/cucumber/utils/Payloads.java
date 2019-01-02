package com.apiautomation.cucumber.utils;

public class Payloads {

	
public static String copy_booking_payload()
	
	{
	
	
		String copybooking = "{\r\n" + 
        		"	\"householdRequestModel\": {\r\n" + 
        		"		\"coupon\": \"\",\r\n" + 
        		"		\"paymentIsEditable\": \"1\",\r\n" + 
        		"		\"createCleaningBooking\": \"Copy\",\r\n" + 
        		"		\"isBooking\": 1,\r\n" + 
        		"		\"serviceLocationIdsToAdd\": [\"1\"],\r\n" + 
        		"		\"planId\": \"5\",\r\n" + 
        		"		\"bookingDetails\": {\r\n" + 
        		"			\"bookingPaymentDetail\": {\r\n" + 
        		"				\"paymentMethod\": \"CREDIT_CARD\",\r\n" + 
        		"				\"creditCardId\": \"8\",\r\n" + 
        		"				\"isPaymentMethodVerified\": true\r\n" + 
        		"			},\r\n" + 
        		"			\"partTimeCleaningBookingModel\": {\r\n" + 
        		"				\"bookingStartDate\": \"2018-05-07\",\r\n" + 
        		"				\"bookingTime\": \"11:00\",\r\n" + 
        		"				\"hoursRequired\": \"8\",\r\n" + 
        		"				\"numberOfWorkers\": \"1\",\r\n" + 
        		"				\"requestFrequency\": \"240\",\r\n" + 
        		"				\"equipmentNeeded\": \"YES\",\r\n" + 
        		"				\"numberOfWeekDays\": [\"1\", \"2\"]\r\n" + 
        		"			},\r\n" + 
        		"			\"createCustomerProfile\": false\r\n" + 
        		"		},\r\n" + 
        		"		\"contactInformationModel\": {\r\n" + 
        		"			\"personName\": \"aroma gul\",\r\n" + 
        		"			\"personPhone\": \"+971456789876556\",\r\n" + 
        		"			\"personEmail\": \"aroma.gul@venturedive.com\"\r\n" + 
        		"		},\r\n" + 
        		"		\r\n" + 
        		"		\"creditCardId\": \"1447\",\r\n" + 
        		"		\"requestFrequency\": \"240\",\r\n" + 
        		"		\"numberOfWeekDays\": [\"1\", \"2\"],\r\n" + 
        		"		\"address\": {\r\n" + 
        		"			\"addressLine1\": \"\",\r\n" + 
        		"			\"addressLine2\": \"\",\r\n" + 
        		"			\"city\": \"1\",\r\n" + 
        		"			\"area\": \"75\",\r\n" + 
        		"			\"building\": \"dubai\",\r\n" + 
        		"			\"apartment\": \"1234\"\r\n" + 
        		"		},\r\n" + 
        		"		\"hoursRequired\": \"8\",\r\n" + 
        		"		\"numberOfWorkers\": \"2\",\r\n" + 
        		"		\"equipmentNeeded\": \"YES\",\r\n" + 
        		"		\"serviceIds\": [\"41\", \"105\", \"106\"],\r\n" + 
        		"		\"description\": \"\",\r\n" + 
        		"		\"bookingServiceProvidersModel\": {\r\n" + 
        		"			\"serviceProviderIds\": [\"203\", \"337\", \"353\", \"388\", \"391\", \"413\", \"443\", \"450\", \"468\", \"471\", \"482\", \"574\", \"673\", \"751\", \"829\", \"836\", \"890\"]\r\n" + 
        		"		},\r\n" + 
        		"		\"serviceRequestTime\": \"May 07, 2018 11:00\",\r\n" + 
        		"		\"customerId\": \"18560\"\r\n" + 
        		"	}\r\n" + 
        		"}";
	       
	  return copybooking;
            
            
            
	}
}
