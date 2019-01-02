package com.apiautomation.cucumber.utils.NewBookingEnginePayloads;

public class RejectChangeRequestPayload {

    public static String reject_changerequest_payload ()
    {
        String rejectchangerequest = "{\n" +
                "\t\"service_id\":82,\n" +
                "\t\"service_code\":\"CK\",\n" +
                "\t\"booking_change_request_id\":9,\n" +
                "\t\"updater_comment\":\"some updation comment\"\n" +
                "}";

        return rejectchangerequest;
    }
}
