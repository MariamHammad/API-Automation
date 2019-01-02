package com.apiautomation.cucumber.utils.NewBookingEnginePayloads;

public class CustomerRegistrationPayload {

    public static String customer_registration_payload()

    {


        String customerregistration = "{\n" +
                "  \"email\": \"mariam.hammad@venturedive.com\",\n" +
                "  \"firstName\": \"Mariam\",\n" +
                "  \"lastName\": \"Hammad\",\n" +
                "  \"password\": \"test\"\n" +
                "}";

        return customerregistration;
    }

}