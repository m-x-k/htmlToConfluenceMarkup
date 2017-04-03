package com.mxk.convert.confluence;

import org.eclipse.mylyn.wikitext.confluence.internal.ConfluenceDocumentBuilder;
import org.eclipse.mylyn.wikitext.parser.HtmlParser;
import org.xml.sax.InputSource;

import java.io.*;
import java.util.Scanner;

public class ConvertToConfluence {

    public static String convertHTML(File file) throws FileNotFoundException {

        StringWriter writer = new StringWriter();
        ConfluenceDocumentBuilder builder = new ConfluenceDocumentBuilder(writer);
        HtmlParser parser = new HtmlParser();
        InputStream in = new FileInputStream(file);
        InputSource inputSource = new InputSource(new InputStreamReader(in));

        try {
            parser.parse(inputSource, builder);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return writer.toString();
    }


    public static void main(String args[]) throws Exception {
        if (args.length < 1)
            throw new RuntimeException("Requires full file path as argument!");

        System.out.println(convertHTML(new File(args[0])));
    }
}