package wqyeo.cappucrypt.records;

import jakarta.annotation.Nullable;

import java.util.List;

public record EncryptionResult(
        String status,
        String id,
        @Nullable String encryptedContent,
        List<String> messages,
        List<String> notes
) { }
