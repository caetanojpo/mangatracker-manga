package com.mangatracker.manga.domain.entities;

import com.mangatracker.manga.domain.enums.MangaStatus;

import java.util.*;

public class Manga {
    private final String id;
    private final String title;
    private final List<String> altTitles;
    private final List<String> description;
    private final MangaStatus status;
    private final int year;
    private final Set<String> genres;
    private final String originalLanguage;
    private final String demographic;
    private final String contentRating;
    private final List<String> tags;
    private final Map<String, String> links;
    private final List<String> availableTranslatedLanguages;
    private final String lastVolume;
    private final String lastChapter;
    private final boolean isLocked;
    private final String state;

    public Manga(String id, String title, List<String> altTitles, List<String> description, MangaStatus status, int year,
                 Set<String> genres, String originalLanguage, String demographic, String contentRating,
                 List<String> tags, Map<String, String> links, List<String> availableTranslatedLanguages,
                 String lastVolume, String lastChapter, boolean isLocked, String state) {

        this.id = Objects.requireNonNull(id, "ID cannot be null");
        this.title = Objects.requireNonNull(title, "Title cannot be null");
        this.altTitles = List.copyOf(Objects.requireNonNull(altTitles, "Alternative titles cannot be null"));
        this.description = List.copyOf(Objects.requireNonNull(description, "Description cannot be null"));
        this.status = Objects.requireNonNull(status, "Status cannot be null");
        this.year = year;
        this.genres = Set.copyOf(Objects.requireNonNull(genres, "Genres cannot be null"));
        this.originalLanguage = Objects.requireNonNull(originalLanguage, "Original language cannot be null");
        this.demographic = Objects.requireNonNull(demographic, "Demographic cannot be null");
        this.contentRating = Objects.requireNonNull(contentRating, "Content rating cannot be null");
        this.tags = List.copyOf(Objects.requireNonNull(tags, "Tags cannot be null"));
        this.links = Map.copyOf(Objects.requireNonNull(links, "Links cannot be null"));
        this.availableTranslatedLanguages = List.copyOf(Objects.requireNonNull(availableTranslatedLanguages, "Available translated languages cannot be null"));
        this.lastVolume = lastVolume;
        this.lastChapter = lastChapter;
        this.isLocked = isLocked;
        this.state = Objects.requireNonNull(state, "State cannot be null");
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAltTitles() {
        return altTitles;
    }

    public List<String> getDescription() {
        return description;
    }

    public MangaStatus getStatus() {
        return status;
    }

    public int getYear() {
        return year;
    }

    public Set<String> getGenres() {
        return genres;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getDemographic() {
        return demographic;
    }

    public String getContentRating() {
        return contentRating;
    }

    public List<String> getTags() {
        return tags;
    }

    public Map<String, String> getLinks() {
        return links;
    }

    public List<String> getAvailableTranslatedLanguages() {
        return availableTranslatedLanguages;
    }

    public Optional<String> getLastVolume() {
        return Optional.ofNullable(lastVolume);
    }

    public Optional<String> getLastChapter() {
        return Optional.ofNullable(lastChapter);
    }

    public boolean isLocked() {
        return isLocked;
    }

    public String getState() {
        return state;
    }

    // Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return year == manga.year &&
                isLocked == manga.isLocked &&
                id.equals(manga.id) &&
                title.equals(manga.title) &&
                altTitles.equals(manga.altTitles) &&
                description.equals(manga.description) &&
                status == manga.status &&
                genres.equals(manga.genres) &&
                originalLanguage.equals(manga.originalLanguage) &&
                demographic.equals(manga.demographic) &&
                contentRating.equals(manga.contentRating) &&
                tags.equals(manga.tags) &&
                links.equals(manga.links) &&
                availableTranslatedLanguages.equals(manga.availableTranslatedLanguages) &&
                Objects.equals(lastVolume, manga.lastVolume) &&
                Objects.equals(lastChapter, manga.lastChapter) &&
                state.equals(manga.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, altTitles, description, status, year, genres, originalLanguage, demographic,
                contentRating, tags, links, availableTranslatedLanguages, lastVolume, lastChapter, isLocked, state);
    }

    // ToString
    @Override
    public String toString() {
        return "Manga{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", altTitles=" + altTitles +
                ", description=" + description +
                ", status=" + status +
                ", year=" + year +
                ", genres=" + genres +
                ", originalLanguage='" + originalLanguage + '\'' +
                ", demographic='" + demographic + '\'' +
                ", contentRating='" + contentRating + '\'' +
                ", tags=" + tags +
                ", links=" + links +
                ", availableTranslatedLanguages=" + availableTranslatedLanguages +
                ", lastVolume='" + lastVolume + '\'' +
                ", lastChapter='" + lastChapter + '\'' +
                ", isLocked=" + isLocked +
                ", state='" + state + '\'' +
                '}';
    }
}
