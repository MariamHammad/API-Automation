package com.apiautomation.cucumber.utils.NewBookingEnginePayloads;

public class BookingAcceptRejectPayload {

    public static String accept_reject_payload ()
    {
        String bookingacceptreject = "{\n" +
                "  \"bookingConfirmationId\": 672290,\n" +
                "  \"comments\": \"\",\n" +
                "  \"rejectionReasonDataValueId\": 0,\n" +
                "  \"rejectionReasonText\": \"\",\n" +
                "  \"requestedBy\": \"Mariam\",\n" +
                "  \"statusId\": 80\n" +
                "}";

        return bookingacceptreject;
    }
}
