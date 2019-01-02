package com.apiautomation.cucumber.utils.NewBookingEnginePayloads;

public class UpdateBookingEventStatusPayload {

    public static String update_bookingevent_status_payload ()
    {
        String updatebookingeventstatus = "{\n" +
                "    \"cancellationReason\": \"string\",\n" +
                "    \"comments\": \"string\",\n" +
                "    \"deliveryTimeInUtc\": \"01:00\",\n" +
                "    \"eventId\": 173618,\n" +
                "    \"requestedBy\": \"partner\",\n" +
                "    \"statusId\": 75\n" +
                "  }";

        return updatebookingeventstatus;
    }
}
