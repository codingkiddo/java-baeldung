package com.mysql.sakiladb;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "film")
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "film_id")
	private Short filmId;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="release_year")
	private java.sql.Date release_year;
	
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	
	@ManyToOne
	@JoinColumn(name = "original_language_id")
	private Language originalLanguage;
	
	@Column(name="rental_duration")
	private Byte rentalDuration;
	
	@Column(name="rental_rate")
	private BigDecimal rentalRate;
	
	@Column(name="length")
	private Short length;
	
	@Column(name="replacement_cost")
	private BigDecimal replacementCost;
	
	@Column(name = "rating")
	private Character rating;
	
	@Column(name = "special_features")
	private Character specialFeatures;
	
	@Column(name = "last_update")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdate;

	@OneToMany(mappedBy = "film")
	private Set<FilmCategory> filmCategories = new HashSet<>();
	
	public Short getFilmId() {
		return filmId;
	}

	public void setFilmId(Short filmId) {
		this.filmId = filmId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public java.sql.Date getRelease_year() {
		return release_year;
	}

	public void setRelease_year(java.sql.Date release_year) {
		this.release_year = release_year;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Language getOriginalLanguage() {
		return originalLanguage;
	}

	public void setOriginalLanguage(Language originalLanguage) {
		this.originalLanguage = originalLanguage;
	}

	public Byte getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(Byte rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public BigDecimal getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(BigDecimal rentalRate) {
		this.rentalRate = rentalRate;
	}

	public Short getLength() {
		return length;
	}

	public void setLength(Short length) {
		this.length = length;
	}

	public BigDecimal getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(BigDecimal replacementCost) {
		this.replacementCost = replacementCost;
	}

	public Character getRating() {
		return rating;
	}

	public void setRating(Character rating) {
		this.rating = rating;
	}

	public Character getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(Character specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, filmId, language, lastUpdate, length, originalLanguage, rating, release_year,
				rentalDuration, rentalRate, replacementCost, specialFeatures, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return Objects.equals(description, other.description) && Objects.equals(filmId, other.filmId)
				&& Objects.equals(language, other.language) && Objects.equals(lastUpdate, other.lastUpdate)
				&& Objects.equals(length, other.length) && Objects.equals(originalLanguage, other.originalLanguage)
				&& Objects.equals(rating, other.rating) && Objects.equals(release_year, other.release_year)
				&& Objects.equals(rentalDuration, other.rentalDuration) && Objects.equals(rentalRate, other.rentalRate)
				&& Objects.equals(replacementCost, other.replacementCost)
				&& Objects.equals(specialFeatures, other.specialFeatures) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Film [filmId=" + filmId + ", title=" + title + ", description=" + description + ", release_year="
				+ release_year + ", language=" + language + ", originalLanguage=" + originalLanguage
				+ ", rentalDuration=" + rentalDuration + ", rentalRate=" + rentalRate + ", length=" + length
				+ ", replacementCost=" + replacementCost + ", rating=" + rating + ", specialFeatures=" + specialFeatures
				+ ", lastUpdate=" + lastUpdate + "]";
	}
	
}
