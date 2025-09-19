package bankapp.payload.notification.email.otp;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public record EmailNotificationPayload(

        @NotEmpty(message = "Email cannot be empty")
        @Email
        String recipientEmail,

        String subject,

        String htmlBody
) {
}
