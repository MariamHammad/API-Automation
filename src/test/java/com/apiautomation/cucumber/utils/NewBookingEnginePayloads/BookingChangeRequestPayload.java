package com.apiautomation.cucumber.utils.NewBookingEnginePayloads;

public class BookingChangeRequestPayload {

    public static String change_request_payload()
    {
        String changerequest = "{\n" +
                "  \"booking_id\": 48281,\n" +
                "   \"new_data\": {\n" +
                "\t  \t\"booking_data\":{\n" +
                "\t  \t\t\"start_date\": \"2019-01-13\",\n" +
                "\t  \t\t\"time\": \"16:00:00\",\n" +
                "\t  \t\t\"service_detail\": {\"no_of_rooms\": 2,\n" +
                "\t  \t\t\"property_type\": \"apartment\"}\n" +
                "\t\t}\n" +
                "  \t},\n" +
                "  \"creator_comment\": \"Please change the date and time of the booking....\",\n" +
                "  \"service_id\": 82,\n" +
                "  \"service_code\": \"CK\"\n" +
                "}";

        return changerequest;
    }

}
