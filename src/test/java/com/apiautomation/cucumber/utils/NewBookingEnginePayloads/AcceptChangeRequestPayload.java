package com.apiautomation.cucumber.utils.NewBookingEnginePayloads;

public class AcceptChangeRequestPayload {

    public static String accept_changerequest_payload ()
    {
        String acceptchangerequest = "{\n" +
                "\t\"service_code\":\"CK\",\n" +
                "\t\"booking_change_request_id\":8,\n" +
                "\t\"updater_comment\":\"some updation comment\"\n" +
                "}";

        return acceptchangerequest;
    }
}
