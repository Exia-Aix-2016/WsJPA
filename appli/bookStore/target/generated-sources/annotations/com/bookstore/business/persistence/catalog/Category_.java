package com.bookstore.business.persistence.catalog;

import com.bookstore.business.persistence.catalog.Book;
import com.bookstore.business.persistence.catalog.Category;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-09T11:08:03")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile ListAttribute<Category, Book> books;
    public static volatile SingularAttribute<Category, String> description;
    public static volatile SingularAttribute<Category, Category> parentCategory;
    public static volatile SingularAttribute<Category, Long> id;
    public static volatile SingularAttribute<Category, String> title;

}