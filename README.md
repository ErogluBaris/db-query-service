# db-query-service

This project shows that how to query a database via a json request.<br><br>
Instead of executing SQL queries or using Spring Data JPA methods,
basic JSON request transforms the SQL query like the following.

JSON request:
```
    {
        "filterList": [
            {
                "name": "team",
                "value": "Celtics",
                "operation": "EQUALS"
            }
        ]
    }
```

Executed SQL:
```
    SELECT * FROM PLAYER WHERE TEAM = 'CELTICS';
```

With the help of Spring Data Specification, we don't have to manually do that
transforming process. <br>
Inside the project, there are classes for every query type to filter
in SQL. By using Factory Design Pattern, we can easily find
which operation/operations will be executed.

For basic queries, of course Spring Data JPA is better. However, in complex 
solutions Data JPA methods will be really difficult to read and unclear.
So, we should use Spring Data Specification API when we are dealing with
complex database queries.