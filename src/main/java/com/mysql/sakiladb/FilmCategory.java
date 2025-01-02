package com.mysql.sakiladb;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="film_category")
public class FilmCategory {

	@EmbeddedId
	private FilmCategoryKey id;
	
	@ManyToOne
	@MapsId("filmId")
	@JoinColumn(name="film_id")
	private Film film;
	
	@ManyToOne
	@MapsId("categoryId")
	@JoinColumn(name="category_id")
	private Category category;
	
	@Column(name = "last_update")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdate;

	public FilmCategoryKey getId() {
		return id;
	}

	public void setId(FilmCategoryKey id) {
		this.id = id;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, film, id, lastUpdate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FilmCategory other = (FilmCategory) obj;
		return Objects.equals(category, other.category) && Objects.equals(film, other.film)
				&& Objects.equals(id, other.id) && Objects.equals(lastUpdate, other.lastUpdate);
	}

	@Override
	public String toString() {
		return "FilmCategory [id=" + id + ", film=" + film + ", category=" + category + ", lastUpdate=" + lastUpdate
				+ "]";
	}
}
