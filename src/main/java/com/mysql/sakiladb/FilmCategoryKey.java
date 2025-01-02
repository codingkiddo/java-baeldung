package com.mysql.sakiladb;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class FilmCategoryKey {
	
	@Column(name = "film_id")
	private Short filmId;
	@Column(name = "category_id")
	private Byte categoryId;
	
	public Short getFilmId() {
		return filmId;
	}
	public void setFilmId(Short filmId) {
		this.filmId = filmId;
	}
	public Byte getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Byte categoryId) {
		this.categoryId = categoryId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(categoryId, filmId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FilmCategoryKey other = (FilmCategoryKey) obj;
		return Objects.equals(categoryId, other.categoryId) && Objects.equals(filmId, other.filmId);
	}
	@Override
	public String toString() {
		return "FilmCategoryKey [filmId=" + filmId + ", categoryId=" + categoryId + "]";
	}
}
