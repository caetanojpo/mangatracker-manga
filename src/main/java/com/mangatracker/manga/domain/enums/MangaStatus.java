package com.mangatracker.manga.domain.enums;

import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum MangaStatus {
    ONGOING, COMPLETED, HIATUS, CANCELLED;

    private static final Map<String, MangaStatus> STATUS_MAP = Stream.of(values())
            .collect(Collectors.toUnmodifiableMap(status -> status.name().toLowerCase(), status -> status));

    public static MangaStatus fromString(String status) {
        Objects.requireNonNull(status, "Status cannot be null");
        MangaStatus mangaStatus = STATUS_MAP.get(status.toLowerCase());
        if (mangaStatus == null) {
            throw new IllegalArgumentException("Unknown status: " + status);
        }
        return mangaStatus;
    }
}
