package pl.wszib.pizzamarket2.data.entities;

import javax.persistence.*;

    @Entity
    @Table(name = "ingredients")
    public class IngredientEntity {
        @Id
        @GeneratedValue
        @Column(name = "id")
        private Long id;
        @Column(name = "name")
        private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
