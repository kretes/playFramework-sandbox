package controllers;

import play.*;
import play.data.validation.Required;
import play.mvc.*;

import java.util.*;

import models.*;

public class Offers extends Controller {

    public static void add(@Required final String name) {
    	System.out.println("wartość " + name);
    	if(validation.hasErrors()) {
            renderText("play error");
    	} else {
    		renderText("offer " + name);
    	}
    }

}