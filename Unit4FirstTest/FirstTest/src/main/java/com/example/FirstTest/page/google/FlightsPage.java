package com.example.FirstTest.page.google;

import com.example.FirstTest.page.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class FlightsPage extends Base {
    @Autowired
    private SearchComponent searchComponent;

    @Value("${application.url}")
    private String url;


    public void goTo(){
        this.driver.get(url);
    }

    public SearchComponent getSearchComponent() {
        return searchComponent;
    }

    @Override
    public boolean isAt(){
        return this.searchComponent.isAt();
    }
}
