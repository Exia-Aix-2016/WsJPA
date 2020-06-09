package com.bookstore.business.persistence.catalog;

import com.bookstore.business.persistence.catalog.Category;
import com.bookstore.business.persistence.catalog.Publisher;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-09T11:08:03")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, Date> date;
    public static volatile SingularAttribute<Book, String> summary;
    public static volatile SingularAttribute<Book, Publisher> publisher;
    public static volatile SingularAttribute<Book, Long> id;
    public static volatile ListAttribute<Book, Category> categories;
    public static volatile SingularAttribute<Book, String> title;

}