package org.example;

import org.example.parser.sax.CompsSaxBuilder;

import java.io.IOException;

public class MainSax {

    public static void main(String[] args) throws IOException {
        CompsSaxBuilder saxBuilder=new CompsSaxBuilder();
        saxBuilder.buildSetComps("data\\comps.xml");
        System.out.println(saxBuilder.getComps());

    }



}
