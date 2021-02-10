package com.example.application.views.about;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.example.application.views.main.MainView;
import com.vaadin.flow.router.RouteAlias;

@Route(value = "", layout = MainView.class)
@PageTitle("Hacker News")
@CssImport("./styles/views/about/about-view.css")
public class AboutView extends Div {

    public AboutView() {
        addClassName("home");
        Image image = new Image("https://volument.com/blog/img/hn-dirt-big.png", "DummyImage");
        image.setWidthFull();
        image.addClassName("hacker-image");
        add(image);
        add(new Text("News Contents"));
    }

}
