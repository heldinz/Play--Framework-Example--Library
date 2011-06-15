package models;

import javax.persistence.Entity;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Book extends Model {

    @Required
    public String title;

    @Required
    public String author;

    public boolean isCheckedOut = false;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book checkOut() {
        isCheckedOut = true;
        this.save();
        return this;
    }
}
