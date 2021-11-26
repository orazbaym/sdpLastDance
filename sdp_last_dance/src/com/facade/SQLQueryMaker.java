package com.facade;

public class SQLQueryMaker {
    private final ISQLQuery query;


    public SQLQueryMaker() {
        query = new SQLQuery ();
    }


    public void SQLQuery() {
        query.query ();
    }
}
