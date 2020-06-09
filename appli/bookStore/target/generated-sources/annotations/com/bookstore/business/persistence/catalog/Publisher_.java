package com.bookstore.business.persistence.catalog;

import com.bookstore.business.persistence.catalog.Address;
import com.bookstore.business.persistence.catalog.Book;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-09T11:08:03")
@StaticMetamodel(Publisher.class)
public class Publisher_ { 

    public static volatile SingularAttribute<Publisher, Address> address;
    public static volatile ListAttribute<Publisher, Book> books;
    public static volatile SingularAttribute<Publisher, String> name;
    public static volatile SingularAttribute<Publisher, Long> id;

}