package com.apiautomation.cucumber.utils.NewBookingEnginePayloads;

public class CreateBookingPayload {

    public static String create_booking_payload()
    {
        String createbooking = "{\n" +
                "  \"service_code\": \"CK\",\n" +
                "  \"service_location_code\":\"DXB\",\n" +
                "  \"customer_id\":56203,\n" +
                "  \"contact_information\": {\n" +
                "    \"personName\": \"Mariam\",\n" +
                "    \"personLastName\": \"Hammad\",\n" +
                "    \"personEmail\": \"mariam.hammad@venturedive.com\",\n" +
                "    \"personPhone\": \"+971333222111\"\n" +
                "  },\n" +
                "  \"address\": {\n" +
                "    \"line1\": \"\",\n" +
                "    \"line2\": \"\",\n" +
                "    \"city_id\": \"1\",\n" +
                "    \"area_id\": \"76\",\n" +
                "    \"building\": \"OceanAce Towers\",\n" +
                "    \"apartment\": \"A100\"\n" +
                "  },\n" +
                "  \"voucher_code\":\"\",\n" +
                "  \"description\":\"Please send a professional and experienced cleaner with a good track record\",\n" +
                "  \"booking\":{\n" +
                "    \"price_plan_id\":55,\n" +
                "    \"start_date\":\"2019-01-13\",\n" +
                "    \"frequency\":\"ONCE\",\n" +
                "    \"time\":\"10:30:00\",\n" +
                "    \"number_of_week_days\":[2],\n" +
                "\t\"service_detail\":{\n" +
                "\t\t\"property_type\":\"apartment\",\n" +
                "\t\t\"no_of_rooms\": \"2\"\n" +
                "\t}\n" +
                "  },\n" +
                "  \"payment\": {\n" +
                "    \"paymentMethod\": \"CASH_ON_DELIVERY\"\n" +
                "  }\n" +
                "}";

        return createbooking;
    }

}
